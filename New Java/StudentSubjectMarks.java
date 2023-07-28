public class TestDrive {
    public static void main(String[] args) {

        int[][] twoDimen = {
                {10, 20, 30, 40, 50},

                {20, 30, 40, 50, 60},

                {30, 40, 50, 60, 70}
        };


         for (int students = 0; students < 3; students++) {
            for (int marks = 0; marks < 5; marks++) {
               System.out.print(twoDimen[students][marks] + " ");
            }
             System.out.println();
         }

    }
}

/*
           Subjects

           sub0    sub1   sub2   sub3   sub4

Student 0   10     20     30     40     50

Student 1   20     30     40     50     60

Student 2   30     40     50     60     70


 */
