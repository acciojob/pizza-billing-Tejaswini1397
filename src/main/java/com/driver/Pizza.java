package com.driver;

import com.sun.jdi.PrimitiveValue;

public class Pizza {

    private int price;
    private int vegToppingPrice;

    private int NonVegToppingPrice;

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
            NonVegToppingPrice=120;
            total=400;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!isCheeseAdded){

                total+=cheesePrice;
                isCheeseAdded=true;

        }
    }

    public void addExtraToppings(){
        if(!isToppingsAdded) {
            if (isVeg) {
                total += vegToppingPrice;
            } else {
                total += NonVegToppingPrice;
            }
            isToppingsAdded=true;

        }
    }

    public void addTakeaway(){
        if(!isTakeAwayAdded){
            total+=bagPrice;
            isTakeAwayAdded=true;
        }
    }

    public String getBill(){
       this.bill = "Base Price Of The Pizza: " + price + "\n";

        if(isCheeseAdded) // add in bill if he opted for extra cheese,
            bill = bill + "Extra Cheese Added: " + cheesePrice + "\n";

        if(isToppingsAdded) // add if he opted for extra toppings
            if(isVeg)
            bill = bill + "Extra Toppings Added: " + vegToppingPrice+ "\n";
        else {
                bill = bill + "Extra Toppings Added: " + NonVegToppingPrice+ "\n";
            }

        if(isTakeAwayAdded) // if he is opted for takeaway
            bill = bill + "Paperbag Added: " + bagPrice + "\n";

        bill = bill + "Total Price: " + total;

        return bill;
    }
}
