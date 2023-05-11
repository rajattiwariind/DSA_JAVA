public class Functions2 {
    public static void main(String[] args) {
        String a1 = "Rajat";
        String a2 = "Rajat";
        boolean output = equalsTo(a1,a2);
        System.out.println(output);
    }
    public static int add(int a, int b){
        return a+b;
    }
    public static boolean equalsTo(String a1, String a2){
        if (a1.equals(a2)){
            return  true;
        }else {
            return false;
        }
    }
}
