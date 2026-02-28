public class convertTemp {
    public static double celsiusToFahrenheit(double c){
        return (9*c)/5+32;
    }
    public static double fahrenheitToCelsius(double f){
        return 5*(f-32)/9;
    }

    public static void main(String[] args){
        System.out.println("Temp at Fahrenheit is " + celsiusToFahrenheit(10));
        System.out.printf("Temp at celsius is %.2f", fahrenheitToCelsius(98));
    }
}
