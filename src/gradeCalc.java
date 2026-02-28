public class gradeCalc {
    public static String grade(int a){
        if(a<40) return "F";

        else if (a<60) return "C";

        else if(a<70) return "B";

        else if(a<80) return "A-";     

        else if(a<90) return "A";       

        else if(a<=100) return "A+";            

        else return "Invalid number";
    }

    public static void main (String[] args){
        
        System.out.println("You got " + grade(39));
    }
}
