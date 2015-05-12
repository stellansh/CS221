/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w2d4class;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/**
 *
 * @author stella
 */
 class Student{
    private int id;
    private String name;
    private int score;
    public Student(int id,String name, int score){
        this.id=id;
        this.name=name;
        this.score=score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
 public static final Comparator SCORE = new Comparator() {
        public int compare(Object o1, Object o2) {
            Integer score1 = ((Student) o1).getScore();
            Integer score2 = ((Student) o2).getScore();
            return score1.compareTo(score2);
        }
    };
    public static final Comparator ID= new Comparator() {
        public int compare(Object o1, Object o2) {
            Integer name1 = ((Student) o1).getId();
            Integer name2 = ((Student) o2).getId();
            return name1.compareTo(name2);
        }
    };
    public static final Comparator NAME = new Comparator() {
        public int compare(Object o1, Object o2) {
            String name1 = ((Student) o1).getName();
            String name2 = ((Student) o2).getName();
            return name1.compareTo(name2);
        }
    };        
    
}
 public class StudentApp2 {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        Student st1 = new Student( 1, "stella", 15);
        Student st2 = new Student(2, "Bella", 13);
        Student st3 = new Student(3, "Ciella", 10);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        Collections.sort(list,Student.NAME);
        for (int i = 0; i < list.size(); i++) {
            Student st = list.get(i);
            System.out.println(st.getName());

        }
    }
}