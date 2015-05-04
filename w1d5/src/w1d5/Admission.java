/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1d5;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author stella
 */
public class Admission {

    int adno;
    String name;
    String pno;

    public Admission(String name, String pno) {
        this.name = name;
        this.pno = pno;
        this.adno = (int) (Math.random() * 100);
    }

    public String toString() {
        return ("Name :" + name + "  Phone Number :" + pno + "  ID no. :" + adno);
    }

    public static void main(String[] args) {
        Queue<Admission> student = new LinkedList<Admission>();
        student.offer(new Admission("stella", "4444444"));
        student.offer(new Admission("bella", "333333"));
        student.offer(new Admission("Ciella", "111111"));
        student.offer(new Admission("Diella", "666666"));
        student.offer(new Admission("Ella", "555555"));
        System.out.println("Top element :" + student.peek());
        System.out.println(student.size());
        for (int i = 0; i < 5; i++) {
            System.out.println(student.remove());

        }
        System.out.println("Is the queue emepty? " + student.isEmpty());
    }

}
