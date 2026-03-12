import java.util.Scanner;
public class exe {
    public static void main(String[] args){
        Scanner details = new Scanner(System.in);
        System.out.print("Enter Target amount:");
        int target= details.nextInt();
        System.out.print("Enter total working day(s):");
        int working_days= details.nextInt();
        System.out.print("Enter Bonus amount:");
        int bonus= details.nextInt();
        System.out.print("Enter total sales:");
        double achieve_target= details.nextDouble();
        System.out.print("Enter attendence:");
        int attendence= details.nextInt();
        
        Bonus obj= new Bonus();
        obj.giveHim(target,working_days,bonus,achieve_target,attendence);

        details.close();        
    }
    
}
