import java.util.Scanner;

public class SumOfRows {
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
        System.out.println("Enter the row number");
        int rowNo = sc.nextInt();
        if (rowNo > row) {
            System.out.println("Invalid row number");
            return;
        }
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == rowNo - 1) {
                    sum=sum+arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
