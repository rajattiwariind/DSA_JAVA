public class EqualTo42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        System.out.println("Enter the array element");
        int[] num = new int[n];
        int m = 42;

        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();


            if (num[i] == m) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
