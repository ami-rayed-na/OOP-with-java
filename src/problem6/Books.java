package problem6;

import java.util.List;
import java.util.ArrayList;

public class Books {
    int bookID;
    String bookName;
    String bookAuthor;
    String yearOfPub;
    float price;
    String status;

    static int nextID=1;
    static List<Books> catalog = new ArrayList<>();

    public Books(String bookName, String bookAuthor, String yearOfPub, float price){
        this.bookAuthor= bookAuthor;
        this.bookName= bookName;
        this.yearOfPub= yearOfPub;
        this.price= price;
        this.bookID= nextID++;
        this.status= "available";
    }

    public static Books findByID(int id){
        for(Books boi: catalog) if(boi.bookID== id) return boi;
        return null; 
    }
    public static Books findByName(String name){
        for(Books boi: catalog) if(boi.bookName.equalsIgnoreCase(name)) return boi;
        return null;
    }

    public static void addNewBooks(String name, String Author, String Year, float price){
        catalog.add(new Books(name, Author, Year, price));
        System.out.println("BOOK ADDED : "+name);
    }
    public static void delBooks(int id){
        Books boi= findByID(id);
        if(boi!=null){
            catalog.remove(boi);
            System.out.println("BOOK REMOVED: "+ boi.bookName);
        }
    }
    public void displayBookDetails(){
        System.out.println("==========================");
        System.out.println("Book ID: "+bookID);
        System.out.println("Book Name: "+bookName);
        System.out.println("Book Author: "+bookAuthor);
        System.out.println("Publication Year: "+yearOfPub);
        System.out.println("Book Price: "+price);
        System.out.println("Status: "+status);
        System.out.println("==========================");
    }

    public static void inqueryBook(int id){
        Books boi= findByID(id);
        if(boi!= null) boi.displayBookDetails();
        else System.out.println("Book not found!!!");
    }
}
