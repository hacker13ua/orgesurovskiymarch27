package com.esurovskiy;

import java.util.Collections;
import java.util.List;

/**
 * TODO: write javadoc
 *
 * @author Evgeniy Surovskiy
 */
public class MainGenerator {
    public static void main(String[] args) {
        final MyNumGenerator myNumGenerator =
                new MyNumGenerator(5, 10);
        List<Integer> generate = myNumGenerator.generate();
        System.out.println(generate);
        Collections.sort(generate);
        System.out.println(generate);
        Collections.shuffle(generate);
        System.out.println(generate);
        System.out.println(Collections.max(generate));
        final List<Integer> unmodifiableList = Collections.unmodifiableList(generate);
        generate.add(1000);
        System.out.println(unmodifiableList);
        unmodifiableList.add(100);
    }
}
