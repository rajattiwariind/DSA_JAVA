import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n= sc.nextInt();
        System.out.println("Enter the array element");
        int[] num=new int[n];

        for(int i=0; i<n; i++){
            num[i]= sc.nextInt();
        }
        int reverse=0;
        for(int i=n-1; i>=0; i--){
            reverse=reverse+num[i];
            System.out.println(num[i]);
        }
    }
}
