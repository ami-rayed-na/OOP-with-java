package problem8a;

public class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;
    
    public PartTimeEmployee(int id, String name, String department, double hourlyRate, int hoursWorked){
        super(id, name, department);
        this.hourlyRate=hourlyRate;
        this.hoursWorked=hoursWorked;
    }

    public double calculatePay(){
        return  hourlyRate*hoursWorked;
    }
}
