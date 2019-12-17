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

    @Test
    public void given0InchesAnd0InchesIfEqual_ShouldReturnTrue() {
        Inches inche1 = new Inches(0.0);
        Inches inche2 = new Inches(0.0);
        Assert.assertEquals(inche1, inche2);
    }

    @Test
    public void givenDifferentInchValues_ShouldReturnFalse() {
        Inches inch1 = new Inches(0.0);
        Inches inch2 = new Inches(1.0);
        Assert.assertNotEquals(inch1, inch2);
    }
}
