package com.esurovskiy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReverseExample {
    public static void main(String[] args) {
        List<String> strings = new LinkedList<>();
        List<String> reverseStrings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            strings.add("Element " + i);
        }
        System.out.println(strings);

        for (int i = strings.size() - 1; i > 0; i--) {
            reverseStrings.add(strings.get(i));
        }
        System.out.println(reverseStrings);




        /*while (strings.size() > 0) {
            reverseStrings.add(strings.removeLast());
        }
*/
        System.out.println(reverseStrings);

    }
}
