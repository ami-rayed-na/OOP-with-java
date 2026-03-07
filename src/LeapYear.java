public class LeapYear {
     public LeapYear(int year){
        
        if((year%400==0)||(year%4==0 && year%100!=0)) System.out.println("Leap year!!");
        else System.out.println("No, not a Leap year :(");
     }   
}
