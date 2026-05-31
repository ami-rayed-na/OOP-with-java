package problem8a;

public class Main {
    public static void main(String[] args){
        Employee e1= new FullTimeEmployee(001, "kalam", "HR",5000);
        Employee e2= new PartTimeEmployee(002, "sadik", "Dev", 20, 200);
        Employee e3= new ContractEmployee(003, "abul mal", "QA", "internship", 10000);

        e1.display();
        e2.display();
        e3.display();
    } 
}
