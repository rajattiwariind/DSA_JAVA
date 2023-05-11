public class Functions {
    public static void main(String []args){
        int a=5;
        int b=10;
        add(a,b);
        int c=9;
        add(b,c);
        add(a,c);
    }
    public static void add(int a ,int b){
        int sum = a+b;
        System.out.println(sum);
    }
}
