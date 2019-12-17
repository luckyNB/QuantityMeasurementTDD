package com;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void given0feetAnd0feetIfEqual_ShouldReturnTrue() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length feet2 = new Length(Length.Unit.FEET,0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void givenDifferentFeetValues_ShouldReturnFalse() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length feet2 = new Length(Length.Unit.FEET,1.0);
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenOneNUllValueShouldReturnFalse() {
        Length feet1 = new Length(Length.Unit.FEET,3.0);
        boolean result = feet1.equals(null);
        Assert.assertFalse(false);
    }
    @Test
    public void given0InchesAnd0InchesIfEqual_ShouldReturnTrue() {
        Length inche1 = new Length(Length.Unit.INCH,0.0);
        Length inche2 = new Length(Length.Unit.INCH,0.0);
        Assert.assertEquals(inche1, inche2);
    }

    @Test
    public void givenDifferentInchValues_ShouldReturnFalse() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = new Length(Length.Unit.INCH,1.0);
        Assert.assertNotEquals(inch1, inch2);
    }
}
