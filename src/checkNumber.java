public class checkNumber {
    public static void isPositive(int a){
        if(a>=0) {
            System.out.println("Number is positive");
            return;
        } 

        else{
            System.out.println("Number is negative");
            return;
        }
    }

    public static void isEven(int a){
        if(a%2==0){
            System.out.println("This is Even number");
            return;
        }
        else{
            System.out.println("This is Odd number");
            return;
        }
    }

    public static void main(String[] args){
        isPositive(10);
        isPositive(-5);
        isEven(4);
        isEven(9);
    }
}
