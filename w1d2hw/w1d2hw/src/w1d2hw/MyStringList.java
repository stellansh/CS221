/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1d2hw;

/**
 *
 * @author stella
 */
public class MyStringList {

    private final int INITIAL_LENGTH = 4;
    private String[] strArray;
    private int size;

    public MyStringList() {
        strArray = new String[INITIAL_LENGTH];
        size = 0;
    }

    public void add(String s) {
        if (size == INITIAL_LENGTH) {
            resize();
        } else {
            strArray[size] = s;
            size++;
        }
    }

    private void resize() {
        int len = strArray.length;
        int newlen = 2 * len;
        String[] tempo = new String[newlen];
        System.arraycopy(strArray, 0, tempo, 0, len);
        strArray = tempo;
    }

    public String get(int i) {

        if (i < size) {
            return strArray[i];
        } else {
            return null;
        }
    }

    public boolean find(String s) {
        boolean sInArray = false;
        for (int i = 0; i < size; i++) {
            if (strArray[i].equals(s)) {
                sInArray = true;
                break;

            }

        }
        return sInArray;
    }

    public void insert(String s, int pos) {
        if (pos > size) {
            return;
        }
        if (pos >= strArray.length || size + 1 > strArray.length) {
            resize();
        }
        String[] tempo = new String[strArray.length + 1];
        System.arraycopy(strArray, 0, tempo, 0, pos);
        tempo[pos] = s;
        System.arraycopy(strArray, pos, tempo, pos + 1, strArray.length - pos);
        strArray = tempo;
        size++;

    }

    public boolean remove(String s) {
        for (int i = 0; i < size; i++) {
            if (strArray[i].equals(s)) {
                break;
            }
            if (i == size) {
                return false;
            } else {
                for (int k = i; k < size; k++) {
                    strArray[k] = strArray[k + 1];
                }
            }
            size--;

        }
        return true;
    }

    public int size() {
        return size;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(strArray[i]);

        }
    }

    public static void main(String[] args) {
        MyStringList newstrArray = new MyStringList();
        newstrArray.add("fish");
        newstrArray.add("jambo");
        newstrArray.add("menna");
        newstrArray.add("stella");
        System.out.println("lala is in array: "+ newstrArray.find("lala"));
         
        newstrArray.display();
    
        newstrArray.insert("stishka",3);
        newstrArray.remove("stella");
        System.out.println("after removing and inserting: ");
          newstrArray.display();

    }
}
