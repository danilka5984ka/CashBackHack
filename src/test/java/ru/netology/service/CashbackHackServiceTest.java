package ru.netology.service;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import javax.swing.plaf.SpinnerUI;

public class CashbackHackServiceTest extends TestCase {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void testRemainOne() {
        int actual = service.remain(700);
        int expected = 300;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemainTwo() {
        int actual = service.remain(0);
        int expected = 1000;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemainThree() {
        int actual = service.remain(1000);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }
}