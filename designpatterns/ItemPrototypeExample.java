package com.example.designpatterns;

class Item implements Cloneable{

    String name;
    double price;
    String description;

    public Item(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}


public class ItemPrototypeExample {

    public static void main(String[] args) {
        Item item = new Item("Shoes", 100.0, "Sports Shoes");
        try {
            Item item1 = (Item)item.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

    }
}
