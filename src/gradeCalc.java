import java.util.Scanner;

public class gradeCalc {
    public static String grade(int a){
        if(a>100 || a<0) return "Invalid Number";

        else if(a<40) return "F";

        else if (a<60) return "C";

        else if(a<70) return "B";

        else if(a<80) return "A-";     

        else if(a<90) return "A";       

        else return "A+";
    }

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your result: ");
        int a= scan.nextInt();
        System.out.println("You got " + grade(a));

        scan.close();
    }
}
