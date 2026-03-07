package area_vloume;
import java.util.Scanner;

public class ballVloume {
    public static double volumeOfBall(int r){
        double PIE=3.14;
        return 4/3 * PIE * Math.pow(r,3); 
    }

    public static void main (String[] args){
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the value of Radius: ");
        int r= obj.nextInt();

        double ans= volumeOfBall(r);
        System.out.println("Volume of the ball is "+ ans);

        obj.close();
    }
}
