package model;
import java.util.ArrayList;

public class User {
    String name;
    String sex;
    String Contact_number;
    int Age;
    String Location;
    ArrayList<Order> orders;

    public User(String name, String sex, String contact_number, int age, String location, ArrayList<Order> orders) {
        this.name = name;
        this.sex = sex;
        Contact_number = contact_number;
        Age = age;
        Location = location;
        this.orders = orders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getContact_number() {
        return Contact_number;
    }

    public void setContact_number(String contact_number) {
        Contact_number = contact_number;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }
}
