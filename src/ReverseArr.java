import java.util.Scanner;
public class ReverseArr {
    public ReverseArr(){
        System.out.println("How many number in the series?");
        Scanner val= new Scanner(System.in);

        int n= val.nextInt();
        int[] arr= new int[n];
        int[] res= new int[n];

        System.out.println("Enter the number serially: ");
        for(int i=0; i<n; i++){
            arr[i]=val.nextInt();
        }

        for(int i=0; i<n; i++){
            res[i]=arr[n-i-1];
        }

        for(int i=0; i<n; i++){
            System.out.print(" "+res[i]);
        }
        
        val.close();
    }
}
