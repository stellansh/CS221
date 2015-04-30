/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1d3class;

import java.util.ArrayList;

/**
 *
 * @author stella
 */
class Sale {

    String item;
    double price;

    public Sale(String item, double price) {
        this.item = item;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}

public class TallySales {

    public static void main(String[] args) {
        ArrayList<Sale> sales = new ArrayList<Sale>();
        sales.add(new Sale("DVD", 40));
        sales.add(new Sale("DVD", 15.00));
        sales.add(new Sale("Book", 12.00));
        sales.add(new Sale("DVD", 21.00));
        sales.add(new Sale("CD", 5.25));//sales.add(2,new Sale("CD", 5.25)); index,object
        Sale ob = sales.get(1); // Retrieve first index element from the list
        //sales.remove(ob);
        System.out.println(ob.item + " " + ob.price);
        double total = 0;
        for (Sale sale : sales) {
            if (sale.item.equals("DVD")) {
                total += sale.price;
            }
        }
        System.out.println("Total selleing price of DVD : $" + total);
    }
}
