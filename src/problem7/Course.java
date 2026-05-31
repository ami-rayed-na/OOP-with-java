package problem7;

public class Course {
    int courseID;
    int credit;
    String courseTitle, syllabus, prereq;

    public Course(int id, String title, String syllabus, int credit, String prereq){
        this.courseID=id;
        this.courseTitle=title;
        this.syllabus=syllabus;
        this.credit=credit;
        this.prereq=prereq;
    }

    public void display(){
        System.out.println("=========================");
        System.out.println("Course Code: "+courseID);
        System.out.println("Course Title: "+courseTitle);
        System.out.println("Course credit: "+credit);
        System.out.println("Syllabus: "+syllabus);
        System.out.println("Prerequisite: "+prereq);
        System.out.println("=========================");
    }
    
}
