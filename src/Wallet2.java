public class Wallet2 {
    private double balance;

    public Wallet2(double initial_balance){
        this.balance= initial_balance;
        System.out.println("Your current balance is: "+this.balance);
    }

    public double getBalance(){
        return this.balance;
    }

    public void deposit(double amount){
        if(amount<=0) System.out.println("Invalid amount!!!");
        this.balance= this.balance+amount;

        System.out.println("New Balance is "+this.balance);
    }

    public void withdraw(double amount){
        if(amount>this.balance) System.out.println("Insufficient Balance!!!");
        this.balance= this.balance-amount;

        System.out.println("New Balance is "+this.balance);
    }
    
}
