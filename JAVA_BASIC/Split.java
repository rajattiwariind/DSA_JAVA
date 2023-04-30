public class Split {
    public static void main(String []args){
        String name = "Masai School is Amazing";
        String[] words = name.split(" ");  // Split based on space

        for(String s : words){
            System.out.println(s);
        }
    }
}
