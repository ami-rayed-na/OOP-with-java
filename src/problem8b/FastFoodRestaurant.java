package problem8b;

public class FastFoodRestaurant extends Restaurant{
    double taxRate=0.15;
    
    public FastFoodRestaurant(String name, double foodPrice){
        super(name,foodPrice,0.15);
    }
    public double estimateDeliveryTime(){
        return 20;
    } 
    public double calculateBill(){
        return foodPrice+(foodPrice*taxRate);
    }   
}
