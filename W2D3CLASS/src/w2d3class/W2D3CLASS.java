/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w2d3class;

/**
 *
 * @author stella
 */
//public class W2D3CLASS {
class Student <T>{

    private T id;
    private T name;
    private T mark;

    public Student(T id, T name, T mark) {
        this.id = id;
        this.mark = mark;
        this.name = name;
    }

    public void displayStudent() {
        System.out.println(" id:" + id + "  name:" + name + "  mark: " + mark);

    }

    public T getId() {
        return id;
    }

    public T getMark() {
        return mark;
    }

}