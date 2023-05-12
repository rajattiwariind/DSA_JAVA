public class TwoDimen {
    public static void main(String []args){
        int [] a={10,20,40};

        int [][] twoDimen = {
                {40,50,60,70},
                {50,60,70,80},
                {60,70,80,90}
        };

        int marks_0_0 = twoDimen[2][2];

        for (int students = 0; students < 3; students++) {
            for (int marks = 0; marks < 4; marks++) {
                System.out.print(twoDimen[students][marks] + " ");
            }
            System.out.println();
        }
    }
}
