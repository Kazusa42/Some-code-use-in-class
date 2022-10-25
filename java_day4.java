import java.util.Date;
import java.util.Random;

class Book {
    public StringBuilder name;
}


public class Library{
    /* create a new array, using keyword "new" */
    Book[] bookList = new Book[10];
}

class stringProcesser{
    /* discuss StringBuffer and StringBuilder.
     * StringBuilder is much faster than StringBuffer;
     * StringBuffer is process safe while StringBuilder is not. */
    public static void stringProcesser(String[] args){
        StringBuilder sb = new StringBuilder(10);
        sb.append("Hello");
        System.out.println(sb);
        sb.append(" world.");
        System.out.println(sb);

        sb.insert(3, "test");
        System.out.println(sb);
        sb.delete(3, 5);
        System.out.println(sb);
    }
    /* commom methods of StringBuffer
     * insert, append, reverse, delete, replace, length, substring, toString */

}

class Array {
    int size;
    /* use keyword "new" to create an array */
    double[] myList = new double[size];

    // multi-dimention array
    double[][] myList2 = new double[size][size];

    void setSize(int x){
        size = x;
    }

    int getSize(){
        return size;
    }

    void createRandomArray(){
        for (int i = 0; i < size; ++i) {
            myList[i] = (double)(Math.random() * 10);
        }
    }

    void iterMyList(){
        /* for iter each item in an array, we can use "for-each" loop*/
        for (double i : myList){
            System.out.println(i);
        }
    }

    /* use array as a return value */
    int[] floorMyList(){
        int[] fMyList = new int[size];
        for (int i = 0; i < size; ++i) {
            fMyList[i] = (int)myList[i];
        }
        return fMyList;
    }

    public static void Array(String[] args){
        /* Arrays class
         * fill: assign value to array
         * sort
         * equals
         * binarySearch */
    }
}
