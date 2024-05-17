public class Test extends Assignment {

    int difficulty;
    public Test(String assignment, int year, int month, int dayOfMonth, int difficulty) {
        super(assignment, year, month, dayOfMonth);
        this.difficulty = difficulty;
        // TODO Auto-generated constructor stub
    }

    //uses an int difficulty instance variable to determine how many study sessions are needed
    //
    public void study() {
        difficulty--;
        if (difficulty==0) {
            //remove the test from the assignments ArrayList in Course class (may have to be a method in Course)
        }
    }

    //maybe completeAssignment can cover for this??
    public void clearTest() {
        difficulty = 0;
        //remove the test from assignments
    }

}