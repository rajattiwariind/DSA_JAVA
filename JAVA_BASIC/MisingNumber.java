import java.util.Scanner;

public class MisingNumber {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();

        String[] numbers = number.split("");

        int[]arr = new int[numbers.length];
        for (int i=0; i< arr.length ; i++){
            arr[i]=Integer.parseInt(numbers[i]);
        }
        int n = arr.length+1;
        int SumOfNNumbers = n*(n+1)/2;
        int SumOfRemainingElement=0;

        for (int i=0; i< arr.length ; i++){
            SumOfRemainingElement = SumOfRemainingElement+arr[i];
        }
        int out = SumOfNNumbers-SumOfRemainingElement;
        System.out.println(out);
    }
}
