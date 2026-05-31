package problem7;

public class Main {
    public void main(String[] args){
        Student s1= new Student("sakib", "CSE", 2023001);
        Student s2= new Student("sagor", "SWE", 2023002);

        Instractor i1= new Instractor("Pius", "CS", "Professor", 1991001);
        Instractor i2= new Instractor("akber", "Math", "Lecturer", 2003002);

        Course c1= new Course(333002, "Data Structure", "array, tree,graph,binary search", 3, "Introduction to programming language");
        Course c2=new Course(667012, "Linear Algebra", "Matrix, Vector", 2, "Calculus");

        CourseOffering.addNew(s2, i2, c2, 202, 2026, 1, "09:00", "3rd semester");
        CourseOffering.addNew(s1, i1, c1, 101, 2026, 2, "11:00", "2nd semester");
        CourseOffering.addNew(s2, i1, c1, 308, 2023, 1, "01:00", "5th semester");

        System.out.println();
        for(CourseOffering o: CourseOffering.offer) o.display();
    }
}
