import java.util.HashMap;

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

        String[] topRowElements =hashMap.get("top_row");
        for (int i=0; i<topRowElements.length; i++){
            if (topRowElements[i].length()>4){
                System.out.println(topRowElements[i]);
            }
        }
    }
}
