/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w2d4class;

//import java.util.ArrayList;

/**
 *
 * @author stella
 */
import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;

class Library2 implements Comparable {

    public int bookID;
    public String ISBN;
    public String bookName;
    public double price;

    public Library2(int bookID, String ISBN, String bookName, double price) {
        this.bookID = bookID;
        this.ISBN = ISBN;
        this.bookName = bookName;
        this.price = price;
    }

    //@Override

    public int compareTo(Object obj) {
        Library2 obj1 = (Library2) obj;
        if (this.price > obj1.price) {
            return 1;
        } else {
            if (this.price < obj1.price) {
                return -1;
            } else {
                return 0;
            }
        }

    }
}
public class libapp{
    public static void main(String[] args) {
        ArrayList<Library2> libra = new ArrayList<>();
        libra.add(new Library2(10, "1010", "math", 10.00));
        libra.add(new Library2(20, "2040", "biology", 20.00));
        libra.add(new Library2(30, "3040", "chemistry", 30.00));
        libra.add(new Library2(40, "4040", "physics", 40.00));

        Collections.sort(libra);
        for (Library2 obj : libra) {
            System.out.println(obj.price);
        }

         //System.out.println(" the current library size:"+libra.size());
        //System.out.println(" is the libra arrayList empty?:"+libra.isEmpty());
    }

}
