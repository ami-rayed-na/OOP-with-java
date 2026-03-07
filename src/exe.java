import java.util.Scanner;
public class exe {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the year");
        int year = scan.nextInt();

        new LeapYear(year);

        scan.close();
        
    }
    
}
