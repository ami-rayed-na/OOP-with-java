import java.util.Scanner;
public class exe {
    public static void main(String[] args){
    Scanner ptr = new Scanner(System.in); 
    Wallet5 obj1 = new Wallet5(500); 
    
    System.out.print("Enter the amount you want to deposit :");
    double amount= ptr.nextDouble();
    obj1.deposit(amount);

    System.out.print("Enter the amount you want to withdraw :");
    double w_amount= ptr.nextDouble();
    obj1.withdraw(w_amount);

    Wallet5 obj2 = new Wallet5(300); 
    
    System.out.print("Enter the amount you want to deposit :");
    double amount1= ptr.nextDouble();
    obj2.deposit(amount1);

    System.out.print("Enter the amount you want to withdraw :");
    double w_amount1= ptr.nextDouble();
    System.out.print("Please provide your withdraw method: ");
    String method= ptr.next();
    obj2.withdraw(w_amount1,method);

    Wallet5.addBonus(w_amount1, obj2);
    Wallet5.addBonus(w_amount, obj1);
    obj1.printInfo();
    obj2.printInfo();

    ptr.close();
    }
}
