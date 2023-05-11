import java.util.Scanner;

public class DivisionTask {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n;i++){
            arr[i]= sc.nextInt();//read the input
        }
        for (int i=0; i<n; i++){
           for(int j=0; j< arr.length; j++) {
               if(arr[i]==0){
                   System.out.println("to low");
               } else if (arr[i]==-1) {
                   System.out.println("Not possible");

               }
           }

        }
    }
}
