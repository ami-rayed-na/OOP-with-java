import java.util.Scanner;
public class exe {
    public static void main(String[] args){
    Scanner num= new Scanner(System.in); 
    System.out.println("Enter the value of n:");
    int n= num.nextInt();

    Pattern.patternPrint(n);
    
    num.close();
    }    
}
