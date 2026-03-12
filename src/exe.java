import java.util.Scanner;
public class exe {
    public static void main(String[] args){
        Scanner value = new Scanner(System.in);
        
        System.out.print("Enter a number:");
        int number= value.nextInt();

        IsPrime.tryNumber(number);
        value.close();        
    }
    
}
