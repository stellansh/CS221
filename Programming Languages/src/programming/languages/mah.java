/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming.languages;

import java.util.function.BiFunction;
import java.util.stream.Stream;

/**
 *
 * @author stella
 */
public class mah {
    /*public static void main(String[] args) {
     BiFunction<Integer, Integer, Integer> f =
     (x,y) -> 2 * x - y;
     System.out.println(f.apply(2, 3)); //output: 1
     }  
     }*/

    public static void main(String[] args) {
      Stream<String> echoes =
        Stream.generate(() -> “Echo”);
