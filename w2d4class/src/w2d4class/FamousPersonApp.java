/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w2d4class;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author stella
 */
public class FamousPersonApp {

    public static void main(String[] args) {
        ArrayList<FamousPerson> list = new ArrayList<FamousPerson>();

        FamousPerson f1 = new FamousPerson("man", "lamb", 21, "toyota", 2009, "blue");
        FamousPerson f2 = new FamousPerson("fish", "ika", 22, "benz", 2010, "white");
        FamousPerson f3 = new FamousPerson("stella", "nshuti", 23, "ferrari", 2013, "red");
        FamousPerson f4 = new FamousPerson("jenber", "nurte", 23, "ford", 2015, "purple");
        list.add(f1);
        list.add(f2);
        list.add(f3);
        list.add(f4);

        System.out.println("before sort:");
        for (int i = 0; i < list.size(); i++) {
            FamousPerson f = list.get(i);
            System.out.println(f.getModel());
        }
        Collections.sort(list, FamousPerson.Model);

        System.out.println("after sort:");
        for (int i = 0; i < list.size(); i++) {
            FamousPerson f = list.get(i);
            System.out.println(f.getModel());
        }

        Collections.sort(list, FamousPerson.YEAR);

        System.out.println("after sort:");
        for (int i = 0; i < list.size(); i++) {
            FamousPerson f = list.get(i);
            System.out.println(f.getYear());
        }

        System.out.println("altogether:");
        for (int i = 0; i < list.size(); i++) {
            FamousPerson f = list.get(i);
            System.out.println(f.getFirstname() +" "+ f.getLastname()+ ": " + f.getModel() +" " +f.getColor()+" " + f.getYear());

        }
    }
}
