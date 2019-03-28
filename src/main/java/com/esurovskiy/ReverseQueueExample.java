package com.esurovskiy;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class ReverseQueueExample {
    public static void main(String[] args) {
        Deque<String> strings = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            strings.addLast("Elem " + i);
        }

        System.out.println(strings);
        List<String> reverse = new ArrayList<>();
        while (strings.size() > 0) {
            reverse.add(strings.pollLast());
        }
        System.out.println(reverse);
    }
}
