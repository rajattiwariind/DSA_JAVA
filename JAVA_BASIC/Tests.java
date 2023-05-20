public class Tests {

    static int staticCounter = 0;
    int count = 0;
    public static void main(String [] args){
        incrementStaticCounter();
        Tests t = new Tests();
        t.incrementCounter();

        System.out.println("Static counter value is " + staticCounter);
        System.out.println("Counter value is " + t.count);
    }
    public static void incrementStaticCounter(){
        staticCounter++;
    }
    public void incrementCounter(){
        count++;
    }
}
