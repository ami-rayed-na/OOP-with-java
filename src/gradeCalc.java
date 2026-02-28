public class gradeCalc {
    public static void grade(int a){
        if(a<40) {
            System.out.println("F");
            return;
        }
        else if (a>=40 && a<60){
            System.out.println("C+");
            return;
        }
        else if(a>=60 && a<70){
            System.out.println("B");
            return;
        }
        else if(a>=70 && a<80){
            System.out.println("A-");
            return;            
        }
        else if(a>=80 && a<90){
            System.out.println("A");
            return;            
        }
        else if(a>=90 && a<=100){
            System.out.println("A+");
            return;            
        }

        else {
            System.out.println("Invalid number");
            return;
        }
    }

    public static void main (String[] args){
        System.out.println("You got " + grade(39));
    }
}
