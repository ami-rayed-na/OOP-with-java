public class Wallet {
    static double balance1=200,balance2=200;

    public void deposit(double balance, double amount){
        //this.balance=balance1;
        System.out.println("You have deposited "+amount+" and your current balance is: "+(balance+amount));
    }
    
    public void withdraw(double balance, double amount){
        if(amount>balance) {
            System.out.println("Insufficient balance!!");
        }  
        else System.out.println("You have withdrawed "+amount+" and your current balance is: "+(balance-amount));
    }
}
