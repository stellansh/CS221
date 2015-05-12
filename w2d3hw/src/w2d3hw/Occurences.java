/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w2d3hw;

//import static java.awt.SystemColor.text;
/**
 *
 * @author stella
 */
class Array<T> {

    private T[] a;

    public Array(int size) {
        a = (T[]) new Object[size];
    }

    public void setElem(int index, T value) {
        a[index] = value;
    }

    public T getElem(int index) {
        return a[index];
    }

    public int countOccurrences(T[] a, T value) {

        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == value || a[i].equals(value)) {
                count++;

            }

        }
        return count;
    }
}

public class Occurences<T> {

    public static void main(String args[]) {

        Array<String> text = new Array<String>(30);

        String[] a = {"CA", "US", "MX", "HN", "GT", "CA", "CA"};

        System.out.println("Number of counts of CA : " + text.countOccurrences(a, "CA"));

        Array<Integer> it = new Array<Integer>(20);

        Integer[] b = {10,20,10,10,30, 10, 40, 10, 60};
        System.out.println("Number of counts of 10 : " + it.countOccurrences(b, 10));

    }
}
/* Number of counts of CA : 3
Number of counts of 10 : 5*/