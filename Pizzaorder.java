package ex1pizza;
// Assignment: 1
// Author: Ram Nagid, ID: 318692779
public class Pizzaorder {
    private String firstname;
    private String lastname;

    private static final int MAXPIZZAS = 3;
    private Pizza[] arr = new Pizza[MAXPIZZAS];

    private int pizzaAmount;
    public String getFirstname() {
        return firstname;
    }

    public String getLastnamename() {
        return lastname;
    }

    public Pizzaorder(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        pizzaAmount =0;
        }
    private Pizza[] getarr (){
        return arr;
    }
    private boolean checkPizza(Pizza p){
        for (int i= 0; i<pizzaAmount; i++){
            if (arr [i].equals(p)) return true;
        }
        return false;
    }
    public boolean equals (Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Pizzaorder)){
            return false;
        }
        Pizzaorder order = (Pizzaorder) o;
        if(!firstname.equals(order.firstname) || !lastname.equals(order.lastname) || pizzaAmount!= order.pizzaAmount) {
            return false;
        }
        for (int i=0; i<pizzaAmount; i++){
            if (!checkPizza(order.getarr()[i]))return false;
        }
        for (int i=0; i<pizzaAmount; i++){
            if (!order.checkPizza(arr[i])) return false;
        }
        return true;
    }
    public void addPizza (int si,boolean ex,boolean ol,boolean on)
    {
        if (pizzaAmount<3)
        {
        Pizza p = new Pizza(si,ex,ol,on);
            arr [pizzaAmount]  =p;
            pizzaAmount++;
        }
    }
    public int calcTotal()
    {
        int total=0;
        for (int i = 0; i < pizzaAmount; i++) {
          total+=arr[i].calcCost();
        }
        return total;
    }
    public void tab ()
    {
        System.out.println("Customer name -"+firstname+" "+lastname);
        for (int i = 0; i < pizzaAmount; i++) {
            System.out.println("ex1pizza.Pizza size- "+arr[i].toString());
            System.out.print(" price- "+arr[i].calcCost());
            System.out.println();
        }
        System.out.println("=================================");
        System.out.println("Total sum - "+calcTotal());
        System.out.println();
    }
}

