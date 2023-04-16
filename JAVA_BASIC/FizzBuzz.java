import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=scanner.nextInt();
        for(int i=1; i<num; i++){
            System.out.println(i+"\t");
        }
            if(num%3==0 && num%5==0){
                System.out.println("FizzBuzz");
            }else if(num%3==0){
                System.out.println("Fizz");
            }else if(num%5==0){
                System.out.println("Buzz");
            }else{
                System.out.println(num);
            }
        }
    }
