package Arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class at2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        Iterator<Integer> hehe = numbers.iterator();
        while (hehe.hasNext()){
            System.out.println(hehe.next());
        }
    }
}
