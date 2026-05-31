package problem8b;

public class Restaurant {
    String name;
    double foodPrice;
    double taxRate=0.10;
    

    public Restaurant(String name, double foodPrice, double taxRate){
        this.foodPrice=foodPrice;
        this.name=name;
        this.taxRate=taxRate;
    }

    public double calculateBill(){
        return foodPrice+(foodPrice*taxRate);
    }
    public double estimateDeliveryTime(){
        return 40;
    }

    public void display(){
        System.out.println("---------------------------");
        System.out.println("Order has placed for: "+name+"\nPrice of the food: "+foodPrice+"\nTax: "+taxRate+" \nTotal price:"+calculateBill()+" tk\nYou will get your order within :"+estimateDeliveryTime()+" min");
        System.out.println("---------------------------");
    }
}
