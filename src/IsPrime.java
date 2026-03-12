public class IsPrime {
    public static void tryNumber(int number){
        int c=0;
        for(int i=1; i<=number; i++){
            if(number%i==0) c++;
        }
        if(c==2)
            System.out.println(number+" is a prime number");
        else System.out.println(number+" is not a prime number.");
    }
}
