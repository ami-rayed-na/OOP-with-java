import java.util.Scanner;
public class exe {
    public static void main(String[] args){
        Scanner number = new Scanner(System.in);
        System.out.print("Last step of the series:");
        int limit= number.nextInt();

        SeriesSum obj = new SeriesSum();
        
       // int res= oddSeries(limit);
        System.out.println("Sum of the odd series is: " + obj.oddSeries(limit) );
        System.out.println("Sum of the even series is: " + obj.evenSeries(limit) );        
        number.close();        
    }
    
}
