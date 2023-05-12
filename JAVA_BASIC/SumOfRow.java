import java.util.Scanner;

public class SumOfRow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row:");
        int row = sc.nextInt();
        System.out.println("Enter the column:");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Enter the array element");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Print the array element");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

}
