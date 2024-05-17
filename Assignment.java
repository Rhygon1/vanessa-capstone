import java.util.concurrent.TimeUnit;
import java.time.Duration;
import java.time.LocalDate;

public class Assignment {

    private String assignmentName;
    private LocalDate dueDate; 
    //private LocalDate currentDate = LocalDate.now(); <-- do this every time you compare dates
    private int ID; //randomly generated

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //BIG PROBLEM: HOW TO MAKE DATES IN JAVA
    }

    public Assignment(String assignment, int year, int month, int dayOfMonth) {
        assignmentName = assignment;
        dueDate = LocalDate.of(year, month, dayOfMonth);
        ID = (int)(Math.random()*100000000);
    }

    public String getAssignmentName() {
        return assignmentName;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public int getID() {
        return ID;
    }

    public void setAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
    }

    public void setDueDate(int year, int month, int dayOfMonth) {
        dueDate = LocalDate.of(year, month, dayOfMonth);
    }

    public long timeUntilDue() {
        long diffInMillies = Math.abs(Duration.between(dueDate, LocalDate.now()).toMillis());;
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
        return diff;
    }

}
