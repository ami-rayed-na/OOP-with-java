package problem7;

public class Student {
    int stuID;
    String stuName;
    String stuProgram;

    public Student(String name, String program, int id){
        this.stuID=id;
        this.stuName= name;
        this.stuProgram= program;
    }

    public void display(){
        System.out.println("===================");
        System.out.println("Student ID: "+stuID);
        System.out.println("Student Name: "+stuName);
        System.out.println("Program: "+stuProgram);
        System.out.println("===================");
    }
}
