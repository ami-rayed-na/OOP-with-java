package problem8a;

public class Employee {
    String name;
    String department;
    int id;
    
    public Employee(int id, String name, String department){
        this.id=id;
        this.name=name;
        this.department=department;
    }
    public double calculatePay(){
        return 0;
    }

    public void display(){
        System.out.println("["+id+"] - "+name+" - "+department+" Pay: "+calculatePay());
    }
}
