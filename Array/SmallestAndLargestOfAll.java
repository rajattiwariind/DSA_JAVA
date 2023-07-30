public class SmallestAndLargestOfAll {
    public static void main(String[]args){
        System.out.println("Smallest and Largest Number");
        int arr[]={-2,0,8,4};
        int min = arr[0];
        int max = arr[0];
        for (int i=1; i<arr.length; i++){
                if (arr[i]<min){
                    min = arr[i];
                }else if (arr[i]>max){
                    max = arr[i];
                }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
