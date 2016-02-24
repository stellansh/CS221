/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming.languages;

/**
 *
 * @author stella
 */
public static <T> boolean isMember(T elem, AList<T> list){
        return (list == null) ? false : (list.head.equals(elem))? true : isMember(elem, list.tail);
    }