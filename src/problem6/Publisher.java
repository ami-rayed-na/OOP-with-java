package problem6;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
    int publisherID;
    int phnNumber;
    String pubName;
    String pubAddress;

    static int nextID=1;
    static List<Publisher> pubList = new ArrayList<>();

    public Publisher(String name, String address, int number){
        this.pubAddress=address;
        this.pubName=name;
        this.phnNumber=number;
        this.publisherID=nextID++;
    }

    public static Publisher findByID(int id){
        for(Publisher p : pubList) if(p.publisherID== id) return p;
        return null;
    }

    public static void addNewPub(String name, String address, int number){
        pubList.add(new Publisher(name, address, number));
        System.out.println("New Publisher added: "+name);
    }
    public static void delPub(int id){
        Publisher pp= findByID(id);
        if(pp!=null){
            pubList.remove(id);
            System.out.println("Publisher reoved: "+pp.pubName);
        }
    }
    public static void modifyPub(int id, String name, String address, int number){
        Publisher pp= findByID(id);
        if(pp!=null){
            pp.pubName= name;
            pp.pubAddress=address;
            pp.phnNumber=number;
            System.out.println("Updated: "+name);
        }
    } 

}
