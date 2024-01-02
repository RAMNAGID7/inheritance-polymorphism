package ex1pizza;
// Assignment: 1
// Author: Ram Nagid, ID: 318692779
public class CheckPizzaMain {
    public static void main(String[] args) {
        //create pizzas
        Pizza pizza1 = new Pizza(0, true, true, false);
        Pizza pizza2 = new Pizza(pizza1);
        pizza2.setSize(2);
        Pizza pizza3 = new Pizza();
        //print pizzas and prices
        System.out.println("\nList of pizzas and their prices:");
        System.out.println("pizza 1:\n"+pizza1);
        System.out.println("ex1pizza.Pizza costs :"+pizza1.calcCost());
        System.out.println("pizza 2:\n"+pizza2);
        System.out.println("ex1pizza.Pizza costs :"+pizza2.calcCost());
        System.out.println("pizza 3:\n"+pizza3);
        System.out.println("ex1pizza.Pizza costs :"+pizza3.calcCost());
        // change pizza 3 and print it
        pizza3.setCheeseTopping(true);
        pizza3.setOliveTopping(true);
        System.out.println("\nex1pizza.Pizza 3 was changed. The new pizza 3:\n"+pizza3);
        //compare all pizzas
        System.out.println("\nComparing pizzas:");
        if (pizza1.equals(pizza2)) System.out.println("pizza 1 = pizza 2");
        if (pizza1.equals(pizza3)) System.out.println("pizza 1 = pizza 3");
        if (pizza3.equals(pizza2)) System.out.println("pizza 2 = pizza 3");
    }
}
