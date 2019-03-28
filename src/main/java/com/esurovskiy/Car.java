package com.esurovskiy;


public class Car {
    String name;
    int speed;

    public Car(final String name, final int speed) {
        this.name = name;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(final Object obj) {
        return true;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
