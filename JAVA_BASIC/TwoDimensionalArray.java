public class TwoDimensional {

    public static void main(String[] args) {
        int[][][] threeDimen = {
                {
                        {10, 20, 30},                     //Electronic Department
                        {20, 40, 80}
                },
                {
                        {10, 25, 65},                            // CS Department
                        {60, 70, 80}
                },
                {
                        {10, 21, 55},
                        {62, 40, 10}                             //Mech Department
                }
        };
        for(int department=0; department<3; department++){
            for(int student=0; student<2;student++){
                for(int marks=0;marks<3;marks++){
                    System.out.print(threeDimen[department][student][marks]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
