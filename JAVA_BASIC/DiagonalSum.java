import java.util.Scanner;

public class DiagonalSum {
    public static void main(String []args){
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
        int diagSum1=0;
        int diagSum2=0;
        for (int i = 0, j = row-1; i <row; i++,j--) {
            diagSum1=diagSum1+arr[i][i];
            diagSum2=diagSum2+arr[j][i];
        }
        System.out.println(diagSum1);
        System.out.println(diagSum2);
    }
}
