package com.esurovskiy;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetsExample {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linked = new LinkedHashSet<>();
        Set<String> tree = new TreeSet<>();
        for (int i = 0; i < 11; i++) {
            hashSet.add("Element " + i);
            linked.add("Element " + i);
            tree.add("Element " + i);
        }
        System.out.println(hashSet);
        System.out.println(linked);
        System.out.println(tree);

        Set<Car> cars = new TreeSet<>(new CarComparator());

        final Random rnd = new Random();
        for (int i = 0; i < 5; i++) {
            cars.add(new Car("Ford",
                    rnd.nextInt(20) + 100));
        }
        for (int i = 0; i < 5; i++) {
            cars.add(new Car("Subaru",
                    rnd.nextInt(20) + 100));
        }
        System.out.println(cars);
    }
}
