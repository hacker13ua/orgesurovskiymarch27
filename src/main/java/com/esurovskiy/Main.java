package com.esurovskiy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * TODO: write javadoc
 *
 * @author Evgeniy Surovskiy
 */
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        list.add("1");
        list.add("2");
        list.add("2");
        list.add("2");
        list.add("2");
        linkedList.add("l2");
        linkedList.add("l1");
        linkedList.add("l2");
        linkedList.add("l2");
        linkedList.add("l2");
        list.addAll(linkedList);
        list.remove(1);
        System.out.println(list);

        List<Integer> integerList = new ArrayList<>();
        for (int i = 10; i> 0; i--) {
            integerList.add(i);
        }
        integerList.remove((Integer) 9);
        System.out.println(integerList);
    }
}
