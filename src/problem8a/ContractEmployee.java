package problem8a;

public class ContractEmployee extends Employee {
    String projectName;
    double contractAmount;

    public ContractEmployee(int id, String name, String department, String projectName, double contractAmount){
        super(id, projectName, department);
        this.contractAmount=contractAmount;
        this.projectName=projectName;
    }

    public double calculatePay(){
        return contractAmount;
    }
    
}
