import java.util.Scanner;

public class MaximumOfArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        System.out.println("Enter the array element");
        int[] arr = new int[n];

        int largest = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            if (arr[i]>largest) {
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}
