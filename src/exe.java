import java.util.Scanner;
public class exe {
    public static void main(String[] args){
        Scanner number = new Scanner(System.in);
        System.out.println("Did you complete your semester?");
        System.out.println("Enter 1 for YES, 2 for NO.");
        int sayIt = number.nextInt();
        boolean complete_sem = (sayIt==1);
        System.out.print("Enter your CGPA:");
        double cg= number.nextDouble();

       // Medel obj = new Medel();
        Medel.throwMedelInHisFace(complete_sem,cg);

        number.close();        
    }
    
}
