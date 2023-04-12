import java.util.Scanner;

public class EasyWoodCutter {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=scanner.nextInt();
        if(a%3==0){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }

    }
