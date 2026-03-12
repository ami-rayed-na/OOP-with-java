public class Bonus {

    public void giveHim(int target, int working_days, int bonus, double achieve_target, int attendence){

        if(achieve_target>= target*0.95){
            if(attendence== working_days){
                System.out.println("Congratulation!!, you got "+ bonus*0.6 +" tk as bonus");
            }
            else if(attendence>= working_days*0.9 && attendence!=working_days){
                System.out.println("Congratulation, you got "+ bonus*0.4 +" tk as bonus");
            }
        }
        else if(achieve_target>= target*0.8){
            if(attendence==working_days){
                System.out.println("Congratulation, you got "+ bonus*0.4 + "tk as bonus");
            }
            else if(attendence>=working_days*0.9 && attendence!=working_days){
                System.out.println("You got "+ bonus*0.2 +" tk as bonus. Kopal valo tre bonus disi, porer bar latthi marmu!!!");
            }
        }
        else{
            System.out.println("You got "+ bonus*0.05 + " tk as bonus. Sobai re ditachi deikha paisos, naile eibar e tre latthi martam");
        }

    }
}
