import java.util.Scanner;

public class IdentifyPrime {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=scanner.nextInt();
        boolean IsPrime=true;
        for(int i=2; i<num; i++){
            if(num%i==0){
                IsPrime=false;
                break;
            }
        }
        if(IsPrime){
            System.out.println("The number is prime");
        }else{
            System.out.println("Not prime");
        }
    }
}
