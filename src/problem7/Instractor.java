package problem7;

public class Instractor {
    int insID;
    String insName;
    String dept;
    String title;
    
    public Instractor(String name, String dept, String title, int id){
        this.insName=name;
        this.dept= dept;
        this.title=title;
        this.insID=id;
    }

    public void display(){
        System.out.println("=========================");
        System.out.println("Instractor ID: "+insID);
        System.out.println("Name: "+insName);
        System.out.println("Title: "+title);
        System.out.println("DEPARTMENT: "+dept);
        System.out.println("=========================");
    }
}
