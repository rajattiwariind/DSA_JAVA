public class threeDimen {
    public static void main(String[] args) {
        int[][][] threeDimen = {
                {
                        {
                                10, 20, 30
                        },                              //Electronics Department
                        {
                                20, 40, 80
                        }
                },
                {
                        {
                                10, 25, 65
                        },                            // CS Department
                        {
                                60, 70, 80
                        }
                },
                {
                        {
                                10, 21, 55
                        },
                        {                              //Mac Department
                                62, 40, 10
                        }
                }

        };

        for (int depart = 0; depart < 3; depart++) {
            for (int students = 0; students < 2; students++) {
                for (int marks = 0; marks < 3; marks++) {
                    System.out.print(threeDimen[depart][students][marks] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
