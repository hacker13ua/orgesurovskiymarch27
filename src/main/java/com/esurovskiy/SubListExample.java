package com.esurovskiy;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class SubListExample {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        List<Integer> subList =
                new ArrayList<>(list.subList(3, 7));

        ListIterator<Integer> iter =
                subList.listIterator();
        while (iter.hasNext()) {
            Integer next = iter.next();
            iter.set(next * 2);
        }
        /*for (int i = 0; i < subList.size(); i++) {
            Integer doubleElem = subList.get(i) * 2;
            subList.set(i, doubleElem);
        }*/
        /*List<Integer> doubles = new ArrayList<>();
        for (final Integer integer : subList) {
            doubles.add(integer * 2);
        }
        subList.clear();
        subList.addAll(doubles);*/
        System.out.println(subList);
        System.out.println(list);
    }
}
