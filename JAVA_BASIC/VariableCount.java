import java.util.LinkedHashMap;
import java.util.Map;

public class VariableCount {
   public static void main(String []args){
       String[] names={"Masai","School"};
       LinkedHashMap<Character,Integer> hashMap = new LinkedHashMap<>();

       for(int i=0; i< names.length;i++) {

           for (int j = 0; j < names[i].length(); j++) {
               if (hashMap.containsKey(names[i].charAt(j))) {
                   int count = hashMap.get(names[i].charAt(j));
                   hashMap.put(names[i].charAt(j), count + 1);
               } else {
                   hashMap.put(names[i].charAt(j), 1);
               }
           }
       }

           for(Map.Entry<Character,Integer> map : hashMap.entrySet()) {
               System.out.println(map.getKey()+" "+ map.getValue());
           }
       }
   }
