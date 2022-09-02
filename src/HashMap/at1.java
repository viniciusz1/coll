package HashMap;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class at1 {
    public static void main(String[] args) {
        HashMap<Integer,String> hash_map= new HashMap<Integer,String>();
        hash_map.put(1, "Red");
        hash_map.put(2, "Green");
        hash_map.put(3, "Black");
        hash_map.put(4, "White");
        hash_map.put(5, "Blue");
        for(Map.Entry x:hash_map.entrySet()){
            System.out.println(x.getValue()+" "+x.getKey());
        }
    }
}
