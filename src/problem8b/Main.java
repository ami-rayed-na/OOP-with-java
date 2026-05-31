package problem8b;

public class Main {
    public static void main(String[] args){
        Restaurant r1= new FineDiningRestaurant("sadia", 250.50);
        Restaurant r2= new FastFoodRestaurant("tania", 320);

        r1.display();
        r2.display();
    }
    
}
