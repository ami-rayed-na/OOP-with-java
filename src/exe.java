import java.util.Scanner;
public class exe {
    public static void main(String[] args){
        Scanner num= new Scanner(System.in);
        
        System.out.println("How many numbers are in series?");
        int n= num.nextInt();

        double[] arr= new double[n];
        System.out.println("Enter number serially:");

        for(int i=0; i<n; i++){
            arr[i]= num.nextDouble();
        }

        //Avg obj =new Avg();
        //obj.avgUsingArray(arr,n);
        System.out.println("Greatest number is: "+ FindMax.whoIsMax(arr,n));
        
        num.close();
    }
    
}
