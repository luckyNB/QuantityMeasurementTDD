package com;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void given0feetAnd0feetIfEqual_ShouldReturnTrue() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void givenDifferentFeetValues_ShouldReturnFalse() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(1.0);
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenOneNUllValueShouldReturnFalse() {
        Feet feet1 = new Feet(3.0);
        boolean result = feet1.equals(null);
        Assert.assertFalse(false);
    }
}
