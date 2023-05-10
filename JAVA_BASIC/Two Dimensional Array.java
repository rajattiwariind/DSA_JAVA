public class TwoDimensional {
    public static void main(String []args){
        int[][] twoDimen={
                {40,50,60},
                {79,65,84},
                {55,67,89}
        };
        int marks_0_1=twoDimen[0][1];
       for(int student=0; student<3; student++){
           for (int marks=0; marks<3; marks++){
               System.out.print(twoDimen[student][marks]+" ");
           }
           System.out.println();
       }
    }
}
