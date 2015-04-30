/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1d3hw;

/**
 *
 * @author stella
 */
class Student {

    private int id;
    private String name;
    private int mark;

    public Student(int id, String name, int mark) {
        this.id = id;
        this.mark = mark;
        this.name = name;
    }

    public void displayStudent() {
        System.out.println(" id:" + id + "  name:" + name + "  mark: " + mark);

    }

    public int getId() {
        return id;
    }

    public int getMark() {
        return mark;
    }

}
