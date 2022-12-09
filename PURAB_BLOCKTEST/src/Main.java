import model.Items;
import model.Order;
import model.User;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

Items i1 = new Items("tshit", 1002, "levis", 2000, "large");
Items i2 = new Items("loius vutton", 1007, "levis", 2000, "large");
Items i3 = new Items("loius ", 1009, "levis+", 200, "small");
Items i4 = new Items("Hail  ", 1001, "levis+", 20000, "small");
Items i5 = new Items("Hail marry  ", 1006, "levis+", 20000, "small");

            i1.des();

            ArrayList<Items> order1 = new ArrayList<Items>();
            ArrayList<Items> order2 = new ArrayList<Items>();
            ArrayList<Items> order3 = new ArrayList<Items>();
            ArrayList<Items> order4 = new ArrayList<Items>();

            order1.add(i1);
            order1.add(i3);
            order1.add(i4);

            order2.add(i5);
            order2.add(i2);
            order2.add(i3);

            order3.add(i1);

            order4.add(i4);
            order4.add(i5);


            Order o1 = new Order("First", 1, 1, "multiple", order1 );
            Order o2 = new Order("Second", 2, 1, "multiple", order2 );
            Order o3 = new Order("Third", 3, 2, "single", order3 );
            Order o4 = new Order("Fourth", 4, 2, "multiple", order4 );

            ArrayList<Order> one = new ArrayList<Order>();
            ArrayList<Order> two = new ArrayList<Order>();

            one.add(o1);
            one.add(o2);
            two.add(o3);
            two.add(o4);


            User u1 = new User("Purabh", "male", "9812367", 28 ,"Kathmandu", one );
            User u2 = new User("Govinda", "male", "1928378", 29 , "siphal", two );


    }
}