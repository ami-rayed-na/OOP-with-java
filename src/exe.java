import java.util.Scanner;
public class exe {
    public static void main(String[] args){
        Scanner number = new Scanner(System.in);
        System.out.print("Last step of the series:");
        int limit= number.nextInt();

        new SimpleSeries();

        SimpleSeries.Odd.oddSeriesFor(limit);
        System.out.println();
        SimpleSeries.Odd.oddSeriesWhile(limit);
        System.out.println();
        SimpleSeries.Odd.oddSeriesDoWhile(limit);
        System.out.println();

        SimpleSeries.Even.evenSeriesFor(limit);
        System.out.println();
        SimpleSeries.Even.evenSeriesWhile(limit);
        System.out.println();
        SimpleSeries.Even.evenSeriesDoWhile(limit);
        
        number.close();        
    }
    
}
