import java.util.Scanner;

public class Array {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n= sc.nextInt();
        System.out.println("Enter the array element");
        int[] num=new int[n];
        for(int i=0; i<n; i++){
            num[i]= sc.nextInt();
        }

        boolean IsPresent=false;
        for(int i=0; i<n;i++) {
            if (num[i] == 42) {
                IsPresent = true;
                break;
            }
        }
            if(IsPresent){
                System.out.println("42 is found");
            }else{
                System.out.println("42 is not found");
            }


    }
}
