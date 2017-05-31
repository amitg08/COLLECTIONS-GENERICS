import java.util.ArrayList;
import java.util.Scanner;

public class HDTV {

    String brandname;
    int size;

    public void properties(String newbrandname, int newSize) {
        brandname = newbrandname;
		size = newSize;
		System.out.println("brandname: " + brandname);
		System.out.println("size: " + size);
    }

}

public class contacts extends HDTV {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
		
        System.out.println("Plz enter Name : ");
        String name = input.nextLine();
		
        System.out.println("Plz enter Address : ");
        String address = input.nextLine();
		
        System.out.println("Plz enter ContactNo : ");
        int contact = input.nextLine();
		
		contacts c = new contacts();
		c.properties;

        ArrayList<Data> Contacts = new ArrayList<Data>();
        Data obj = new Data(name, address, contact); // Creating a new objects
        Contacts.add(obj); // Adding it to the list
    }
}


