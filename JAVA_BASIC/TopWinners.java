import java.util.HashMap;
import java.util.Map;

public class House {
    public static void main(String[] args){
        HashMap<String, String[]> hashMap = new HashMap<>();

        String topRow = "top_row";
        String [] topRowWinners = {"ram","aashu","rajat"};
        hashMap.put(topRow, topRowWinners);

        String middleRow = "middle_row";
        String [] middleRowWinners = {"sita","laxman","sid","surya"};
        hashMap.put(middleRow,middleRowWinners);

        String bottomRow = "bottom_row";
        String [] bottomRowWinners = {"floyd","leo"};
        hashMap.put(bottomRow,bottomRowWinners);
        for (Map.Entry<String, String[]> map: hashMap.entrySet()){

            String key = map.getKey();
            String[] value = map.getValue();
            for (int i=0; i<value.length; i++){
                if (value[i].length()>4){
                    System.out.println(value[i]);
                }
            }
        }
    }
}
