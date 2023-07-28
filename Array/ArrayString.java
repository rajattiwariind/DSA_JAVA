public class Strings {
    public static void main(String[]args){
        String name = "Rajat";
        System.out.println(System.identityHashCode(name));
        name = "Tiwari";
        System.out.println(System.identityHashCode(name));
    }
}
