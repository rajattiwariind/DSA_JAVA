public class Functions {
    public static void main(String []args){
        int a=5;
        int b=10;
        int sum=add(a,b);
        System.out.println(sum);
        int c=9;
        int sum_b_c=add(b,c);
        System.out.println(sum_b_c);
    }
    public static  int add (int a,int b){
        return a+b;
    }
}
