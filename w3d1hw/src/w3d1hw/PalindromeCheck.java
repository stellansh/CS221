/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3d1hw;

/**
 *
 * @author stella
 */
import java.util.Scanner;

public class PalindromeCheck {

    public static boolean isPal(String s, int i, int j) {
        if (s.length() == 0 || s.length() == 1) {
            return true;
        }
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            if (i >= j) {
                isPal(s, (i + 1), (j - 1));
            }

        } else {

            return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String for check:");
        String str = scanner.nextLine();
        int s = str.length();
        System.out.println("Is this word palindrome:" + isPal(str, 0, s - 1));

    }
}
/* Enter the String for check:
mamamamamamam
Is this word palindrome:true*/
