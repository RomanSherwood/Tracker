package ru.job4j.oop;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when00To20Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expected = 2.0;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00To20To35Then20() {
        Point a = new Point(0, 2, 3);
        Point b = new Point(0, 0, 5);
        double expected = 2.82;
        double out = a.distance3D(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}