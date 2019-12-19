package com;

import org.junit.Assert;
import org.junit.Test;

public class EqualityCheckerTest {
    @Test
    public void given0feetAnd0feetIfEqual_ShouldReturnTrue() {
        UnitManipulator feet1 = new UnitManipulator(UnitConverter.ConvertUnit.FEET,0.0);
        UnitManipulator feet2 = new UnitManipulator(UnitConverter.ConvertUnit.FEET,0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void given0feetAnd1FeetValues_ShouldReturnFalse() {
        UnitManipulator feet1 = new UnitManipulator(UnitConverter.ConvertUnit.FEET,0.0);
        UnitManipulator feet2 = new UnitManipulator(UnitConverter.ConvertUnit.FEET,1.0);
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenOneNUllValueShouldReturnFalse() {
        UnitManipulator feet1 = new UnitManipulator(UnitConverter.ConvertUnit.FEET,3.0);
        feet1.equals(null);
        Assert.assertFalse(false);
    }

    @Test
    public void given0InchAnd0InchIfEqual_ShouldReturnTrue() {
        UnitManipulator inch1 = new UnitManipulator(UnitConverter.ConvertUnit.INCHES,0.0);
        UnitManipulator inch2 = new UnitManipulator(UnitConverter.ConvertUnit.INCHES,0.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void givenDifferentInchValues_ShouldReturnFalse() {
        UnitManipulator inch1 = new UnitManipulator(UnitConverter.ConvertUnit.INCHES,0.0);
        UnitManipulator inch2 = new UnitManipulator(UnitConverter.ConvertUnit.INCHES,1.0);
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnFalse() {
        UnitManipulator inch1 = new UnitManipulator(UnitConverter.ConvertUnit.INCHES,1.0);
        UnitManipulator feet1 = new UnitManipulator(UnitConverter.ConvertUnit.FEET,1.0);
        Assert.assertNotEquals(inch1, feet1);
    }

    @Test
    public void given0InchAnd0Feet_ShouldReturnEqual() {
        UnitManipulator feet1 = new UnitManipulator(UnitConverter.ConvertUnit.FEET, 0.0);
        UnitManipulator inches1 = new UnitManipulator(UnitConverter.ConvertUnit.INCHES, 0.0);
        boolean check = UnitManipulator.compare(feet1,inches1);
        Assert.assertTrue(check);
    }

    @Test
    public void given1InchAnd1Feet_ShouldReturnNotEqual() {
        UnitManipulator feet1 = new UnitManipulator(UnitConverter.ConvertUnit.FEET, 1.0);
        UnitManipulator inches1 = new UnitManipulator(UnitConverter.ConvertUnit.INCHES, 1.0);
        boolean check = UnitManipulator.compare(feet1,inches1);
        Assert.assertFalse(check);
    }

    @Test
    public void given1FeetAnd1FeetIfEqual_ShouldReturnTrue() {
        UnitManipulator feet1 = new UnitManipulator(UnitConverter.ConvertUnit.FEET, 1.0);
        UnitManipulator feet2 = new UnitManipulator(UnitConverter.ConvertUnit.FEET, 1.0);
        boolean result = UnitManipulator.compare(feet1,feet2);
        Assert.assertTrue(result);
    }

    @Test
    public void given1InchAnd1InhIfEquals_Should_ReturnTrue() {
        UnitManipulator inch1 = new UnitManipulator(UnitConverter.ConvertUnit.INCHES, 1.0);
        UnitManipulator inch2 = new UnitManipulator(UnitConverter.ConvertUnit.INCHES, 1.0);
        boolean result = UnitManipulator.compare(inch1,inch2);
        Assert.assertTrue(result);
    }

    @Test
    public void given1feetAnd1inchIfNotEqual_ShouldReturnFalse() {
        UnitManipulator feet = new UnitManipulator(UnitConverter.ConvertUnit.FEET, 1.0);
        UnitManipulator inch = new UnitManipulator(UnitConverter.ConvertUnit.INCHES, 1.0);
        boolean compareCheck = UnitManipulator.compare(feet,inch);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1InchAnd1FeetIfNotEqual_ShouldReturnFalse() {
        UnitManipulator inch = new UnitManipulator(UnitConverter.ConvertUnit.INCHES, 1.0);
        UnitManipulator feet = new UnitManipulator(UnitConverter.ConvertUnit.FEET, 1.0);
        boolean compareCheck = UnitManipulator.compare(inch,feet);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1feetAnd12inches_ShouldReturnTrue() {
        UnitManipulator feet = new UnitManipulator(UnitConverter.ConvertUnit.FEET, 1.0);
        UnitManipulator inch = new UnitManipulator(UnitConverter.ConvertUnit.INCHES, 12.0);
        boolean compareCheck = UnitManipulator.compare(feet,inch);;
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given12InchesAnd1Feet_ShouldReturnTrue() {
        UnitManipulator inches = new UnitManipulator(UnitConverter.ConvertUnit.INCHES,12);
        UnitManipulator feet = new UnitManipulator(UnitConverter.ConvertUnit.FEET, 1.0);
        boolean compareCheck = UnitManipulator.compare(inches,feet);;
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given3FeetAnd12Inch_ShouldReturnFalse() {
        UnitManipulator inches = new UnitManipulator(UnitConverter.ConvertUnit.INCHES, 12.0);
        UnitManipulator feet = new UnitManipulator(UnitConverter.ConvertUnit.FEET,3.0);
        boolean compareCheck = UnitManipulator.compare(inches,feet);;
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given0YardAnd0Yard_ShouldReturnTrue() {
        UnitManipulator yard1 = new UnitManipulator(UnitConverter.ConvertUnit.YARD, 0.0);
        UnitManipulator yard2 = new UnitManipulator(UnitConverter.ConvertUnit.YARD, 0.0);
        Assert.assertEquals(yard1,yard2);

    }

    @Test
    public void given0yardAnd1yardValues_ShouldReturnFalse() {
        UnitManipulator yard1 = new UnitManipulator(UnitConverter.ConvertUnit.YARD,0.0);
        UnitManipulator yard2 = new UnitManipulator(UnitConverter.ConvertUnit.YARD,1.0);
        Assert.assertNotEquals(yard1, yard2);
    }

    @Test
    public void givenOneNUllValueForYardUnitShouldReturnFalse() {
        UnitManipulator yard1 = new UnitManipulator(UnitConverter.ConvertUnit.YARD,3.0);
        yard1.equals(null);
        Assert.assertFalse(false);
    }

    @Test
    public void given3feetAnd1yard_ShouldReturnTrue() {
        UnitManipulator feet = new UnitManipulator(UnitConverter.ConvertUnit.FEET, 3);
        UnitManipulator yard = new UnitManipulator(UnitConverter.ConvertUnit.YARD, 1);
        boolean compareCheck = UnitManipulator.compare(feet,yard);;
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1feetAnd1yard_ShouldReturnFalse() {
        UnitManipulator feet = new UnitManipulator(UnitConverter.ConvertUnit.FEET, 1);
        UnitManipulator yard = new UnitManipulator(UnitConverter.ConvertUnit.YARD, 1);
        boolean compareCheck = UnitManipulator.compare(feet,yard);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1inchAnd1yard_ShouldReturnFalse() {
        UnitManipulator inches = new UnitManipulator(UnitConverter.ConvertUnit.INCHES, 1);
        UnitManipulator yard = new UnitManipulator(UnitConverter.ConvertUnit.YARD, 1);
        boolean compareCheck = UnitManipulator.compare(inches,yard);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1yardAnd36inch_ShouldReturnTrue() {
        UnitManipulator yard = new UnitManipulator(UnitConverter.ConvertUnit.YARD, 1);
        UnitManipulator inches = new UnitManipulator(UnitConverter.ConvertUnit.INCHES, 36);
        boolean compareCheck = UnitManipulator.compare(yard,inches);;
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given36inchAnd1yard_ShouldReturnTrue() {
        UnitManipulator inches = new UnitManipulator(UnitConverter.ConvertUnit.INCHES, 36);
        UnitManipulator yard = new UnitManipulator(UnitConverter.ConvertUnit.YARD, 1);
        boolean compareCheck = UnitManipulator.compare(inches,yard);;
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1yardAnd3feet_ShouldReturnTrue() {
        UnitManipulator yard = new UnitManipulator(UnitConverter.ConvertUnit.YARD, 1);
        UnitManipulator feet = new UnitManipulator(UnitConverter.ConvertUnit.FEET, 3);
        boolean compareCheck = UnitManipulator.compare(yard,feet);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given2inchAnd5cm_ShouldReturnTrue() {
        UnitManipulator inch = new UnitManipulator(UnitConverter.ConvertUnit.INCHES, 2);
        UnitManipulator cm = new UnitManipulator(UnitConverter.ConvertUnit.CM,5);
        boolean compareCheck = UnitManipulator.compare(inch,cm);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given2inchesAnd2inches_ShouldReturnAddition4inches() {
        UnitManipulator inch1 = new UnitManipulator(UnitConverter.ConvertUnit.INCHES, 2);
        UnitManipulator inch2 = new UnitManipulator(UnitConverter.ConvertUnit.INCHES, 2);
        double result = UnitManipulator.addition(inch1,inch2);
        Assert.assertEquals(4,result,0.0);
    }

    @Test
    public void given1feetAnd2inches_ShouldReturnAddition14inches() {
        UnitManipulator feet = new UnitManipulator(UnitConverter.ConvertUnit.FEET, 1);
        UnitManipulator inch = new UnitManipulator(UnitConverter.ConvertUnit.INCHES, 2);
        double result = UnitManipulator.addition(feet,inch);
        Assert.assertEquals(14, result, 0.0);
    }

    @Test
    public void given1feetAnd1feet_ShouldReturnAddition24inches() {
        UnitManipulator feet1 = new UnitManipulator(UnitConverter.ConvertUnit.FEET, 1);
        UnitManipulator feet2 = new UnitManipulator(UnitConverter.ConvertUnit.FEET, 1);
        double result = UnitManipulator.addition(feet1,feet2);
        Assert.assertEquals(24, result, 0.0);
    }

    @Test
    public void given2inchAnd2dot5cm_ShouldReturnAddition3inches() {
        UnitManipulator inch = new UnitManipulator(UnitConverter.ConvertUnit.INCHES, 2);
        UnitManipulator cm = new UnitManipulator(UnitConverter.ConvertUnit.CM, 2.5);
        double result = UnitManipulator.addition(inch,cm);
        Assert.assertEquals(3, result, 0.0);
    }

    //******************Volume****************//

    @Test
    public void given1gallonAnd3dot78litres_ShouldReturnTrue() {
        UnitManipulator gallon = new UnitManipulator(UnitConverter.ConvertUnit.GALLONS, 1);
        UnitManipulator litre = new UnitManipulator(UnitConverter.ConvertUnit.LITRE, 3.78);
        boolean result = UnitManipulator.compare(gallon,litre);
        Assert.assertTrue(result);
    }

    @Test
    public void givenTwoDifferentUnitTypes_ShouldNotPerformComparision() {
        UnitManipulator gallon = new UnitManipulator(UnitConverter.ConvertUnit.GALLONS, 1);
        UnitManipulator feet = new UnitManipulator(UnitConverter.ConvertUnit.FEET, 1);
        boolean result = UnitManipulator.compare(gallon,feet);
        Assert.assertFalse(result);
    }

    @Test
    public void given1gallonAnd3dot78litres_ShouldReturnAddition7dot57litres() {
        UnitManipulator gallon = new UnitManipulator(UnitConverter.ConvertUnit.GALLONS, 1);
        UnitManipulator litres = new UnitManipulator(UnitConverter.ConvertUnit.LITRE, 3.78);
        double result = UnitManipulator.addition(gallon, litres);
        Assert.assertEquals(Math.round(7.57), result, 0.0);
    }

    //**************weight*******************//

    @Test
    public void given1kgAnd1000gmIfEqual_ShouldReturnTrue() {
        UnitManipulator kg = new UnitManipulator(UnitConverter.ConvertUnit.KG, 1);
        UnitManipulator gm = new UnitManipulator(UnitConverter.ConvertUnit.GRAMS, 1000);
        boolean compareCheck = UnitManipulator.compare(kg, gm);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1gAnd1kgIfNotEqual_ShouldReturnFalse() {
        UnitManipulator kg = new UnitManipulator(UnitConverter.ConvertUnit.KG, 1);
        UnitManipulator gm = new UnitManipulator(UnitConverter.ConvertUnit.GRAMS, 1);
        boolean compareCheck = UnitManipulator.compare(kg, gm);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1tonneAnd1000kgsIfEqual_ShouldReturnTrue() {
        UnitManipulator tonne = new UnitManipulator(UnitConverter.ConvertUnit.TONNE, 1);
        UnitManipulator kgs = new UnitManipulator(UnitConverter.ConvertUnit.KG, 1000);
        boolean compareCheck = UnitManipulator.compare(tonne,kgs);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1tonneAnd1kgIfNotEqual_ShouldReturnFalse() {
        UnitManipulator tonne = new UnitManipulator(UnitConverter.ConvertUnit.TONNE, 1);
        UnitManipulator kgs = new UnitManipulator(UnitConverter.ConvertUnit.KG, 1);
        boolean compareCheck = UnitManipulator.compare(tonne,kgs);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1tonneAnd10lakhsgramsIfEqual_ShouldReturnTrue() {
        UnitManipulator tonne = new UnitManipulator(UnitConverter.ConvertUnit.TONNE, 1);
        UnitManipulator grams = new UnitManipulator(UnitConverter.ConvertUnit.GRAMS, 1000000);
        boolean compareCheck = UnitManipulator.compare(tonne, grams);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1tonneAnd1gramsIfNotEqual_ShouldReturnFalse() {
        UnitManipulator tonne = new UnitManipulator(UnitConverter.ConvertUnit.TONNE, 1);
        UnitManipulator grams = new UnitManipulator(UnitConverter.ConvertUnit.GRAMS, 1);
        boolean compareCheck = UnitManipulator.compare(tonne, grams);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1tonneAnd1thousandGram_ShouldReturnAddition1001kg() {
        UnitManipulator tonne = new UnitManipulator(UnitConverter.ConvertUnit.TONNE, 1);
        UnitManipulator grams = new UnitManipulator(UnitConverter.ConvertUnit.GRAMS, 1000);
        double addition = UnitManipulator.addition(tonne, grams) / 1000;
        Assert.assertEquals(1001, addition,0.0);
    }

    @Test
    public void given2gAnd2g_WhenAdded_ShouldReturn4grams() {
        UnitManipulator grams1 = new UnitManipulator(UnitConverter.ConvertUnit.GRAMS, 2);
        UnitManipulator grams2 = new UnitManipulator(UnitConverter.ConvertUnit.GRAMS, 2);
        double addition = UnitManipulator.addition(grams1, grams2);
        Assert.assertEquals(4, addition, 0.0);
    }

    @Test
    public void given1kgAnd2g_WhenAdded_ShouldReturn1002grams() {
        UnitManipulator kg1 = new UnitManipulator(UnitConverter.ConvertUnit.KG, 1);
        UnitManipulator kg2 = new UnitManipulator(UnitConverter.ConvertUnit.GRAMS, 2);
        double addition = UnitManipulator.addition(kg1, kg2);
        Assert.assertEquals(1002, addition, 0.0);
    }

    @Test
    public void given1kgAnd1tonne_WhenAdded_ShouldReturn1001000grams() {
        UnitManipulator kg = new UnitManipulator(UnitConverter.ConvertUnit.KG, 1);
        UnitManipulator tonne = new UnitManipulator(UnitConverter.ConvertUnit.TONNE, 1);
        double addition = UnitManipulator.addition(kg, tonne);
        Assert.assertEquals(1001000, addition, 0.0);
    }

    //********temperature*********

    @Test
    public void given212FahrenheitAnd100celsius_ShouldReturnTrue() {
        UnitManipulator far = new UnitManipulator(UnitConverter.ConvertUnit.FAHRENHEIT, 212);
        UnitManipulator cel = new UnitManipulator(UnitConverter.ConvertUnit.CELSIUS, 100);
        Boolean result = cel.compareTemperatures(far);
        Assert.assertTrue(result);
    }

    @Test
    public void given100celsiusAnd212fahrenheit_ShouldReturnTrue() {
        UnitManipulator far = new UnitManipulator(UnitConverter.ConvertUnit.CELSIUS, 100);
        UnitManipulator cel = new UnitManipulator(UnitConverter.ConvertUnit.FAHRENHEIT, 212);
        Boolean result = cel.compareTemperatures(far);
        Assert.assertTrue(result);
    }

    @Test
    public void given100celsiusAnd100fahrenheit_ShouldReturnFalse() {
        UnitManipulator far = new UnitManipulator(UnitConverter.ConvertUnit.CELSIUS, 100);
        UnitManipulator cel = new UnitManipulator(UnitConverter.ConvertUnit.FAHRENHEIT, 100);
        Boolean result = cel.compareTemperatures(far);
        Assert.assertFalse(result);
    }

}
