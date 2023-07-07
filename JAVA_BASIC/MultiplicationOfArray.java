public class MulArray {
    public static void main(String[]args){
        int mul=1;
        int []arr={1,2,3,4,5};
        for (int i=0; i<arr.length; i++){
            mul=mul*arr[i];
        }
        System.out.println(mul);
    }
}
