package ru.netology.stats;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class StatsService {

    public int sumSales(int[] array) {

        return Arrays.stream(array).sum();
    }

    public OptionalDouble avgSales(int[] array) {
        return Arrays.stream(array).average();
    }

    public int monthMaxSales(int[] array) {
        int index = -1;

        OptionalInt max = Arrays.stream(array).max();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max.getAsInt()) {
                index = i;
            }


        }
        return index + 1;
    }

    public int monthMinSales(int[] array) {
        int index = -1;

        OptionalInt min = Arrays.stream(array).min();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == min.getAsInt()) {
                index = i;
            }


        }
        return index + 1;
    }

    public int monthsBelowAvg(int[] array) {
        int count = 0;
        OptionalDouble avg = Arrays.stream(array).average();

        for (int i = 0; i < array.length; i++) {
            if (array[i] < avg.getAsDouble()) {
                count++;
            }

        }
        return count;
    }

    public int monthsAboveAvg(int[] array) {
        int count = 0;
        OptionalDouble avg = Arrays.stream(array).average();
        for (int i = 0; i < array.length; i++) {
            if (array[i] > avg.getAsDouble()) {
                count++;
            }

        }
        return count;
    }


}
