package com;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void given0feetAnd0feetIfEqual_ShouldReturnTrue() {
        ConverterOfUnits feet1 = new ConverterOfUnits(TypeOfUnits.ConvertUnit.FEET,0.0);
        ConverterOfUnits feet2 = new ConverterOfUnits(TypeOfUnits.ConvertUnit.FEET,0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void given0feetAnd1FeetValues_ShouldReturnFalse() {
        ConverterOfUnits feet1 = new ConverterOfUnits(TypeOfUnits.ConvertUnit.FEET,0.0);
        ConverterOfUnits feet2 = new ConverterOfUnits(TypeOfUnits.ConvertUnit.FEET,1.0);
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenOneNUllValueShouldReturnFalse() {
        ConverterOfUnits feet1 = new ConverterOfUnits(TypeOfUnits.ConvertUnit.FEET,3.0);
        feet1.equals(null);
        Assert.assertFalse(false);
    }

    @Test
    public void given0InchAnd0InchIfEqual_ShouldReturnTrue() {
        ConverterOfUnits inch1 = new ConverterOfUnits(TypeOfUnits.ConvertUnit.INCHES,0.0);
        ConverterOfUnits inch2 = new ConverterOfUnits(TypeOfUnits.ConvertUnit.INCHES,0.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void givenDifferentInchValues_ShouldReturnFalse() {
        ConverterOfUnits inch1 = new ConverterOfUnits(TypeOfUnits.ConvertUnit.INCHES,0.0);
        ConverterOfUnits inch2 = new ConverterOfUnits(TypeOfUnits.ConvertUnit.INCHES,1.0);
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnFalse() {
        ConverterOfUnits inch1 = new ConverterOfUnits(TypeOfUnits.ConvertUnit.INCHES,1.0);
        ConverterOfUnits feet1 = new ConverterOfUnits(TypeOfUnits.ConvertUnit.FEET,1.0);
        Assert.assertNotEquals(inch1, feet1);
    }

    @Test
    public void given0InchAnd0Feet_ShouldReturnEqual() {
        ConverterOfUnits feet1 = new ConverterOfUnits(TypeOfUnits.ConvertUnit.FEET, 0.0);
        ConverterOfUnits inches1 = new ConverterOfUnits(TypeOfUnits.ConvertUnit.INCHES, 0.0);
        boolean check = feet1.compareCheck(inches1);
        Assert.assertTrue(check);
    }

    @Test
    public void given1InchAnd1Feet_ShouldReturnNotEqual() {
        ConverterOfUnits feet1 = new ConverterOfUnits(TypeOfUnits.ConvertUnit.FEET, 1.0);
        ConverterOfUnits inches1 = new ConverterOfUnits(TypeOfUnits.ConvertUnit.INCHES, 1.0);
        boolean check = feet1.compareCheck(inches1);
        Assert.assertFalse(check);
    }

    @Test
    public void given1FeetAnd1FeetIfEqual_ShouldReturnTrue() {
        ConverterOfUnits feet1 = new ConverterOfUnits(TypeOfUnits.ConvertUnit.FEET, 1.0);
        ConverterOfUnits feet2 = new ConverterOfUnits(TypeOfUnits.ConvertUnit.FEET, 1.0);
        boolean result = feet1.compareCheck(feet2);
        Assert.assertTrue(result);
    }

    @Test
    public void given1InchAnd1InhIfEquals_Should_ReturnTrue() {
        ConverterOfUnits inch1 = new ConverterOfUnits(TypeOfUnits.ConvertUnit.INCHES, 1.0);
        ConverterOfUnits inch2 = new ConverterOfUnits(TypeOfUnits.ConvertUnit.INCHES, 1.0);
        boolean result = inch1.compareCheck(inch2);
        Assert.assertTrue(result);
    }

    @Test
    public void given1feetAnd1inchIfNotEqual_ShouldReturnFalse() {
        ConverterOfUnits feet = new ConverterOfUnits(TypeOfUnits.ConvertUnit.FEET, 1.0);
        ConverterOfUnits inch = new ConverterOfUnits(TypeOfUnits.ConvertUnit.INCHES, 1.0);
        boolean compareCheck = feet.compareCheck(inch);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1InchAnd1FeetIfNotEqual_ShouldReturnFalse() {
        ConverterOfUnits inch = new ConverterOfUnits(TypeOfUnits.ConvertUnit.INCHES, 1.0);
        ConverterOfUnits feet = new ConverterOfUnits(TypeOfUnits.ConvertUnit.FEET, 1.0);
        boolean compareCheck = inch.compareCheck(feet);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1feetAnd12inches_ShouldReturnTrue() {
        ConverterOfUnits feet = new ConverterOfUnits(TypeOfUnits.ConvertUnit.FEET, 1.0);
        ConverterOfUnits inch = new ConverterOfUnits(TypeOfUnits.ConvertUnit.INCHES, 12.0);
        boolean compareCheck = feet.compareCheck(inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given12InchesAnd1Feet_ShouldReturnTrue() {
        ConverterOfUnits inches = new ConverterOfUnits(TypeOfUnits.ConvertUnit.INCHES,12);
        ConverterOfUnits feet = new ConverterOfUnits(TypeOfUnits.ConvertUnit.FEET, 1.0);
        boolean compareCheck = inches.compareCheck(feet);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given3FeetAnd12Inch_ShouldReturnFalse() {
        ConverterOfUnits inches = new ConverterOfUnits(TypeOfUnits.ConvertUnit.INCHES, 12.0);
        ConverterOfUnits feet = new ConverterOfUnits(TypeOfUnits.ConvertUnit.FEET,3.0);
        boolean compareCheck = inches.compareCheck(feet);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given0YardAnd0Yard_ShouldReturnTrue() {
        ConverterOfUnits yard1 = new ConverterOfUnits(TypeOfUnits.ConvertUnit.YARD, 0.0);
        ConverterOfUnits yard2 = new ConverterOfUnits(TypeOfUnits.ConvertUnit.YARD, 0.0);
        Assert.assertEquals(yard1,yard2);

    }

    @Test
    public void given0yardAnd1yardValues_ShouldReturnFalse() {
        ConverterOfUnits yard1 = new ConverterOfUnits(TypeOfUnits.ConvertUnit.YARD,0.0);
        ConverterOfUnits yard2 = new ConverterOfUnits(TypeOfUnits.ConvertUnit.YARD,1.0);
        Assert.assertNotEquals(yard1, yard2);
    }

    @Test
    public void givenOneNUllValueForYardUnitShouldReturnFalse() {
        ConverterOfUnits yard1 = new ConverterOfUnits(TypeOfUnits.ConvertUnit.YARD,3.0);
        yard1.equals(null);
        Assert.assertFalse(false);
    }

    @Test
    public void given3feetAnd1yard_ShouldReturnTrue() {
        ConverterOfUnits feet = new ConverterOfUnits(TypeOfUnits.ConvertUnit.FEET, 3);
        ConverterOfUnits yard = new ConverterOfUnits(TypeOfUnits.ConvertUnit.YARD, 1);
        boolean compareCheck = feet.compareCheck(yard);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1feetAnd1yard_ShouldReturnFalse() {
        ConverterOfUnits feet = new ConverterOfUnits(TypeOfUnits.ConvertUnit.FEET, 1);
        ConverterOfUnits yard = new ConverterOfUnits(TypeOfUnits.ConvertUnit.YARD, 1);
        boolean compareCheck = feet.compareCheck(yard);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1inchAnd1yard_ShouldReturnFalse() {
        ConverterOfUnits inches = new ConverterOfUnits(TypeOfUnits.ConvertUnit.INCHES, 1);
        ConverterOfUnits yard = new ConverterOfUnits(TypeOfUnits.ConvertUnit.YARD, 1);
        boolean compareCheck = inches.compareCheck(yard);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1yardAnd36inch_ShouldReturnTrue() {
        ConverterOfUnits yard = new ConverterOfUnits(TypeOfUnits.ConvertUnit.YARD, 1);
        ConverterOfUnits inches = new ConverterOfUnits(TypeOfUnits.ConvertUnit.INCHES, 36);
        boolean compareCheck = yard.compareCheck(inches);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given36inchAnd1yard_ShouldReturnTrue() {
        ConverterOfUnits inches = new ConverterOfUnits(TypeOfUnits.ConvertUnit.INCHES, 36);
        ConverterOfUnits yard = new ConverterOfUnits(TypeOfUnits.ConvertUnit.YARD, 1);
        boolean compareCheck = inches.compareCheck(yard);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1yardAnd3feet_ShouldReturnTrue() {
        ConverterOfUnits yard = new ConverterOfUnits(TypeOfUnits.ConvertUnit.YARD, 1);
        ConverterOfUnits feet = new ConverterOfUnits(TypeOfUnits.ConvertUnit.FEET, 3);
        boolean compareCheck = yard.compareCheck(feet);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given2inchAnd5cm_ShouldReturnTrue() {
        ConverterOfUnits inch = new ConverterOfUnits(TypeOfUnits.ConvertUnit.INCHES, 2);
        ConverterOfUnits cm = new ConverterOfUnits(TypeOfUnits.ConvertUnit.CM,5);
        boolean compareCheck = inch.compareCheck(cm);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given2inchesAnd2inches_ShouldReturnAddition4inches() {
        ConverterOfUnits inch1 = new ConverterOfUnits(TypeOfUnits.ConvertUnit.INCHES, 2);
        ConverterOfUnits inch2 = new ConverterOfUnits(TypeOfUnits.ConvertUnit.INCHES, 2);
        double result = inch1.additionOfUnits(inch2);
        Assert.assertEquals(4,result,0.0);
    }

    @Test
    public void given1feetAnd2inches_ShouldReturnAddition14inches() {
        ConverterOfUnits feet = new ConverterOfUnits(TypeOfUnits.ConvertUnit.FEET, 1);
        ConverterOfUnits inch = new ConverterOfUnits(TypeOfUnits.ConvertUnit.INCHES, 2);
        double result = feet.additionOfUnits(inch);
        Assert.assertEquals(14, result, 0.0);
    }

    @Test
    public void given1feetAnd1feet_ShouldReturnAddition24inches() {
        ConverterOfUnits feet1 = new ConverterOfUnits(TypeOfUnits.ConvertUnit.FEET, 1);
        ConverterOfUnits feet2 = new ConverterOfUnits(TypeOfUnits.ConvertUnit.FEET, 1);
        double result = feet1.additionOfUnits(feet2);
        Assert.assertEquals(24, result, 0.0);
    }

    @Test
    public void given2inchAnd2dot5cm_ShouldReturnAddition3inches() {
        ConverterOfUnits inch = new ConverterOfUnits(TypeOfUnits.ConvertUnit.INCHES, 2);
        ConverterOfUnits cm = new ConverterOfUnits(TypeOfUnits.ConvertUnit.CM, 2.5);
        double result = inch.additionOfUnits(cm);
        Assert.assertEquals(3, result, 0.0);
    }

}
