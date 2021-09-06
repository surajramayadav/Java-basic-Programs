import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class hash {
    public static void main(String[] args) {
        Map<Object, Object> map = new HashMap<Object, Object>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 3);
        System.out.println(map.values());
        Set<Object> uniqueValues = new HashSet<Object>(map.values());
        int len=map.size();
       System.out.println(uniqueValues);
    }
}
