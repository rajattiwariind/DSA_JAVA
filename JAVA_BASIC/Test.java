import java.io.OptionalDataException;

public class Test {
    public static void main(String[]args){
        String message="Masai school is transformation in education";
        String[] words = message.split("");
        for (int i = 0; i<words.length; i++){
            System.out.println(words[i]);
        }
    }
}
