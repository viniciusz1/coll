package TreeMap;

import java.util.TreeMap;

public class at2 {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap();
        map.put("Red",1);
        map.put("Green",2);
        map.put("Black",3);
        map.put("White",4);
        map.put("Blue",5);

        TreeMap<String, Integer> newMap = (TreeMap<String, Integer>) map.clone();
        System.out.println(newMap);
    }
}
