import java.util.LinkedHashMap;
import java.util.Map;

public class Maps {
    public static void main(String [] args){
        LinkedHashMap<String,Integer> hashMap= new LinkedHashMap<>();
        hashMap.put("Rajat",916547);
        hashMap.put("Lucky",945742);
        hashMap.put("Sid",567789);
        hashMap.put("ABC",123456);


        for (Map.Entry<String, Integer>map : hashMap.entrySet()){
            System.out.println("Key is = " + map.getKey() + " Phone number= " + map.getValue());
        }
    }
}
