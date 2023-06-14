package com.driver;

public class Pizza {

    private int price;
    private int toppingPrice;

    private int cheesePrice=80;

    private  int bagPrice=20;
    private Boolean isVeg;
    private String bill="Total Price is: ";
    private int total;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
           price=300;
           toppingPrice=70;
           total=300;
        }else{
            price=400;
            toppingPrice=120;
            total=400;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        total+=cheesePrice;
    }

    public void addExtraToppings(){
        total+=toppingPrice;
    }

    public void addTakeaway(){
        total+=bagPrice;
    }

    public String getBill(){
        // your code goes here

        return this.bill+ total;
    }
}
