package com.esurovskiy;

import java.util.HashSet;
import java.util.Set;

/**
 * TODO: write javadoc
 *
 * @author Evgeniy Surovskiy
 */
public class SetsExample2 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("aaa");
        set.add("bbb");
        set.add("ccc");
        set.add("aaa");
        System.out.println(set);

        Set<Car> cars = new HashSet<>();
        cars.add(new Car("Ford", 100));
        cars.add(new Car("Subaru", 100));
        System.out.println(cars.contains(null));
        System.out.println(cars);
        System.out.println(cars.contains(new Car("Subaru", 100)));
    }
}
