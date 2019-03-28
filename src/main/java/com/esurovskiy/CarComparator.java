package com.esurovskiy;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {
    @Override
    public int compare(final Car o1, final Car o2) {
        return Integer.compare(o1.speed, o2.speed);
    }
}
