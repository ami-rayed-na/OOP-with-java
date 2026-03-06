import java.util.Scanner;

public class calculator {
    int add(int a, int b){
        return a+b;
    }
    public static int subst(int a, int b){
        return a-b;
    }
    int mult(int a, int b){
        return a*b;
    }
    public static double div(int a, int b){
        return (double) a/b;
    }

    public static void main(String[] args){
    Scanner obj = new Scanner(System.in);

    int a = obj.nextInt();
    int b= obj.nextInt();
    char c = obj.next().charAt(0);

    calculator casio = new calculator();

    double result;

    if(c=='+') result = casio.add(a, b);
    else if(c=='-') result = calculator.subst(a,b);
    else if(c=='*') result = casio.mult(a,b);
    else result = calculator.div(a,b);

    System.out.println("result is : " + result);

}

}

