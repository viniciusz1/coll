package Arraylist;

import java.util.ArrayList;

public class at3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        numbers.add(0, 9);
        System.out.println(numbers);
    }
}
