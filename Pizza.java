package ex1pizza;
// Assignment: 1
// Author: Ram Nagid, ID: 318692779

public class Pizza {
    public int size;
    public boolean extra;
    public boolean olives;
    public boolean onions;

    public int getSize() {
        return size;
    }

    public boolean getextra() {
        return extra;
    }

    public boolean getolives() {
        return olives;
    }

    public boolean getonions() {
        return onions;
    }

    public void setSize(int se) {
        if (se >= 0) {
            size = se;
        } else {
            size = 0;
        }
    }

    public void setCheeseTopping (boolean ex) {
        extra = ex;
    }

    public void setOliveTopping(boolean ol) {
        olives = ol;
    }

    public void setonions (boolean on) {
        onions = on;
    }
    public Pizza(int si, boolean ex, boolean ol, boolean on) {
        this.size=si;
        this.extra=ex;
        this.olives=ol;
        this.onions=on;
    }
    public Pizza() {
        this(0,false,false,false);
    }
    public Pizza(Pizza p1) {
        this.size= p1.getSize();
        this.extra=p1.getextra();
        this.olives=p1.getolives();
        this.onions=p1.getonions();
    }

    public  int calcCost() {
        int price = 0;
        if (this.getSize() == 0) {
            price += 35;
            if (getextra()) {
                price += 6;
            }
            if (getonions()) {
                price += 6;
            }
            if (getolives()) {
                price += 6;
            }
        }
        if (this.getSize() == 1) {
            price += 45;
            if (getextra()) {
                price += 7;
            }
            if (getonions()) {
                price += 7;
            }
            if (getolives()) {
                price += 7;
            }
        }
        if (getSize() == 2) {
            price += 60;
            if (getextra()) {
                price += 9;
            }
            if (getonions()) {
                price += 9;
            }
            if (getolives()) {
                price += 9;
            }
        }
        return price;
    }

    public String toString() {
        String s = "";
        if (getSize() == 0) {
            s += "Small ";
        }
        if (getSize() == 1) {
            s += "Medium ";
        }
        if (getSize() == 2) {
            s += "Large ";
        }
        if (getextra()) {
            s += "+";
            s += " extra cheese topping ";
            ;
        }
        if (getolives()) {
            s += "+";
            s += " olives topping ";
        }
        if (getonions()) {
            s += "+";
            s += " onionns topping ";
            ;
        }
        if (!getextra() && !getolives() && !getonions())
        {
           s+="(with no toppings)";
        }
        return s;
    }
    public boolean equals (Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Pizza)) {
            return false;
        }
        Pizza p = (Pizza) o;
        return  (size==p.getSize()&&extra==p.getextra()&&olives==p.getolives()&&onions==p.getonions());
    }
    }
