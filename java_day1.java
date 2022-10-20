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
