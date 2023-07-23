package com.overloaded.constructors;

public class Main {

    public static void main(String[] args) {

        // Simulating making many pizzas
        // Create instances of Pizza class, and pass arguments

        Pizza pizza1 = new Pizza("Thick crust","Mozzarella","Tomato","Vegetables");
        // Can use this, or other Pizza constructor (if no topping, or no topping and sauce, is desired, and so on)

        System.out.println("Your chosen ingredients are as followed:");
        System.out.println(pizza1.bread+" for your bread");
        System.out.println(pizza1.cheese+" for your cheese.");
        System.out.println(pizza1.sauce+" for your sauce.");
        System.out.println(pizza1.topping+" for your topping.");
    }
}