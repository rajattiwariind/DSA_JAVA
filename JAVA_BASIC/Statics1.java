public class Statics {
    static int StaticValue = 0;

    int NonStaticValue = 0;

    public static void main(String [] args){
        Statics statics = new Statics();
        statics.increment();
    }
    public void increment() {
        StaticValue++;
        NonStaticValue++;
        System.out.println("Static value " + StaticValue);
        System.out.println("Non Static Value " + NonStaticValue);
    }

}
