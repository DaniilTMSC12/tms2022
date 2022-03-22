package com.tms.task3;

public class Main {
    public static void main(String[] args) {
        Integer[] integers = {1, 8, 10, 3, 0, -15};
        MinMax<Integer> minMax = new MinMax<>(integers);
        printMinMaxNumbers(minMax);
    }

    public static void printMinMaxNumbers(MinMax minMax) {
        System.out.println(minMax);
        System.out.println("Минимальное значение равно " + minMax.getMinimumNumber());
        System.out.println("Максимальное значение равно " + minMax.getMaximumNumber());
    }

}
