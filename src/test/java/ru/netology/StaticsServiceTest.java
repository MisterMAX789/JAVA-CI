package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StaticsServiceTest {

    @Test
    void findMax() {
   StaticsService service = new StaticsService();
   long [] incomesInBillion = {1, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
   long expected = 12;
   long actual = service.findMax(incomesInBillion);
   assertEquals(expected,actual);
    }
}