public class Worker{
    public String name, id;
    private String companyName;

    private double salary;
    public int workYear;

    public Worker(String wName, String wId, int wWorkYear){
        name = wName;
        id = wId;
        workYear = wWorkYear;
    }

    void setSalary(double s){
        salary = s;
    }

    double getSalary() {
        return this.salary;
    }

    void getName(){
        System.out.println("This is " + name + " .\n");
    }
}

class ArtWorks{
    public static final float MAX_SCORE = 10.0F;
    public String name;
    public int publishYear;

    private double price;
    protected float imbdScore;
    private static int visitedCnt = 0;

    private static void addVisit(){
        /* addVisit is a static method, it can only use static var*/
        visitedCnt++;
    }

    protected static int getVisitedCnt(){
        if (visitedCnt > 1) {
            System.out.println("This art work has been visited " + visitedCnt + " times.\n");
        } else {
            System.out.println("This art work has been visited " + visitedCnt + " time.\n");
        }
        return visitedCnt;
    }

    public static void main(String[] args) {
        /* even v1, v2, v3 is the same value of ArtWorks.visitedCnt,
        *  but since ArtWorks.visitedCnt is private, it is better to be accessd like v1. */
        int v1 = ArtWorks.getVisitedCnt();
        int v2 = ArtWorks.visitedCnt;
        int v3 = visitedCnt;
        addVisit();

        // byte operation
        int a = 60; // binary of a: 0011 1100
        int b = 13; // binary of b: 0000 1101
        System.out.println("a & b = " + (a & b) + ".\n"); // 0000 1100
        System.out.println("a | b = " + (a | b) + ".\n"); // 0011 1101
        System.out.println("a ^ b = " + (a ^ b) + ".\n"); // 0011 0001
        System.out.println("~a = " + ~a + ".\n"); // 1100 0011
        System.out.println("a >> 2 = " + (a >> 2) + ".\n"); // (0000) 1111, the first 4 0 will be droped.
        System.out.println("a << 2 = " + (a << 2) + ".\n"); // 1111 0000
        System.out.println("a >>> 2 = " + (a >>> 2) + ".\n"); // 0000 1111
    }
}

class Animate extends ArtWorks{

    public Animate(String n, int y){
        /* name and publishedYear are extended from father class "ArtWorks" */
        name = n;
        publishYear = y;
        // price = p; Since price is private in ArtWork, it can not be accessed directly.
        // ArtWorks.getter(price) can access price
    }

    void setScore(float score){
        /* even imbdScore is protected, Animate and ArtWorks are in the same package/file, it can be accessed. */
        imbdScore = score;
    }
}

abstract class SuperPower{
    /* Abstract class can not be used to instance object
     * and if one class contains abstract method, this class must be abstract class.*/
    private String name;
    protected int level, access_level;

    /* An abstract method is a method without any implementation,
     * the concrete implementation of the method is provided by the subclass. */
    public abstract boolean canAccess(int currLevel);
    public abstract void destroy();

}

class PlayGround{
    Integer x1 = 1;
    int x2 = 1;

    public static void main(String[] args) {
        /* x1 is a Number class, it has some methods of Number, like this doubleValue()
         * x2 is just a var, it can not use these methods. */
        double y1 = x1.doubleValue();
        double y2 = x2;
    }
}
