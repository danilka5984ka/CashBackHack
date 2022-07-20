package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void testRemainOne() {
        int actual = service.remain(0);
        int expected = 1000;

        assertEquals(actual, expected, "Test results");
    }

    @Test
    public void testRemainTwo() {
        int actual = service.remain(900);
        int expected = 100;

        assertEquals(actual, expected, "Test results");
    }
}