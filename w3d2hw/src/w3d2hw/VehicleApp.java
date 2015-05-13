/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3d2hw;

import java.util.TreeSet;

/**
 *
 * @author stella
 */
class Vehicle implements Comparable {

    String vname;
    double vprice;
    String vmodel;

    public Vehicle(String name, double price, String model) {
        this.vname = name;
        this.vprice = price;
        this.vmodel = model;
    }

    public String toString() {
        return "\nVname: " + vname + ", \tVmodel: " + vmodel + ", \tVprice: " + vprice;
    }

    
    public int compareTo(Object oB) {
        Vehicle veh = (Vehicle) oB;
        return Double.compare(this.vprice, veh.vprice);
    }
}

public class VehicleApp {

    public static void main(String[] args) {
        TreeSet<Vehicle> veh = new TreeSet<Vehicle>();
        veh.add(new Vehicle("Benz", 400, "B1"));
        veh.add(new Vehicle("Toyota", 300, "T1"));
        veh.add(new Vehicle("Ferarri", 100, "F1"));
        veh.add(new Vehicle("Honda", 200, "H1"));
        veh.add(new Vehicle("Suzuki", 500, "S1"));

        System.out.println(veh);

    }
}
/*name: Benz, 	Vmodel: B1, 	Vprice: 100.0, 
Vname: Toyota, 	Vmodel: T1, 	Vprice: 200.0, 
Vname: Ferarri, Vmodel: F1, 	Vprice: 300.0, 
Vname: Honda, 	Vmodel: H1, 	Vprice: 400.0, 
Vname: Suzuki, 	Vmodel: S1, 	Vprice: 500.0]*/