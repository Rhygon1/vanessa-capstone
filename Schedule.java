import java.util.*;
public class Schedule {

    private String student;
    private int grade;
    private int stuID;
    private ArrayList<ArrayList<Course>> courseSchedule;

    public void setStudent(String name) {
        student = name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setStuID(int studentID) {
        stuID = studentID;
    }

    public Schedule(String nameOfStudent, int gradeOfStudent, int studentID) {
        student = nameOfStudent;
        grade = gradeOfStudent;
        stuID = studentID;
        ArrayList<Course> semOne = new ArrayList<Course>();
        ArrayList<Course> semTwo = new ArrayList<Course>();
        ArrayList<Course> extracurricular = new ArrayList<Course>();
        courseSchedule = new ArrayList<ArrayList<Course>>();        //whats an unchecked conversion
        courseSchedule.add(semOne);
        courseSchedule.add(semTwo);
        courseSchedule.add(extracurricular);
    }

    public void print() {
        System.out.println("Name: "+student);
        System.out.println("Grade: "+grade);
        System.out.println("Student ID: "+stuID);
        System.out.println(courseSchedule);
    }

    public ArrayList<ArrayList<Course>> addCourseSemOne(Course c){
        courseSchedule.get(0).add(c);
        return courseSchedule;
    }

    public ArrayList<ArrayList<Course>> addCourseSemTwo(Course c){
        courseSchedule.get(1).add(c);
        return courseSchedule;
    }

    public ArrayList<ArrayList<Course>> addExtracurricular(Course c){
        courseSchedule.get(2).add(c);
        return courseSchedule;
    }

    public ArrayList<ArrayList<Course>> removeCourse (Course c){
        for(int i=0; i<courseSchedule.size(); i++) {
            for(int j=0; j<courseSchedule.get(i).size();j++) {
                if (courseSchedule.get(i).get(j).equals(c))
                    courseSchedule.get(i).remove(j);
            }
        }
        return courseSchedule;
    }

    //might change to just print in order of # of assignments
    public ArrayList<ArrayList<Course>> sort(){
        //Sorts classes based on amount of assignments (using a method in each class to obtain the number of assignments??)
        return courseSchedule;
    }


}