public class Wallet3 {
    private double balance;
    private final int id;
    private static int counter;

    public int getID(){
        return this.id;
    }
    public double getBalance(){
        return this.balance;
    }

    public Wallet3(double starting_balance){
        counter++;
        this.id = counter;
        this.balance=starting_balance;
        System.out.println("Wallet#"+this.id+" : Your current balance is: "+this.balance);
    }

    public double deposit(double amount){
        if(amount<=0) {
            System.out.println("Are you kidding!! Dont wasate my time....");
            return this.balance;
        }

        this.balance+=amount;
        System.out.println("Wallet#"+this.id+": New balance is: "+(this.balance));
        return this.balance;
    }
    
    public double withdraw(double amount){
        if(amount>this.balance) {
            System.out.println("Are you kidding!! Dont wasate my time....");
            return this.balance;
        }

        this.balance-=amount;
        System.out.println("Wallet#"+this.id+": New balance is: "+(this.balance));
        return this.balance;
    }
    public void printInfo(){
        System.out.println("---------------------------");
        System.out.println("Wallet ID: "+this.id);
        System.out.println("Balance:   "+this.balance);
        System.out.println("----------------------------");
    }
}
