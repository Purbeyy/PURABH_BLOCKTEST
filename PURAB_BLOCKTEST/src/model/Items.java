package model;

public class Items {
    String item_Name;
    int code ;
    String brand;
    int price;
    String size;

    public Items(String item_Name, int code, String brand, int price, String size) {
        this.item_Name = item_Name;
        this.code = code;
        this.brand = brand;
        this.price = price;
        this.size = size;
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void des() {

            System.out.println("Item name : " +this.item_Name);
            System.out.println("code : " +this.code);
            System.out.println("Brand : " +this.brand);
            System.out.println("Price:  " +this.price);

        }

    }

