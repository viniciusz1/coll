package TreeMap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class at5 {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap();

        map.put("Red",1);
        map.put("Green",2);
        map.put("Black",3);
        map.put("White",4);
        map.put("Blue",5);

        for(Map.Entry x: map.entrySet()){
            System.out.println(x.getKey());
        }
        Set<String> keys = map.keySet();
        for(String key: keys){
            System.out.println(key);
        }

    }
}
