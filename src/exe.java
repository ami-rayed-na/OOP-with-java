import java.util.Scanner;
public class exe {
    public static void main(String[] args){
    Scanner ptr = new Scanner(System.in); 
    Wallet2 obj = new Wallet2(500); 
    
    System.out.print("Enter the amount you want to deposit :");
    double amount= ptr.nextDouble();
    obj.deposit(amount);

    System.out.print("Enter the amount you want to withdraw :");
    double w_amount= ptr.nextDouble();
    obj.withdraw(w_amount);

    ptr.close();
    }
}
