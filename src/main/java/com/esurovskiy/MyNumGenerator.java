package com.esurovskiy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * TODO: write javadoc
 *
 * @author Evgeniy Surovskiy
 */
public class MyNumGenerator {
    int maxNum;
    int count;

    public MyNumGenerator(final int maxNum, int count) {
        this.maxNum = maxNum;
        this.count = count;
    }

    List<Integer> generate(){
        final Random rnd = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(rnd.nextInt(maxNum));
        }
        return list;
    }
}
