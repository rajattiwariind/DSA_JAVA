public class LowerToUpper {
    public static void main(String []args){
     char a='a';
     char out=LowerToUpper(a);
        System.out.println(out);
    }
    public static char LowerToUpper(char a){
        return (char)(a-32);
    }
}
