package ru.netology.stats;

//8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;

public class StatsServiceTest {
    StatsService service = new StatsService();
    int[] salesAll = {
            8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
    };

    @Test
    void sumSales() {

        int expected = 180;
        int actual = service.sumSales(salesAll);
        Assertions.assertEquals(expected, actual);


    }

    @Test
    void avgSales() {
        OptionalDouble expected = OptionalDouble.of(15);
        OptionalDouble actual = service.avgSales(salesAll);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void monthMaxSales() {
        int expected = 8;
        int actual = service.monthMaxSales(salesAll);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void monthMinSales() {
        int expected = 9;
        int actual = service.monthMinSales(salesAll);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void monthsBelowAvg() {
        int expected = 5;
        int actual = service.monthsBelowAvg(salesAll);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void monthsAboveAvg() {
        int expected = 5;
        int actual = service.monthsAboveAvg(salesAll);
        Assertions.assertEquals(expected, actual);

    }
}
