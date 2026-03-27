import java.util.Scanner;
public class Ecom {
    //String catagory;
    public void filtering(String catagory){
        //catagory=this.catagory;
        System.out.println("-----Searching item in "+catagory+"-----");
    }
    public void filtering(int max_val, int min_val){
        System.out.println("Searching in the range between :"+min_val+" and "+max_val+"-----");
    }
    public void filtering(String catagory, String brand){
        System.out.println("Searching iteam of "+catagory+" in "+brand+" brand-----");
    }
    public void filtering(String catagory, int min_val, int max_val){
        System.out.println("Searching item in "+catagory+" in the price range between: "+min_val+" and "+max_val+"-----");
    }
    public void filtering(String catagory, String brand, int min_val, int max_val){
        System.out.println("Sreaching item in "+catagory+" in "+brand+" brand, price between: "+min_val+" and "+max_val+"-----");
    }
    
}
