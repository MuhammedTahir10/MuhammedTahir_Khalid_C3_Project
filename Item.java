package com.RestaurantFinder;

public class Item {
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString(){
        return  name + ":"
                + price
                + "\n"
                ;
    }

    ////Part 3: Failing Test Case Start
    public int getPrice() {
        return price;
    }

    //Part 3: Failing Test Case End


}
