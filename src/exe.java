import java.util.Scanner;
public class exe {
    public static void main(String[] args){
    Scanner ptr = new Scanner(System.in); 

    Ecom obj= new Ecom();

    System.out.print("Enter Catagory: ");
    String catagory= ptr.next();
    obj.filtering(catagory);

    System.out.print("Enter Maximum range of your budget: ");
    int max_val= ptr.nextInt();
    System.out.print("Enter Minimum range of your budget: ");
    int min_val= ptr.nextInt();
    obj.filtering(max_val,min_val);

    System.out.print("Enter Brand: ");
    String brand = ptr.next();
    obj.filtering(catagory,brand);

    obj.filtering(catagory,min_val,max_val);
    obj.filtering(catagory,brand,min_val,max_val);
    }    
}
