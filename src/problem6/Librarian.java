package problem6;

public class Librarian {
    String name;
    int id;
    int nextID=1;

    public Librarian(String name){
        this.name=name;
        this.id= nextID++;
    }

    Books searchBook(String name){
        Books boi= Books.findByName(name);
        if(boi!=null) boi.displayBookDetails();
        else System.out.println("Book Not FOUND!!!");
        return boi;
    }

    boolean verifyMember(int id){
        boolean found= User.findByID(id) != null;
        System.out.println("Member: "+id+(found? "\nverified" : "\nnot found"));
        return found;
    }
    public void bookOrder(int userId, int bookID){
        if(verifyMember(userId)) User.findByID(userId).borrowedBook(bookID);
    }
    public void sellBook(int userId, int bookID){
        if(verifyMember(userId)) User.findByID(userId).bookPurches(bookID);
    }

}
