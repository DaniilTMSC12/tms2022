package com.tms.task3;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class MinMax<T extends Comparable<T>> {
    private T[] mass;


    public T getMinimumNumber() {
        if (mass.length > 0) {
            T min = mass[0];
            for (T t : mass) {
                if (t.compareTo(min) < 0) {
                    min = t;
                }
            }
            return min;
        }
        return null;
    }

    public T getMaximumNumber() {
        if (mass.length > 0) {
            T max = mass[0];
            for (T t : mass) {
                if (t.compareTo(max) > 0) {
                    max = t;
                }
            }
            return max;
        }
        return null;
    }
}