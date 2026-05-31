package problem8a;

public class FullTimeEmployee extends Employee{
    double fixedSalary;
    
    public FullTimeEmployee(int id, String name, String department, double fixedSalary){
        super(id, name, department);
        this.fixedSalary=fixedSalary;
    }

    public double calculatePay(){
        return fixedSalary;
    }
}
