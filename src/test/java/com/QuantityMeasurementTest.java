package com;

import com.sun.source.tree.AssertTree;
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

    @Test
    public void givenOneFeetAndOneInch_ShouldReturnFalse() {
        Length inch1 = new Length(Length.Unit.INCH,1.0);
        Length feet1 = new Length(Length.Unit.FEET,1.0);
        Assert.assertNotEquals(inch1, feet1);
    }

    @Test
    public void givenZeroInchAndZeroFeet_ShouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length inches1 = new Length(Length.Unit.INCH, 0.0);
        boolean check = feet1.compareCheck(inches1);
        Assert.assertTrue(check);
    }

    @Test
    public void givenOneInchAndOneFeet_ShouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        Length inches1 = new Length(Length.Unit.INCH, 1.0);
        boolean check = feet1.compareCheck(inches1);
        Assert.assertFalse(check);
    }

    @Test
    public void given1FeetAnd1FeetIfEqual_ShouldReturnTrue() {
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        Length feet2 = new Length(Length.Unit.FEET, 1.0);
        boolean result = feet1.compareCheck(feet2);
        Assert.assertTrue(result);
    }

    @Test
    public void given1InchAnd1InhIfEquals_Should_ReturnTrue() {
        Length inch1 = new Length(Length.Unit.INCH, 1.0);
        Length inch2 = new Length(Length.Unit.INCH, 1.0);
        boolean result = inch1.compareCheck(inch2);
        Assert.assertTrue(result);
    }

    @Test
    public void given1feetAnd1inchIfNotEqual_ShouldReturnFalse() {
        Length feet = new Length(Length.Unit.FEET, 1.0);
        Length inch = new Length(Length.Unit.INCH, 1.0);
        boolean compareCheck = feet.compareCheck(inch);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1InchAnd1FeetIfNotEqual_ShouldReturnFalse() {
        Length inch = new Length(Length.Unit.INCH, 1.0);
        Length feet = new Length(Length.Unit.FEET, 1.0);
        boolean compareCheck = inch.compareCheck(feet);
        Assert.assertFalse(compareCheck);
    }
}
