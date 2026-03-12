import java.util.Scanner;
public class exe {
    public static void main(String[] args){
        Scanner value = new Scanner(System.in);
        
        System.out.print("Enter Steps:");
        int steps= value.nextInt();

        FiboSeries.printFibo(steps);
        value.close();        
    }
    
}
