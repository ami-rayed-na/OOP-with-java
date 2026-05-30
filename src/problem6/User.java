package problem6;

import java.util.ArrayList;
import java.util.List;

public class User {
    int userID;
    String userName;
    String userAddress;
    int phnNumber;

    static int nextID=1;
    static List<User> list= new ArrayList<>();
    static List<Books> borrowed= new ArrayList<>(); 

    public User(String userName, String userAddress, int phnNumber){
        this.userID= nextID++;
        this.userName= userName;
        this.userAddress= userAddress;
        this.phnNumber= phnNumber;
    }

    public static User findByID(int id){
        for(User u: list) if(u.userID== id) return u;
        return null;
    }

    public static void addNewUser(String Name, String Address, int phn){
        list.add(new User(Name, Address, phn));
        System.out.println("user added: "+Name);
    }

    public static void delUser(int id){
        User u= findByID(id);
        if(u!=null) {
            list.remove(u);
            System.out.println("User removed: "+u.userName);
        }
    }
    public void updateDetails(String name, String address, int phn){
        this.userName= name;
        this.userAddress= address;
        this.phnNumber= phn;
        System.out.println("User updated: "+name);
    }
    public void returnBook(int bookID){
        Books boi= null;
        for(Books book: borrowed) if(book.bookID == bookID) {
            boi=book;
            break;
        }
        if(boi!=null){
            borrowed.remove(boi);
            boi.status="available";
            System.out.println("Retured Book :"+boi.bookName);
        }
    }
    public void borrowedBook(int bookId){
        Books boi= Books.findByID(bookId);
        if(boi!=null && boi.status.equals("available")){
        boi.status= "borrowed";
        borrowed.add(boi);
        System.out.println("Borrowed: "+boi.bookName+"By: "+userName);
        }
        else System.out.println("Book unavailable");
    }
    public void bookPurches(int bookId){
        Books boi= Books.findByID(bookId);
        if(boi!= null && boi.status.equals("available")){
            boi.status= "sold";
            System.out.println("Purched: "+boi.bookName+" by "+userName);
        }
        else System.out.println("Book unavailable");
    }

    public int payFine(int daysBorrowed, int daysAllowed){
        int fine= daysBorrowed-daysAllowed;
        if(fine>0) System.out.println("Fine:"+fine);
        else{
            System.out.println("No fine");
            fine =0;
        }
        return fine;
    }
}


