import java.io.*;
import java.util.Scanner;

public class Reader {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    void readSingleChar() throws IOException{
        char c;
        /* use "read" method to get single char input */
        System.out.println("Enter chars, input 'q' to break");
        do{
            c = (char)reader.read();
            System.out.println(c);
        }while(c != 'q');
    }

    void readStrings() throws IOException{
        /* use "readLine" method to get a string input */
        String str;
        System.out.println("Enter lines of text.");
        System.out.println("Enter end to quit.");
        do{
            str = reader.readLine();
            System.out.println(str);
        }while(!str.equals("end"));
    }
    void writeDemo(){
        /* System.out.println and System.out.print */
        /* System.out.write, not use usually */
        int b;
        b = 'A';
        System.out.write(b);
        System.out.write('\n');
    }

    public static void main(String[] args) throws IOException{
        Reader r = new Reader();
        r.readSingleChar();
        r.readStrings();
    }

}

class FileReader{
    String filePath;

    public FileReader(String str) throws FileNotFoundException {
        filePath = str;
    }

    void getFilePath(){
        System.out.println("Current file is: " + filePath);
    }

    /* FileInputStream: read from file. */
    // InputStream fr = new FileInputStream(filePath);
    /* methods for FileInputStream
     * close()
     * finalize()
     * read(int r): read n byte data, return next byte data.
     * read(byte[] r): read r.length byte data, return read byte length.
     * avaiable(): return how many byte can be readed. */

    /* FileOutputStream: open a file and write it. */
    // OutputStream fw = new FileOutputStream(filePath);

    public static void main(String[] args) throws IOException {
        /* a demo */
        File newFile = new File("test.txt");
        FileOutputStream fop = new FileOutputStream(newFile);

        OutputStreamWriter fw = new OutputStreamWriter(fop, "UTF-8");
        fw.append("English text:");
        fw.append("\n\t");
        fw.append("Hello World.");
        fw.close();
        fop.close();

        FileInputStream fip = new FileInputStream(newFile);
        InputStreamReader fr = new InputStreamReader(fip, "UTF-8");
        StringBuffer sb = new StringBuffer();
        System.out.println("Starting output file:\n");
        while (fr.ready()) {
            sb.append((char) fr.read());
        }
        System.out.println(sb.toString());
        fr.close();
        fip.close();
    }
}

class ScannerDemo{
    /* next and nextLine */
    /* get input from keybord */
    Scanner scan = new Scanner(System.in);

    void demoNext(Scanner scan) {
        System.out.println("Getting data by method 'next'.");
        if (scan.hasNext()){
            String str1 = scan.next();
            System.out.println(str1);
        }
        scan.close();
    }

    void demoNextLine(Scanner scan) {
        System.out.println("Getting data by method 'nextLine'.");
        if (scan.hasNextLine()){
            String str2 = scan.nextLine();
            System.out.println(str2);
        }
        scan.close();
    }

    void getAve(Scanner scan){
        System.out.println("Input numbers: ");

        double sum = 0.0;
        int cnt = 0;
        while (scan.hasNextDouble()){
            double curr = scan.nextDouble();
            ++cnt;
            sum += curr;
        }

        System.out.println("The sum of " + cnt + " numbers are: " + sum);
        System.out.println("The average of them is: " + (sum / cnt));
        scan.close();
    }

    public static void main(String[] args) throws IOException{
        ScannerDemo s = new ScannerDemo();
        // s.demoNext(s.scan);
        // s.demoNextLine(s.scan);
        s.getAve(s.scan);
    }
}
