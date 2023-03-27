package ru.netology.stats;

import java.util.Arrays;
import java.util.OptionalDouble;

public class Main {
    public static void main(String[] args) {
        int[] salesAll = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        OptionalDouble testAvg = Arrays.stream(salesAll).average();
        System.out.println(testAvg);
    }
}