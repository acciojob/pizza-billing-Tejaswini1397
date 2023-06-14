package com.driver;

import com.sun.jdi.PrimitiveValue;

public class Pizza {

    private int price;
    private int vegToppingPrice;

    private int nonVegToppingPrice;

    private int cheesePrice=80;

    private  int bagPrice=20;
    private Boolean isVeg;
    private String bill;
    private int total;
    private boolean isCheeseAdded = false;
    private boolean isToppingsAdded = false;
    private boolean isTakeAwayAdded = false;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
           price=300;
            vegToppingPrice=70;
           total=300;
        }else{
            price=400;
            nonVegToppingPrice=120;
            total=400;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if (!isCheeseAdded) {
            total += cheesePrice;
            isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        if (!isToppingsAdded) {
            if (isVeg) {
                total += vegToppingPrice;
                isToppingsAdded = true;
            } else {
                total += nonVegToppingPrice;
                isToppingsAdded = true;
            }
        }

    }

    public void addTakeaway(){
        if (!isTakeAwayAdded) {
            total += bagPrice;
            isTakeAwayAdded = true;
        }
    }

    public String getBill(){
        StringBuilder sb = new StringBuilder();
        sb.append("Base Price Of The Pizza: ").append(price).append("\n");

        if (isCheeseAdded) {
            sb.append("Extra Cheese Added: ").append(cheesePrice).append("\n");
        }

        if (isToppingsAdded) {
            if (isVeg) {
                sb.append("Extra Toppings Added: ").append(vegToppingPrice).append("\n");
            } else {
                sb.append("Extra Toppings Added: ").append(nonVegToppingPrice).append("\n");
            }
        }

        if (isTakeAwayAdded) {
            sb.append("Paperbag Added: ").append(bagPrice).append("\n");
        }

        sb.append("Total Price: ").append(total);

        return sb.toString();

    }
}
