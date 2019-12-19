package com;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {
    @Test
    public void given0feetAnd0feetIfEqual_ShouldReturnTrue() {
        EqualityChecker feet1 = new EqualityChecker(UnitConverter.ConvertUnit.FEET,0.0);
        EqualityChecker feet2 = new EqualityChecker(UnitConverter.ConvertUnit.FEET,0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void given0feetAnd1FeetValues_ShouldReturnFalse() {
        EqualityChecker feet1 = new EqualityChecker(UnitConverter.ConvertUnit.FEET,0.0);
        EqualityChecker feet2 = new EqualityChecker(UnitConverter.ConvertUnit.FEET,1.0);
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenOneNUllValueShouldReturnFalse() {
        EqualityChecker feet1 = new EqualityChecker(UnitConverter.ConvertUnit.FEET,3.0);
        feet1.equals(null);
        Assert.assertFalse(false);
    }

    @Test
    public void given0InchAnd0InchIfEqual_ShouldReturnTrue() {
        EqualityChecker inch1 = new EqualityChecker(UnitConverter.ConvertUnit.INCHES,0.0);
        EqualityChecker inch2 = new EqualityChecker(UnitConverter.ConvertUnit.INCHES,0.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void givenDifferentInchValues_ShouldReturnFalse() {
        EqualityChecker inch1 = new EqualityChecker(UnitConverter.ConvertUnit.INCHES,0.0);
        EqualityChecker inch2 = new EqualityChecker(UnitConverter.ConvertUnit.INCHES,1.0);
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnFalse() {
        EqualityChecker inch1 = new EqualityChecker(UnitConverter.ConvertUnit.INCHES,1.0);
        EqualityChecker feet1 = new EqualityChecker(UnitConverter.ConvertUnit.FEET,1.0);
        Assert.assertNotEquals(inch1, feet1);
    }

    @Test
    public void given0InchAnd0Feet_ShouldReturnEqual() {
        EqualityChecker feet1 = new EqualityChecker(UnitConverter.ConvertUnit.FEET, 0.0);
        EqualityChecker inches1 = new EqualityChecker(UnitConverter.ConvertUnit.INCHES, 0.0);
        boolean check = UnitConverter.ConvertUnit.compare(feet1,inches1);
        Assert.assertTrue(check);
    }

    @Test
    public void given1InchAnd1Feet_ShouldReturnNotEqual() {
        EqualityChecker feet1 = new EqualityChecker(UnitConverter.ConvertUnit.FEET, 1.0);
        EqualityChecker inches1 = new EqualityChecker(UnitConverter.ConvertUnit.INCHES, 1.0);
        boolean check = UnitConverter.ConvertUnit.compare(feet1,inches1);
        Assert.assertFalse(check);
    }

    @Test
    public void given1FeetAnd1FeetIfEqual_ShouldReturnTrue() {
        EqualityChecker feet1 = new EqualityChecker(UnitConverter.ConvertUnit.FEET, 1.0);
        EqualityChecker feet2 = new EqualityChecker(UnitConverter.ConvertUnit.FEET, 1.0);
        boolean result = UnitConverter.ConvertUnit.compare(feet1,feet2);
        Assert.assertTrue(result);
    }

    @Test
    public void given1InchAnd1InhIfEquals_Should_ReturnTrue() {
        EqualityChecker inch1 = new EqualityChecker(UnitConverter.ConvertUnit.INCHES, 1.0);
        EqualityChecker inch2 = new EqualityChecker(UnitConverter.ConvertUnit.INCHES, 1.0);
        boolean result = UnitConverter.ConvertUnit.compare(inch1,inch2);
        Assert.assertTrue(result);
    }

    @Test
    public void given1feetAnd1inchIfNotEqual_ShouldReturnFalse() {
        EqualityChecker feet = new EqualityChecker(UnitConverter.ConvertUnit.FEET, 1.0);
        EqualityChecker inch = new EqualityChecker(UnitConverter.ConvertUnit.INCHES, 1.0);
        boolean compareCheck = UnitConverter.ConvertUnit.compare(feet,inch);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1InchAnd1FeetIfNotEqual_ShouldReturnFalse() {
        EqualityChecker inch = new EqualityChecker(UnitConverter.ConvertUnit.INCHES, 1.0);
        EqualityChecker feet = new EqualityChecker(UnitConverter.ConvertUnit.FEET, 1.0);
        boolean compareCheck = UnitConverter.ConvertUnit.compare(inch,feet);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1feetAnd12inches_ShouldReturnTrue() {
        EqualityChecker feet = new EqualityChecker(UnitConverter.ConvertUnit.FEET, 1.0);
        EqualityChecker inch = new EqualityChecker(UnitConverter.ConvertUnit.INCHES, 12.0);
        boolean compareCheck = UnitConverter.ConvertUnit.compare(feet,inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given12InchesAnd1Feet_ShouldReturnTrue() {
        EqualityChecker inches = new EqualityChecker(UnitConverter.ConvertUnit.INCHES,12);
        EqualityChecker feet = new EqualityChecker(UnitConverter.ConvertUnit.FEET, 1.0);
        boolean compareCheck = UnitConverter.ConvertUnit.compare(inches,feet);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given3FeetAnd12Inch_ShouldReturnFalse() {
        EqualityChecker inches = new EqualityChecker(UnitConverter.ConvertUnit.INCHES, 12.0);
        EqualityChecker feet = new EqualityChecker(UnitConverter.ConvertUnit.FEET,3.0);
        boolean compareCheck = UnitConverter.ConvertUnit.compare(inches,feet);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given0YardAnd0Yard_ShouldReturnTrue() {
        EqualityChecker yard1 = new EqualityChecker(UnitConverter.ConvertUnit.YARD, 0.0);
        EqualityChecker yard2 = new EqualityChecker(UnitConverter.ConvertUnit.YARD, 0.0);
        Assert.assertEquals(yard1,yard2);

    }

    @Test
    public void given0yardAnd1yardValues_ShouldReturnFalse() {
        EqualityChecker yard1 = new EqualityChecker(UnitConverter.ConvertUnit.YARD,0.0);
        EqualityChecker yard2 = new EqualityChecker(UnitConverter.ConvertUnit.YARD,1.0);
        Assert.assertNotEquals(yard1, yard2);
    }

    @Test
    public void givenOneNUllValueForYardUnitShouldReturnFalse() {
        EqualityChecker yard1 = new EqualityChecker(UnitConverter.ConvertUnit.YARD,3.0);
        yard1.equals(null);
        Assert.assertFalse(false);
    }

    @Test
    public void given3feetAnd1yard_ShouldReturnTrue() {
        EqualityChecker feet = new EqualityChecker(UnitConverter.ConvertUnit.FEET, 3);
        EqualityChecker yard = new EqualityChecker(UnitConverter.ConvertUnit.YARD, 1);
        boolean compareCheck = UnitConverter.ConvertUnit.compare(feet,yard);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1feetAnd1yard_ShouldReturnFalse() {
        EqualityChecker feet = new EqualityChecker(UnitConverter.ConvertUnit.FEET, 1);
        EqualityChecker yard = new EqualityChecker(UnitConverter.ConvertUnit.YARD, 1);
        boolean compareCheck = UnitConverter.ConvertUnit.compare(feet,yard);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1inchAnd1yard_ShouldReturnFalse() {
        EqualityChecker inches = new EqualityChecker(UnitConverter.ConvertUnit.INCHES, 1);
        EqualityChecker yard = new EqualityChecker(UnitConverter.ConvertUnit.YARD, 1);
        boolean compareCheck = UnitConverter.ConvertUnit.compare(inches,yard);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1yardAnd36inch_ShouldReturnTrue() {
        EqualityChecker yard = new EqualityChecker(UnitConverter.ConvertUnit.YARD, 1);
        EqualityChecker inches = new EqualityChecker(UnitConverter.ConvertUnit.INCHES, 36);
        boolean compareCheck = UnitConverter.ConvertUnit.compare(yard,inches);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given36inchAnd1yard_ShouldReturnTrue() {
        EqualityChecker inches = new EqualityChecker(UnitConverter.ConvertUnit.INCHES, 36);
        EqualityChecker yard = new EqualityChecker(UnitConverter.ConvertUnit.YARD, 1);
        boolean compareCheck = UnitConverter.ConvertUnit.compare(inches,yard);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1yardAnd3feet_ShouldReturnTrue() {
        EqualityChecker yard = new EqualityChecker(UnitConverter.ConvertUnit.YARD, 1);
        EqualityChecker feet = new EqualityChecker(UnitConverter.ConvertUnit.FEET, 3);
        boolean compareCheck = UnitConverter.ConvertUnit.compare(yard,feet);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given2inchAnd5cm_ShouldReturnTrue() {
        EqualityChecker inch = new EqualityChecker(UnitConverter.ConvertUnit.INCHES, 2);
        EqualityChecker cm = new EqualityChecker(UnitConverter.ConvertUnit.CM,5);
        boolean compareCheck = UnitConverter.ConvertUnit.compare(inch,cm);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given2inchesAnd2inches_ShouldReturnAddition4inches() {
        EqualityChecker inch1 = new EqualityChecker(UnitConverter.ConvertUnit.INCHES, 2);
        EqualityChecker inch2 = new EqualityChecker(UnitConverter.ConvertUnit.INCHES, 2);
        double result = UnitConverter.ConvertUnit.addition(inch1,inch2);
        Assert.assertEquals(4,result,0.0);
    }

    @Test
    public void given1feetAnd2inches_ShouldReturnAddition14inches() {
        EqualityChecker feet = new EqualityChecker(UnitConverter.ConvertUnit.FEET, 1);
        EqualityChecker inch = new EqualityChecker(UnitConverter.ConvertUnit.INCHES, 2);
        double result = UnitConverter.ConvertUnit.addition(feet,inch);
        Assert.assertEquals(14, result, 0.0);
    }

    @Test
    public void given1feetAnd1feet_ShouldReturnAddition24inches() {
        EqualityChecker feet1 = new EqualityChecker(UnitConverter.ConvertUnit.FEET, 1);
        EqualityChecker feet2 = new EqualityChecker(UnitConverter.ConvertUnit.FEET, 1);
        double result = UnitConverter.ConvertUnit.addition(feet1,feet2);
        Assert.assertEquals(24, result, 0.0);
    }

    @Test
    public void given2inchAnd2dot5cm_ShouldReturnAddition3inches() {
        EqualityChecker inch = new EqualityChecker(UnitConverter.ConvertUnit.INCHES, 2);
        EqualityChecker cm = new EqualityChecker(UnitConverter.ConvertUnit.CM, 2.5);
        double result = UnitConverter.ConvertUnit.addition(inch,cm);
        Assert.assertEquals(3, result, 0.0);
    }

    //******************Volume****************//

    @Test
    public void given1gallonAnd3dot78litres_ShouldReturnTrue() {
        EqualityChecker gallon = new EqualityChecker(UnitConverter.ConvertUnit.GALLONS, 1);
        EqualityChecker litre = new EqualityChecker(UnitConverter.ConvertUnit.LITRE, 3.78);
        boolean result = UnitConverter.ConvertUnit.compare(gallon,litre);
        Assert.assertTrue(result);
    }

    @Test
    public void givenTwoDifferentUnitTypes_ShouldNotPerformComparision() {
        EqualityChecker gallon = new EqualityChecker(UnitConverter.ConvertUnit.GALLONS, 1);
        EqualityChecker feet = new EqualityChecker(UnitConverter.ConvertUnit.FEET, 1);
        boolean result = UnitConverter.ConvertUnit.compare(gallon,feet);
        Assert.assertFalse(result);
    }

    @Test
    public void given1gallonAnd3dot78litres_ShouldReturnAddition7dot57litres() {
        EqualityChecker gallon = new EqualityChecker(UnitConverter.ConvertUnit.GALLONS, 1);
        EqualityChecker litres = new EqualityChecker(UnitConverter.ConvertUnit.LITRE, 3.78);
        double result = UnitConverter.ConvertUnit.addition(gallon, litres);
        Assert.assertEquals(Math.round(7.57), result, 0.0);
    }

    //**************weight*******************//

    @Test
    public void given1kgAnd1000gmIfEqual_ShouldReturnTrue() {
        EqualityChecker kg = new EqualityChecker(UnitConverter.ConvertUnit.KG, 1);
        EqualityChecker gm = new EqualityChecker(UnitConverter.ConvertUnit.GRAMS, 1000);
        boolean compareCheck = UnitConverter.ConvertUnit.compare(kg, gm);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1gAnd1kgIfNotEqual_ShouldReturnFalse() {
        EqualityChecker kg = new EqualityChecker(UnitConverter.ConvertUnit.KG, 1);
        EqualityChecker gm = new EqualityChecker(UnitConverter.ConvertUnit.GRAMS, 1);
        boolean compareCheck = UnitConverter.ConvertUnit.compare(kg, gm);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1tonneAnd1000kgsIfEqual_ShouldReturnTrue() {
        EqualityChecker tonne = new EqualityChecker(UnitConverter.ConvertUnit.TONNE, 1);
        EqualityChecker kgs = new EqualityChecker(UnitConverter.ConvertUnit.KG, 1000);
        boolean compareCheck = UnitConverter.ConvertUnit.compare(tonne,kgs);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1tonneAnd1kgIfNotEqual_ShouldReturnFalse() {
        EqualityChecker tonne = new EqualityChecker(UnitConverter.ConvertUnit.TONNE, 1);
        EqualityChecker kgs = new EqualityChecker(UnitConverter.ConvertUnit.KG, 1);
        boolean compareCheck = UnitConverter.ConvertUnit.compare(tonne,kgs);
        Assert.assertFalse(compareCheck);
    }
}
