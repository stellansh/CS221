/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3d1hw;

import java.util.Arrays;

/**
 *
 * @author stella
 */
public class Anagram {

    public static void main(String args[]) {

        System.out.println("are this 2 words anagram?: " + checkAnagramV2("silent", "listen"));
    }

    public static boolean checkAnagramV2(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        } else {
            char[] temp1 = new char[str1.length()];
            char[] temp2 = new char[str2.length()];
            for (int i = 0; i < str1.length(); i++) {
                temp1[i] = str1.charAt(i);
            }
            for (int j = 0; j < str2.length(); j++) {
                temp2[j] = str2.charAt(j);
            }
            Arrays.sort(temp1);
            Arrays.sort(temp2);

            return (Arrays.equals(temp1, temp2));
        }
    }
}
/*are this 2 words anagram?: true*/