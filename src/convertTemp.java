import java.util.Scanner;

public class convertTemp {
    public static double celsiusToFahrenheit(double c){
        return (9*c)/5+32;
    }
    public static double fahrenheitToCelsius(double f){
        return 5*(f-32)/9;
    }

    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);

        System.out.print("Enter the temp in celsius: ");
        double c = scan.nextDouble();
        System.out.println("Temp at Fahrenheit is " + celsiusToFahrenheit(c));

        System.out.print("Enter the temp in farenheit: ");
        double f = scan.nextDouble();
        System.out.printf("Temp at celsius is %.2f", fahrenheitToCelsius(f));
        
        scan.close();
    }
}
