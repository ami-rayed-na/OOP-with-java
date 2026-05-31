package problem7;

import java.util.ArrayList;
import java.util.List;

public class CourseOffering {
    int roomID, secNo, year;
    String date, sem;
    Student student;
    Instractor instractor;
    Course course;
    static List<CourseOffering> offer= new ArrayList<>();
    public CourseOffering(Student stu, Instractor ins, Course crs, int room, int sec, int yr, String date, String sem){
        this.student=stu;
        this.instractor=ins;
        this.course=crs;
        this.year=yr;
        this.roomID=room;
        this.secNo= sec;
        this.date=date;
        this.sem=sem;
    }

    public static void addNew(Student s, Instractor i, Course c, int room, int yr, int sec, String time, String sem){
        offer.add(new CourseOffering(s, i, c, room, sec, yr, time, sem));
        System.out.println("Enrolled: "+s.stuName+" in "+c.courseTitle+" by "+i.insName);
    }
    
    public void display(){
        System.out.println("-----------Details--------------");
        student.display();
        instractor.display();
        course.display();

        System.out.println("Time: "+date+"| Section:"+secNo+"| Room: "+roomID+"| Semester: "+sem+"| Year: "+year);
    }
}
