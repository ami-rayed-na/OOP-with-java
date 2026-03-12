public class FiboSeries{
    public static void printFibo(int steps){
        int a=1,b=1,sum=0;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i=2; i<= steps; i++){
            sum=a+b;
            System.out.print(sum+" ");
            a=b;
            b=sum;
        } 
    }
}