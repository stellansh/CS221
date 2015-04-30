/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1d3hw;

import w1d3hw.Student;

/**
 *
 * @author stella
 */
public class StudentArray {

    private Student[] a;
    private int nElems;

    public StudentArray(int max) {
        a = new Student[max];
        nElems = 0;
    }

    public Student find(int SearchId) {
        int j;
        for (j = 0; j < nElems; j++) {
           
            if (a[j].getId() == SearchId) {
                //return a[j];
            }
        }
            if (j == nElems) {
                return null;
        }

        return a[j];
    }

    public void insert(int id, String name, int mark) {
        if (find(id) == null) {
            a[nElems] = new Student(id, name, mark);
            nElems++;
        }
    }

    public boolean delete(int SearchId) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (a[j].getId() == (SearchId)) {
                break;
            }
            if (j == nElems) { // can't find it
                return false;
            } else {  // found it
                for (int k = j; k < nElems; k++) { //shift down
                    a[k] = a[k + 1];
                }
            }
            nElems--;

        }
        return true;
    }

    public void displayAll() {
        for (int j = 0; j < nElems; j++) {
            a[j].displayStudent();
        }

    }

    public int maxMark() {
        int max = a[0].getMark();
        for (int j = 0; j < nElems; j++) {
            if (a[j].getMark() > max) {
                max = a[j].getMark();
            }
        }
        return max;
    }

    public int minMark() {
        int min = a[0].getMark();
        for (int j = 0; j < nElems; j++) {
            if (a[j].getMark() < min) {
                min = a[j].getMark();
            }
        }
        return min;
    }
}
