import java.util.Date;

class Book {
    public StringBuilder name;
}


public class Library{
    /* create a new array, using keyword "new" */
    Book[] bookList = new Book[10];
}

class TestArray{
    public static void main(String[] args){
        int size = 10;
        double[] myList = new double[size];

        myList[0] = 4.2;
        myList[1] = 3.5;
        for (double i : myList) {
            System.out.println(i);
        }
    }
}

class TestIt {
    public static void main ( String[] args ) {
        int[] myArray = {1, 2, 3, 4, 5};
        ChangeIt.doIt( myArray );
        for (int i : myArray) System.out.print(i + " ");
        System.out.println();

        LowHighSwap.doIt(myArray);
        for (int j : myArray) System.out.print(j + " ");
    }
}
class ChangeIt {
    static void doIt( int[] z ) {
        z = null;
    }
}

class LowHighSwap {
    static void doIt( int[] z ) {
        int temp = z[z.length-1];
        z[z.length-1] = z[0];
        z[0] = temp;
    }
}

class Event {

    public static void main(String[] args){
        Date date = new Date();
        System.out.println(date.toString());
    }
}

