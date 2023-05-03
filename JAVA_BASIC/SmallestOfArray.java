import java.util.Scanner;

public class Smallest {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int smallest=arr[0];
        for(int i=0; i<n; i++) {

            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println(smallest);
    }
}
