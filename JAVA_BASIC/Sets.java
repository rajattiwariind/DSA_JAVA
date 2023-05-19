import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Sets {
    public static void main(String []args){
        LinkedHashSet<String> set =new LinkedHashSet<>();
        set.add("India");
        set.add("India");
        set.add("USA");
        set.add("Japan");
        Iterator iterator= set.iterator();
        while(iterator.hasNext()){
            String data=(String)iterator.next();
            System.out.println(data);
        }
    }
}
