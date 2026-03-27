import java.util.Scanner;
public class exe {
    public static void main(String[] args){
    Scanner ptr = new Scanner(System.in); 

    Wallet obj = new Wallet();
    System.out.print("Enter the amount you want to deposit: ");
    double amount= ptr.nextDouble();
    obj.deposit(Wallet.balance1,amount);

    System.out.print("Enter the amount you want to withdraw: ");
    double amount2= ptr.nextDouble();
    obj.withdraw(Wallet.balance2, amount2);

    ptr.close();
    }
}
