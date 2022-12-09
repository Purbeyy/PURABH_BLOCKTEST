package model;

import java.util.ArrayList;

public class Order {
    String order_name;
    int order_id;
    int user_id;
    String order_type;
    ArrayList<Items> items;

    public Order(String order_name, int order_id, int user_id, String order_type, ArrayList<Items> items) {
        this.order_name = order_name;
        this.order_id = order_id;
        this.user_id = user_id;
        this.order_type = order_type;
        this.items = items;
    }

    public String getOrder_name() {
        return order_name;
    }

    public void setOrder_name(String order_name) {
        this.order_name = order_name;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getOrder_type() {
        return order_type;
    }

    public void setOrder_type(String order_type) {
        this.order_type = order_type;
    }

    public ArrayList<Items> getItems() {
        return items;
    }

    public void setItems(ArrayList<Items> items) {
        this.items = items;
    }
}
