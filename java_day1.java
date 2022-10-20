class Juice {
    enum JuiceSize {SMALL, MEDIUM, LARGE}
    enum JuiceTaste {SWEET, SOUR, CLOD, HOT}
    JuiceSize size;
    JuiceTaste taste;

    String name;
    int price;

    /* Construction method
     * One class should has at least one construction method,
     * And can have more than one construction methods.
     */
    public Juice(){

    }

    public Juice(String juiceName, int juicePrice){
        name = juiceName;
        price = juicePrice;
        System.out.println("This is a " + name + ".\n");
        System.out.println("Its' price is $" + price + ".\n");
    }
    void sold(){

    }

    boolean isEmpty(){
        return false;
    }

    void drink(){

    }

    JuiceTaste getTaste(){
        return taste;
    }

    public static void main (String[] args){
        Juice myJuice = new Juice("Apple Juice", 15);
    }
}


public class HelloWorld {
    public static void main(String[] args) {
        Juice j = new Juice("Apple Juice", 15);
        j.size = Juice.JuiceSize.LARGE;
        System.out.println("Hello world!");
    }
}

public class Student {
    /* personal information */
    String stuName, stuId;
    int stuAge, stuHeight, stuWeight;

    /* basic information */
    enum Grade {PRIME, MIDDLE, HIGH, COLLEGE}
    Grade stuGrade;
    int score1, score2, score3;

    /* Construction method */
    public Student(String name, String id, int age){
        stuName = name;
        stuId = id;
        stuAge = age;
        stuGrade = Grade.COLLEGE;
    }

    /* function */
    String getStuName() {
        System.out.println("This is " + stuName + ".\n");
        return stuName;
    }

    int getStuAge(){
        System.out.println("The student is " + stuAge + " years old.\n");
        return stuAge;
    }

    int getStuHeight(){
        System.out.println("The student is " + stuHeight + " cm tall.\n");
        return stuHeight;
    }

    int getStuWeight(){
        System.out.println("The student is " + stuWeight + " kg.\n");
        return stuWeight;
    }

    int setScore1(int score) {
        score1 = score;
        return score;
    }

    int setScore2(int score) {
        score2 = score;
        return score;
    }

    int setScore3(int score) {
        score3 = score;
        return score;
    }

    void getAveScore() {
        float aveScore = ((float)score1 + (float)score2 + (float)score3) / 3;
        System.out.println("The average score of this student is " + aveScore + ".\n");
    }

    /* main function */
    public static void main(String[] args){
        Student newStudent = new Student("Kazusa", "44211599", 25);
        newStudent.getStuName();
        newStudent.setScore1(80);
        newStudent.setScore2(90);
        newStudent.setScore3(90);
        newStudent.getAveScore();
    }

}

class Circle {
    final double PI = 3.1415926535;
    double diameter;

    public Circle(double di) {
        diameter = di;
    }

    void getPerimeter(){
        System.out.println("Perimeter of this circle is " + diameter * PI + ".\n");
    }

    void getArea(){
        System.out.println("Area of this circle is " + ((diameter / 2) * (diameter / 2) * PI) + ".\n");
    }

    public static void main(String[] args) {
        Circle myCircle = new Circle(10);
        myCircle.getArea();
        myCircle.getPerimeter();
    }
}
