import java.util.Scanner;

public class AverageOfAll {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the number");
        for (int i = 0; i < arr .length; i++) {
            int value = scanner.nextInt();
            arr[i] = value;
        }

        int length = arr.length;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        double average = sum / length;

        System.out.println("Average of array : " + average);
    }
}
