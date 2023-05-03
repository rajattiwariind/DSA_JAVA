public class Score {
    public static void main(String []args){
        int[] scores={10,35,67,89,54};
        int largest=scores[0];
        for(int i=0; i< scores.length; i++){
            if(scores[i]>largest){
                largest=scores[i];
            }
        }
        System.out.println(largest);
    }
}
