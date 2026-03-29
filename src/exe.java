import java.util.Scanner;
public class exe {
    public static void main(String[] args){
    Scanner ptr = new Scanner(System.in); 
    Wallet3 obj1 = new Wallet3(500); 
    
    System.out.print("Enter the amount you want to deposit :");
    double amount= ptr.nextDouble();
    obj1.deposit(amount);

    System.out.print("Enter the amount you want to withdraw :");
    double w_amount= ptr.nextDouble();
    obj1.withdraw(w_amount);

    Wallet3 obj2 = new Wallet3(300); 
    
    System.out.print("Enter the amount you want to deposit :");
    double amount1= ptr.nextDouble();
    obj2.deposit(amount1);

    System.out.print("Enter the amount you want to withdraw :");
    double w_amount1= ptr.nextDouble();
    obj2.withdraw(w_amount1);

    obj1.printInfo();
    obj2.printInfo();

    ptr.close();
    }
}
