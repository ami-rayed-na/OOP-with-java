import java.util.Scanner;

public class circleArea {
    public static double areaOfCircle (int r){
        double PIE= 3.14;
        return PIE *Math.pow(r, 2);
    }

    public static void main (String[] args){
        Scanner obj= new Scanner(System.in);

        System.out.print("Enter the radius of circle: ");
        int r= obj.nextInt();
        System.out.println("Area of the circle is "+ areaOfCircle(r));

        obj.close();
    }
}
