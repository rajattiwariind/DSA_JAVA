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
        System.out.println(threeDimen[0][1][2]);
    }
}
