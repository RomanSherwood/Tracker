package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax5To2Then5() {
        int result = Max.max(5, 2);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax10To10Then10() {
        int result = Max.max(10, 10);
        assertThat(result, is(10));
    }

    @Test
    public void whenMax10To5To2Then10() {
        int result = Max.max(10, 5, 2);
        assertThat(result, is(10));
    }

    @Test
    public void whenMax35To61To1To22Then35() {
        int result = Max.max(35, 61, 1, 22);
        assertThat(result, is(61));
    }
}