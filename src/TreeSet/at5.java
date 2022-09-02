package TreeSet;

import java.util.TreeSet;

public class at5 {
    public static void main(String[] args) {
        TreeSet<String> t_set1 = new TreeSet<String>();
        // use add() method to add values in the tree set
        t_set1.add("Red");
        t_set1.add("Green");
        t_set1.add("Black");
        t_set1.add("White");
        System.out.println("Free Tree set: "+t_set1);

        TreeSet<String> t_set2 = new TreeSet<String>();
        t_set2.add("Red");
        t_set2.add("Pink");
        t_set2.add("Black");
        t_set2.add("Orange");
        System.out.println("Second Tree set: "+t_set2);
        //comparison output in tree set
        TreeSet<String> result_set = new TreeSet<String>();
        for (String element : t_set1){
            System.out.println(t_set2.contains(element) ? "Yes" : "No");
        }
    }
}
