/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3d5;

/**
 *
 * @author stella
 */
import java.io.*;

class DataItem1 {

    private String Data;

    public DataItem1(String ii) {
        Data = ii;
    }

    public String getKey() {
        return Data;
    }

}

class HashTable1 {

    private DataItem1[] hashArray;
    private int arraySize;
    private DataItem1 nonItem;
    int nElems;

    public HashTable1(int size) {
        arraySize = size;
        hashArray = new DataItem1[arraySize];
        nonItem = new DataItem1("Deleted");
    }

    public int getSize() {
        return nElems;
    }

    public void displayTable() {
        System.out.print("Table: ");
        for (int j = 0; j < arraySize; j++) {
            if (hashArray[j] != null) {
                System.out.print(hashArray[j].getKey() + " ");
            } else {
                System.out.print("** ");
            }
        }
        System.out.println("");
    }

    public void insert(DataItem1 item) {
        String key = item.getKey();      // extract key
        int temp = Math.abs(key.hashCode());  // hash the key
        int hashVal = temp % arraySize;                              // until empty cell or -1,
        while (hashArray[hashVal] != null
                && hashArray[hashVal].getKey() != "Deleted") {
            ++hashVal;                 // go to next cell
            hashVal %= arraySize;      // wraparound if necessary
        }
        hashArray[hashVal] = item;
        nElems++;
    }

    public DataItem1 delete(String key) {
        int num = Math.abs(key.hashCode());
        int hashVal = num % arraySize;
        DataItem1 deleted = new DataItem1("Deleted");
        while (hashArray[hashVal] != null) {
            if (hashArray[hashVal].getKey().equals(key)) {
                DataItem1 temp = hashArray[hashVal];
                hashArray[hashVal] = deleted;
                nElems--;
                return temp;
            }
            ++hashVal;
            hashVal %= arraySize;
        }
        return null;
    }

    public DataItem1 find(String key) {
        int temp = Math.abs(key.hashCode());
        int hashVal = temp % arraySize;

        while (hashArray[hashVal] != null) {
            if (hashArray[hashVal].getKey().equals(key)) {
                return hashArray[hashVal];
            }
            ++hashVal;
            hashVal %= arraySize;
        }
        return null;
    }
}

public class HashTableApp2 {

    public static void main(String[] args) throws IOException {
        DataItem1 aDataItem;
        int size, n, keysPerCell;
        String aKey;
        // get sizes
        System.out.print("Enter size of hash table: ");
        size = getInt();
        keysPerCell = 10;
        HashTable1 theHashTable = new HashTable1(size);
        while (true) {
            System.out.print("Enter first letter of ");
            System.out.print("show, insert, delete,number or find: ");
            char choice = getChar();
            switch (choice) {
                case 's':
                    theHashTable.displayTable();
                    break;
                case 'i':
                    System.out.print("Enter key value to insert: ");
                    aKey = get();
                    aDataItem = new DataItem1(aKey);
                    theHashTable.insert(aDataItem);
                    break;
                case 'd':
                    System.out.print("Enter key value to delete: ");
                    aKey = get();
                    theHashTable.delete(aKey);
                    break;
                case 'n':
                    System.out.println("Size of hash table :" + theHashTable.getSize());
                    break;
                case 'f':
                    System.out.print("Enter key value to find: ");
                    aKey = get();
                    aDataItem = theHashTable.find(aKey);
                    if (aDataItem != null) {
                        System.out.println("Found " + aKey);
                    } else {
                        System.out.println("Could not find " + aKey);
                    }
                    break;
                default:
                    System.out.print("Invalid entry\n");
            }  // end switch
        }  // end while
    }  // end main()
//-----------------------------------------------

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
//--------------------------------------------------------------

    public static char getChar() throws IOException {
        String s = getString();
        return s.charAt(0);
    }
//-------------------------------------------------------------

    public static String get() throws IOException {
        String s = getString();
        return s;
    }

    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }
}
