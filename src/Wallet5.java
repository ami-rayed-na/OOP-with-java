public class Wallet5 {
    private double balance;
    private final int id;
    private static int counter;
    private String mode;

    public int getID(){
        return this.id;
    }
    public double getBalance(){
        return this.balance;
    }
    public String getMode(){
        return this.mode;
    }

    public Wallet5(double starting_balance){
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
        this.mode="Normal";
        return this.balance;
    }

    public double withdraw(double amount, String withdraw_mode){
        if(amount>this.balance) {
            System.out.println("Are you kidding!! Dont wasate my time....");
            return this.balance;
        }

        this.balance-=amount;
        System.out.println("Wallet#"+this.id+": New balance is: "+(this.balance));
        System.out.println("Thank you for using "+withdraw_mode);
        this.mode=withdraw_mode;
        return this.balance;
    }

    public static void addBonus(double amount, Wallet5 wallet){
            if(amount>=0.7* wallet.balance) System.out.println("Congratulation!! You got a cashback offer");
            wallet.balance+=25;
            System.out.println("Wallet#"+wallet.id+": Bonus added!! New balance is: "+wallet.balance);
        }
    public void printInfo(){
        System.out.println("---------------------------");
        System.out.println("Wallet ID    : "+this.id);
        System.out.println("Balance      : "+this.balance);
        System.out.println("Withdraw Mode: "+this.mode);
        System.out.println("----------------------------");
    }
}
