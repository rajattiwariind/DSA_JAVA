import java.util.Scanner;

public class DotsAndDashesAgain {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=scanner.nextInt();
        for(int i=1; i<=num; i++){
            for(int j=1; j<=num; j++){
                if(i%2==0){
                    System.out.print("*");
                }else{
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}
