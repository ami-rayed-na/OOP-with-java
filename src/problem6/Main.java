package problem6;

public class Main {
    public static void main(String[] args){
        Books.addNewBooks("Clean Code", "Robert C. Martin", "2008", 39.99f);
        Books.addNewBooks("kala", "nigga", "1969", 999f);
        Books.inqueryBook(2);
        Books.findByID(3);
        Books.findByName("jani na");

        User.addNewUser("Alice", "10 Maple St", 6001001);
        User.addNewUser("Bob", "22 Oak Ave", 6002002);
        User.addNewUser("Carol", "5 Pine Rd", 6003003);

        Librarian lib = new Librarian("Ms. Elena");
        lib.verifyMember(1);
        lib.verifyMember(50);

        User.findByID(2).bookPurches(2);
        Books.inqueryBook(2);
    } 
}
