package w1d1;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author stella
 */
public class Reverse {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("give a numb:");
        String line = input.nextLine();
        int size = line.length();
        String reverse = "";
        for (int i = 0; i < size; i++) {
            reverse = reverse + line.charAt(size - i - 1);

        }
        System.out.println(reverse);

    }
}
