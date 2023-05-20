public class Tests {

    static int staticCounter = 0;
    int count = 0;
    public static void main(String [] args){
        incrementStaticCounter();
        Tests t = new Tests();
        t.incrementCounter();

        System.out.println("Static counter value is " + staticCounter);
        System.out.println("Counter value is " + t.count);

        //2nd Part

        incrementStaticCounter();

        t.incrementCounter();

        System.out.println("Static counter value is " + staticCounter);
        System.out.println("Counter value is " + t.count);

        //3rd Part

        incrementStaticCounter();
        Tests test1 = new Tests();
        test1.incrementCounter();

        System.out.println("Static counter value is " + staticCounter);
        System.out.println("Counter value is " + test1.count);
    }
    public static void incrementStaticCounter(){
        staticCounter++;
    }
    public void incrementCounter(){
        count++;
    }
}
