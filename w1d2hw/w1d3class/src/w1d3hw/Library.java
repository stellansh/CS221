/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1d3hw;

import java.util.ArrayList;

/**
 *
 * @author stella
 */
public class Library {

    private int bookID;
    private String ISBN;
    private String bookName;
    private double price;

    public Library(int bookID, String ISBN, String bookName, double price) {
        this.bookID = bookID;
        this.ISBN = ISBN;
        this.bookName = bookName;
        this.price = price;
    }
    public static void main(String[] args) {
        ArrayList<Library>libra= new ArrayList<>();
        libra.add(new Library(10,"1010","math",10.00));
        libra.add(new Library(20,"2040","biology",20.00));
        libra.add(new Library(30,"3040","chemistry",30.00));
        libra.add(new Library(40,"4040","physics",40.00));
        
        Library L=libra.get(1);
        libra.remove(3);
         System.out.println(" the current library size:"+libra.size());
         System.out.println(" is the libra arrayList empty?:"+libra.isEmpty());
    }

}
