package com.esurovskiy;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * TODO: write javadoc
 *
 * @author Evgeniy Surovskiy
 */
public class SetNullExample {
    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();
        strings.add(null);
        System.out.println(strings.size());
        System.out.println(strings.contains(null));

        final ArrayList<Object> objects = new ArrayList<>();
        objects.add("new ");
        objects.add(null);
        System.out.println(objects);
    }
}
