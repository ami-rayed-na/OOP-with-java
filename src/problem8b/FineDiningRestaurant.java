package problem8b;

public class FineDiningRestaurant extends Restaurant{
    public FineDiningRestaurant(String name, double foodPrice){
        super(name,foodPrice,0.1);
    }

    public double estimateDeliveryTime(){
        return 60;
    }
}
