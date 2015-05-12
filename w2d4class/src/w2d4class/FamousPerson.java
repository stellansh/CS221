/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w2d4class;

import java.util.Comparator;

/**
 *
 * @author stella
 */
class FamousPerson extends Car {

    private String firstname;
    private String lastname;
    private int age;

    public FamousPerson(String firstname,String lastname,int age,String Model, int  Year,String Color) {
        super(Model,Year,Color);
        this.firstname = firstname;
        this.lastname = lastname;
    

    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String Lastname) {
        this.lastname = Lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static final Comparator Model = new Comparator() {
        public int compare(Object one, Object two) {
            String Model1 = ((Car) one).getModel();
            String Model2 = ((Car) two).getModel();
            return Model1.compareTo(Model2);

        }
    };
    public static final Comparator COLOR = new Comparator() {
        public int compare(Object one, Object two) {
            String color1 = ((Car) one).getColor();
            String color2 = ((Car) two).getColor();
            return color1.compareTo(color2);

        }
    };
    public static final Comparator YEAR = new Comparator() {
        public int compare(Object one, Object two) {
            Integer Year1 = ((Car) one).getYear();
            Integer Year2 = ((Car) two).getYear();
            return Year1.compareTo(Year2);

        }
    };
}


