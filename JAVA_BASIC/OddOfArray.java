import java.util.Scanner;

public class OddOfArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n= sc.nextInt();
        System.out.println("Enter the array element");
        int[] num=new int[n];

        for(int i=0; i<n; i++){
            num[i]= sc.nextInt();
        }
       for(int i=0; i<n; i++){
           if(num[i]%2!=0){
               System.out.println(num[i]);
           }
       }
    }
}
