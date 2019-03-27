package com.esurovskiy;

import java.util.ArrayList;
import java.util.List;

public class RemoveFromList {
    public static void main(String[] args) {
        List<Long> longs = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            longs.add((long) i);
        }
        System.out.println(longs);
        longs.removeIf(aLong -> aLong % 2 == 0);
//        Iterator<Long> iterator = longs.iterator();
       /* while (iterator.hasNext()) {
            Long current = iterator.next();
            if (current % 2 == 0) {
                iterator.remove();
            }
        }*/


        System.out.println(longs);
    }
}
