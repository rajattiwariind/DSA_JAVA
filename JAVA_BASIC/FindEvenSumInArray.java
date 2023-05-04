import java.util.Scanner;

public class FindEvenSumInArray {

    // Main method
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the size of the Array: ");
        int n = sc.nextInt();


        int arr[] = new int[n];


        System.out.println("Enter " + n + " element(s) of the Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        int evenSum = 0;

        System.out.println("The sum of all Even numbers:");


        for (int i = 0; i < arr.length; i++) {


            if (arr[i] % 2 == 0) {

                if (evenSum > 0) {
                    System.out.print(" + " + arr[i]);
                } else {
                    System.out.print(arr[i]);
                }


                evenSum = evenSum + arr[i];
            }
        }


        System.out.println(" = " + evenSum);

    }

}
