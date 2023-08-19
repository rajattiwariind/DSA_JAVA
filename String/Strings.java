public class Strings {
    public static void main(String[]args){
        String name= "Rajat";

        int length =name.length();

        for(int i=0; i<length; i++){
            char ch=name.charAt(i);
            System.out.println(ch);
        }
    }
}
