package com.overloaded.constructors;

public class Pizza {

    // Declared global variables used by all constructors
    String bread;
    String cheese;
    String sauce;
    String topping;

    // Create constructors (of same name) to pass different parameters

    // One constructor if everything is desired
    Pizza(String bread, String cheese, String sauce, String topping){
        this.bread = bread;
        this.cheese = cheese;
        this.sauce = sauce;
        this.topping = topping;
    }

    // One constructor if no toppings are desired
    Pizza(String bread, String cheese, String sauce){
        this.bread = bread;
        this.cheese = cheese;
        this.sauce = sauce;
    }

    // One constructor if no toppings or sauce is desired
    Pizza(String bread, String cheese){
        this.bread = bread;
        this.cheese = cheese;
    }

    // And so on...

}
