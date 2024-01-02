package ex1pizza;
// Assignment: 1
// Author: Ram Nagid, ID: 318692779
public class PizzaOrderMain {
    public static void main(String[] args) {
        //create pizzas
        Pizzaorder pizza1 = new Pizzaorder("Haim", "Kohen");
        Pizzaorder pizza2 = new Pizzaorder("Eyal", "Shani");
        pizza1.addPizza(0, true, false, true);
        pizza1.addPizza(1, true, false, false);
        pizza1.tab();
        pizza2.addPizza(2, true, true, true);
        pizza2.addPizza(2, true, true, true);
        pizza2.addPizza(2, true, true, true);
        pizza2.tab();
        if (pizza1.equals(pizza2)) {
            System.out.println("The orders are equal!!!");
        } else {
            System.out.println("The orders are NOT equal!!!");
        }
    }
}
