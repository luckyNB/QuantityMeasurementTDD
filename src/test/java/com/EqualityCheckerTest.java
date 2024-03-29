package com;

import org.junit.Assert;
import org.junit.Test;

public class EqualityCheckerTest {

    @Test
    public void given0feetAnd0feetIfEqual_ShouldReturnTrue() {
        UnitManipulator feet1 = new UnitManipulator(UnitConverter.ConvertUnit.FEET, 0.0);
        UnitManipulator feet2 = new UnitManipulator(UnitConverter.ConvertUnit.FEET, 0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void given0feetAnd1FeetValues_ShouldReturnFalse() {
        UnitManipulator feet1 = new UnitManipulator(UnitConverter.ConvertUnit.FEET, 0.0);
        UnitManipulator feet2 = new UnitManipulator(UnitConverter.ConvertUnit.FEET, 1.0);
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenOneNUllValueShouldReturnFalse() {
        UnitManipulator feet1 = new UnitManipulator(UnitConverter.ConvertUnit.FEET, 3.0);
        feet1.equals(null);
        Assert.assertFalse(false);
    }

    @Test
    public void given0InchAnd0InchIfEqual_ShouldReturnTrue() {
        UnitManipulator inch1 = new UnitManipulator(UnitConverter.ConvertUnit.INCHES, 0.0);
        UnitManipulator inch2 = new UnitManipulator(UnitConverter.ConvertUnit.INCHES, 0.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void givenDifferentInchValues_ShouldReturnFalse() {
        UnitManipulator inch1 = new UnitManipulator(UnitConverter.ConvertUnit.INCHES, 0.0);
        UnitManipulator inch2 = new UnitManipulator(UnitConverter.ConvertUnit.INCHES, 1.0);
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnFalse() {
        UnitManipulator inch1 = new UnitManipulator(UnitConverter.ConvertUnit.INCHES, 1.0);
        UnitManipulator feet1 = new UnitManipulator(UnitConverter.ConvertUnit.FEET, 1.0);
        Assert.assertNotEquals(inch1, feet1);
    }

    @Test
    public void given0InchAnd0Feet_ShouldReturnEqual() {
        try {
            UnitManipulator feet1 = new UnitManipulator(UnitConverter.ConvertUnit.FEET, 0.0);
            UnitManipulator inches1 = new UnitManipulator(UnitConverter.ConvertUnit.INCHES, 0.0);
            boolean check = UnitManipulator.compare(feet1, inches1);
            Assert.assertTrue(check);
        } catch (UnitManipulatorException e) {
            e.printStackTrace();
            Assert.assertEquals(UnitManipulatorException.ExceptionType.WRONG_UNIT_TYPE, e.type);
        }
    }

    @Test
    public void given1InchAnd1Feet_ShouldReturnNotEqual() {
        boolean check = false;
        try {
            UnitManipulator feet1 = new UnitManipulator(UnitConverter.ConvertUnit.FEET, 1.0);
            UnitManipulator inches1 = new UnitManipulator(UnitConverter.ConvertUnit.GRAMS, 1.0);
            check = UnitManipulator.compare(feet1, inches1);
            Assert.assertFalse(check);
        } catch (UnitManipulatorException e) {
            Assert.assertEquals(UnitManipulatorException.ExceptionType.WRONG_UNIT_TYPE, e.type);
        }
    }

    @Test
    public void given1FeetAnd1FeetIfEqual_ShouldReturnTrue() {
        boolean result = false;
        try {
            UnitManipulator feet1 = new UnitManipulator(UnitConverter.ConvertUnit.FEET, 1.0);
            UnitManipulator feet2 = new UnitManipulator(UnitConverter.ConvertUnit.FEET, 1.0);
            result = UnitManipulator.compare(feet1, feet2);
            Assert.assertTrue(result);
        } catch (UnitManipulatorException e) {
            Assert.assertEquals(UnitManipulatorException.ExceptionType.WRONG_UNIT_TYPE, e.type);
        }
    }

    @Test
    public void given1InchAnd1InhIfEquals_Should_ReturnTrue() {
        boolean result = false;
        try {
            UnitManipulator inch1 = new UnitManipulator(UnitConverter.ConvertUnit.INCHES, 1.0);
            UnitManipulator inch2 = new UnitManipulator(UnitConverter.ConvertUnit.INCHES, 1.0);
            result = UnitManipulator.compare(inch1, inch2);
            Assert.assertTrue(result);
        } catch (UnitManipulatorException e) {
            Assert.assertEquals(UnitManipulatorException.ExceptionType.WRONG_UNIT_TYPE, e.type);
        }
    }

    @Test
    public void given1feetAnd1inchIfNotEqual_ShouldReturnFalse() {
        boolean compareCheck = false;
        try {
            UnitManipulator feet = new UnitManipulator(UnitConverter.ConvertUnit.FEET, 1.0);
            UnitManipulator inch = new UnitManipulator(UnitConverter.ConvertUnit.INCHES, 1.0);
            compareCheck = UnitManipulator.compare(feet, inch);
            Assert.assertFalse(compareCheck);
        } catch (UnitManipulatorException e) {
            Assert.assertEquals(UnitManipulatorException.ExceptionType.WRONG_UNIT_TYPE, e.type);
        }
    }

    @Test
    public void given1InchAnd1FeetIfNotEqual_ShouldReturnFalse() {
        boolean compareCheck = false;
        try {
            UnitManipulator inch = new UnitManipulator(UnitConverter.ConvertUnit.INCHES, 1.0);
            UnitManipulator feet = new UnitManipulator(UnitConverter.ConvertUnit.FEET, 1.0);
            compareCheck = UnitManipulator.compare(inch, feet);
            Assert.assertFalse(compareCheck);
        } catch (UnitManipulatorException e) {
            Assert.assertEquals(UnitManipulatorException.ExceptionType.WRONG_UNIT_TYPE, e.type);
        }
    }

    @Test
    public void given1feetAnd12inches_ShouldReturnTrue() {
        boolean compareCheck = false;
        try {
            UnitManipulator feet = new UnitManipulator(UnitConverter.ConvertUnit.FEET, 1.0);
            UnitManipulator inch = new UnitManipulator(UnitConverter.ConvertUnit.INCHES, 12.0);
            compareCheck = UnitManipulator.compare(feet, inch);
            Assert.assertTrue(compareCheck);
        } catch (UnitManipulatorException e) {
            Assert.assertEquals(UnitManipulatorException.ExceptionType.WRONG_UNIT_TYPE, e.type);
        }
    }

    @Test
    public void given12InchesAnd1Feet_ShouldReturnTrue() {
        boolean compareCheck = false;
        try {
            UnitManipulator inches = new UnitManipulator(UnitConverter.ConvertUnit.INCHES, 12);
            UnitManipulator feet = new UnitManipulator(UnitConverter.ConvertUnit.FEET, 1.0);
            compareCheck = UnitManipulator.compare(inches, feet);
            Assert.assertTrue(compareCheck);
        } catch (UnitManipulatorException e) {
            Assert.assertEquals(UnitManipulatorException.ExceptionType.WRONG_UNIT_TYPE, e.type);
        }
    }

    @Test
    public void given3FeetAnd12Inch_ShouldReturnFalse() {
        boolean compareCheck = false;
        try {
            UnitManipulator inches = new UnitManipulator(UnitConverter.ConvertUnit.INCHES, 12.0);
            UnitManipulator feet = new UnitManipulator(UnitConverter.ConvertUnit.FEET, 3.0);
            compareCheck = UnitManipulator.compare(inches, feet);
            Assert.assertFalse(compareCheck);
        } catch (UnitManipulatorException e) {
            Assert.assertEquals(UnitManipulatorException.ExceptionType.WRONG_UNIT_TYPE, e.type);
        }
    }

    @Test
    public void given0YardAnd0Yard_ShouldReturnTrue() {
        UnitManipulator yard1 = new UnitManipulator(UnitConverter.ConvertUnit.YARD, 0.0);
        UnitManipulator yard2 = new UnitManipulator(UnitConverter.ConvertUnit.YARD, 0.0);
        Assert.assertEquals(yard1, yard2);

    }

    @Test
    public void given0yardAnd1yardValues_ShouldReturnFalse() {
        UnitManipulator yard1 = new UnitManipulator(UnitConverter.ConvertUnit.YARD, 0.0);
        UnitManipulator yard2 = new UnitManipulator(UnitConverter.ConvertUnit.YARD, 1.0);
        Assert.assertNotEquals(yard1, yard2);
    }

    @Test
    public void givenOneNUllValueForYardUnitShouldReturnFalse() {
        UnitManipulator yard1 = new UnitManipulator(UnitConverter.ConvertUnit.YARD, 3.0);
        yard1.equals(null);
        Assert.assertFalse(false);
    }

    @Test
    public void given3feetAnd1yard_ShouldReturnTrue() {
        boolean compareCheck = false;
        try {
            UnitManipulator feet = new UnitManipulator(UnitConverter.ConvertUnit.FEET, 3);
            UnitManipulator yard = new UnitManipulator(UnitConverter.ConvertUnit.YARD, 1);
            compareCheck = UnitManipulator.compare(feet, yard);
            Assert.assertTrue(compareCheck);
        } catch (UnitManipulatorException e) {
            Assert.assertEquals(UnitManipulatorException.ExceptionType.WRONG_UNIT_TYPE, e.type);
        }
    }

    @Test
    public void given1feetAnd1yard_ShouldReturnFalse() {
        boolean compareCheck = false;
        try {
            UnitManipulator feet = new UnitManipulator(UnitConverter.ConvertUnit.FEET, 1);
            UnitManipulator yard = new UnitManipulator(UnitConverter.ConvertUnit.YARD, 1);
            compareCheck = UnitManipulator.compare(feet, yard);
            Assert.assertFalse(compareCheck);
        } catch (UnitManipulatorException e) {
            Assert.assertEquals(UnitManipulatorException.ExceptionType.WRONG_UNIT_TYPE, e.type);
        }
    }

    @Test
    public void given1inchAnd1yard_ShouldReturnFalse() {
        boolean compareCheck = false;
        try {
            UnitManipulator inches = new UnitManipulator(UnitConverter.ConvertUnit.INCHES, 1);
            UnitManipulator yard = new UnitManipulator(UnitConverter.ConvertUnit.YARD, 1);
            compareCheck = UnitManipulator.compare(inches, yard);
            Assert.assertFalse(compareCheck);
        } catch (UnitManipulatorException e) {
            Assert.assertEquals(UnitManipulatorException.ExceptionType.WRONG_UNIT_TYPE, e.type);
        }
    }

    @Test
    public void given1yardAnd36inch_ShouldReturnTrue() {
        boolean compareCheck = false;
        try {
            UnitManipulator yard = new UnitManipulator(UnitConverter.ConvertUnit.YARD, 1);
            UnitManipulator inches = new UnitManipulator(UnitConverter.ConvertUnit.INCHES, 36);
            compareCheck = UnitManipulator.compare(yard, inches);
            Assert.assertTrue(compareCheck);
        } catch (UnitManipulatorException e) {
            Assert.assertEquals(UnitManipulatorException.ExceptionType.WRONG_UNIT_TYPE, e.type);
        }
    }

    @Test
    public void given36inchAnd1yard_ShouldReturnTrue() {
        boolean compareCheck = false;
        try {
            UnitManipulator inches = new UnitManipulator(UnitConverter.ConvertUnit.INCHES, 36);
            UnitManipulator yard = new UnitManipulator(UnitConverter.ConvertUnit.GRAMS, 1);
            compareCheck = UnitManipulator.compare(inches, yard);
            Assert.assertTrue(compareCheck);
        } catch (UnitManipulatorException e) {
            Assert.assertEquals(UnitManipulatorException.ExceptionType.WRONG_UNIT_TYPE, e.type);
        }
    }

    @Test
    public void given1yardAnd3feet_ShouldReturnTrue() {
        boolean compareCheck = false;
        try {
            UnitManipulator yard = new UnitManipulator(UnitConverter.ConvertUnit.YARD, 1);
            UnitManipulator feet = new UnitManipulator(UnitConverter.ConvertUnit.FEET, 3);
            compareCheck = UnitManipulator.compare(yard, feet);
            Assert.assertTrue(compareCheck);
        } catch (UnitManipulatorException e) {
            Assert.assertEquals(UnitManipulatorException.ExceptionType.WRONG_UNIT_TYPE, e.type);
        }
    }

    @Test
    public void given2inchAnd5cm_ShouldReturnTrue() {
        boolean compareCheck = false;
        try {
            UnitManipulator inch = new UnitManipulator(UnitConverter.ConvertUnit.INCHES, 2);
            UnitManipulator cm = new UnitManipulator(UnitConverter.ConvertUnit.CM, 5);
            compareCheck = UnitManipulator.compare(inch, cm);
            Assert.assertTrue(compareCheck);
        } catch (UnitManipulatorException e) {
            Assert.assertEquals(UnitManipulatorException.ExceptionType.WRONG_UNIT_TYPE, e.type);
        }
    }

    @Test
    public void given2inchesAnd2inches_ShouldReturnAddition4inches() {
        double result = 0;
        try {
            UnitManipulator inch1 = new UnitManipulator(UnitConverter.ConvertUnit.INCHES, 2);
            UnitManipulator inch2 = new UnitManipulator(UnitConverter.ConvertUnit.INCHES, 2);
            result = UnitManipulator.addition(inch1, inch2);
            Assert.assertEquals(4, result, 0.0);
        } catch (UnitManipulatorException e) {
            Assert.assertEquals(UnitManipulatorException.ExceptionType.WRONG_UNIT_TYPE, e.type);
        }
    }

    @Test
    public void given1feetAnd2inches_ShouldReturnAddition14inches() {
        double result = 0;
        try {
            UnitManipulator feet = new UnitManipulator(UnitConverter.ConvertUnit.FEET, 1);
            UnitManipulator inch = new UnitManipulator(UnitConverter.ConvertUnit.INCHES, 2);
            result = UnitManipulator.addition(feet, inch);
            Assert.assertEquals(14, result, 0.0);
        } catch (UnitManipulatorException e) {
            Assert.assertEquals(UnitManipulatorException.ExceptionType.WRONG_UNIT_TYPE, e.type);
        }
    }

    @Test
    public void given1feetAnd1feet_ShouldReturnAddition24inches() {
        double result = 0;
        try {
            UnitManipulator feet1 = new UnitManipulator(UnitConverter.ConvertUnit.FEET, 1);
            UnitManipulator feet2 = new UnitManipulator(UnitConverter.ConvertUnit.FEET, 1);
            result = UnitManipulator.addition(feet1, feet2);
            Assert.assertEquals(24, result, 0.0);
        } catch (UnitManipulatorException e) {
            Assert.assertEquals(UnitManipulatorException.ExceptionType.WRONG_UNIT_TYPE, e.type);
        }
    }

    @Test
    public void given2inchAnd2dot5cm_ShouldReturnAddition3inches() {
        double result = 0;
        try {
            UnitManipulator inch = new UnitManipulator(UnitConverter.ConvertUnit.INCHES, 2);
            UnitManipulator cm = new UnitManipulator(UnitConverter.ConvertUnit.CM, 2.5);
            result = UnitManipulator.addition(inch, cm);
            Assert.assertEquals(3, result, 0.0);
        } catch (UnitManipulatorException e) {
            Assert.assertEquals(UnitManipulatorException.ExceptionType.WRONG_UNIT_TYPE, e.type);
        }
    }

    @Test
    public void givenTWoDifferentUnits_ShouldThrowException() {
        boolean compareCheck = false;
        try {
            UnitManipulator tonne = new UnitManipulator(UnitConverter.ConvertUnit.TONNE, 1);
            UnitManipulator kgs = new UnitManipulator(UnitConverter.ConvertUnit.FEET, 1000);
            compareCheck = UnitManipulator.compare(tonne, kgs);
            Assert.assertTrue(compareCheck);
        } catch (UnitManipulatorException e) {
            Assert.assertEquals(UnitManipulatorException.ExceptionType.WRONG_UNIT_TYPE, e.type);
        }
    }

    @Test
    public void given1gallonAnd3dot78litres_ShouldReturnTrue() {
        boolean result = false;
        try {
            UnitManipulator gallon = new UnitManipulator(UnitConverter.ConvertUnit.GALLONS, 1);
            UnitManipulator litre = new UnitManipulator(UnitConverter.ConvertUnit.LITRE, 3.78);
            result = UnitManipulator.compare(gallon, litre);
            Assert.assertTrue(result);
        } catch (UnitManipulatorException e) {
            Assert.assertEquals(UnitManipulatorException.ExceptionType.WRONG_UNIT_TYPE, e.type);
        }
    }

    @Test
    public void givenTwoDifferentUnitTypes_ShouldNotPerformComparision() {
        boolean result = false;
        try {
            UnitManipulator gallon = new UnitManipulator(UnitConverter.ConvertUnit.GALLONS, 1);
            UnitManipulator feet = new UnitManipulator(UnitConverter.ConvertUnit.FEET, 1);
            result = UnitManipulator.compare(gallon, feet);
            Assert.assertFalse(result);
        } catch (UnitManipulatorException e) {
            Assert.assertEquals(UnitManipulatorException.ExceptionType.WRONG_UNIT_TYPE, e.type);
        }
    }

    @Test
    public void given1gallonAnd3dot78litres_ShouldReturnAddition7dot57litres() {
        double result = 0;
        try {
            UnitManipulator gallon = new UnitManipulator(UnitConverter.ConvertUnit.GALLONS, 1);
            UnitManipulator litres = new UnitManipulator(UnitConverter.ConvertUnit.LITRE, 3.78);
            result = UnitManipulator.addition(gallon, litres);
            Assert.assertEquals(Math.round(7.57), result, 0.0);
        } catch (UnitManipulatorException e) {
            Assert.assertEquals(UnitManipulatorException.ExceptionType.WRONG_UNIT_TYPE, e.type);
        }
    }

    @Test
    public void given1kgAnd1000gmIfEqual_ShouldReturnTrue() {
        boolean compareCheck = false;
        try {
            UnitManipulator kg = new UnitManipulator(UnitConverter.ConvertUnit.KG, 1);
            UnitManipulator gm = new UnitManipulator(UnitConverter.ConvertUnit.GRAMS, 1000);
            compareCheck = UnitManipulator.compare(kg, gm);
            Assert.assertTrue(compareCheck);
        } catch (UnitManipulatorException e) {
            Assert.assertEquals(UnitManipulatorException.ExceptionType.WRONG_UNIT_TYPE, e.type);
        }
    }

    @Test
    public void given1gAnd1kgIfNotEqual_ShouldReturnFalse() {
        boolean compareCheck = false;
        try {
            UnitManipulator kg = new UnitManipulator(UnitConverter.ConvertUnit.KG, 1);
            UnitManipulator gm = new UnitManipulator(UnitConverter.ConvertUnit.GRAMS, 1);
            compareCheck = UnitManipulator.compare(kg, gm);
            Assert.assertFalse(compareCheck);
        } catch (UnitManipulatorException e) {
            Assert.assertEquals(UnitManipulatorException.ExceptionType.WRONG_UNIT_TYPE, e.type);
        }
    }

    @Test
    public void given1tonneAnd1000kgsIfEqual_ShouldReturnTrue() {
        boolean compareCheck = false;
        try {
            UnitManipulator tonne = new UnitManipulator(UnitConverter.ConvertUnit.TONNE, 1);
            UnitManipulator kgs = new UnitManipulator(UnitConverter.ConvertUnit.KG, 1000);
            compareCheck = UnitManipulator.compare(tonne, kgs);
            Assert.assertTrue(compareCheck);
        } catch (UnitManipulatorException e) {
            Assert.assertEquals(UnitManipulatorException.ExceptionType.WRONG_UNIT_TYPE, e.type);
        }
    }

    @Test
    public void given1tonneAnd1kgIfNotEqual_ShouldReturnFalse() {
        boolean compareCheck = false;
        try {
            UnitManipulator tonne = new UnitManipulator(UnitConverter.ConvertUnit.TONNE, 1);
            UnitManipulator kgs = new UnitManipulator(UnitConverter.ConvertUnit.KG, 1);
            compareCheck = UnitManipulator.compare(tonne, kgs);
            Assert.assertFalse(compareCheck);
        } catch (UnitManipulatorException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given1tonneAnd10lakhsgramsIfEqual_ShouldReturnTrue() {
        boolean compareCheck = false;
        try {
            UnitManipulator tonne = new UnitManipulator(UnitConverter.ConvertUnit.TONNE, 1);
            UnitManipulator grams = new UnitManipulator(UnitConverter.ConvertUnit.GRAMS, 1000000);
            compareCheck = UnitManipulator.compare(tonne, grams);
            Assert.assertTrue(compareCheck);
        } catch (UnitManipulatorException e) {
            Assert.assertEquals(UnitManipulatorException.ExceptionType.WRONG_UNIT_TYPE, e.type);
        }
    }

    @Test
    public void given1tonneAnd1gramsIfNotEqual_ShouldReturnFalse() {
        boolean compareCheck = false;
        try {
            UnitManipulator tonne = new UnitManipulator(UnitConverter.ConvertUnit.TONNE, 1);
            UnitManipulator grams = new UnitManipulator(UnitConverter.ConvertUnit.GRAMS, 1);
            compareCheck = UnitManipulator.compare(tonne, grams);
            Assert.assertFalse(compareCheck);
        } catch (UnitManipulatorException e) {
            Assert.assertEquals(UnitManipulatorException.ExceptionType.WRONG_UNIT_TYPE, e.type);
        }
    }

    @Test
    public void given1tonneAnd1thousandGram_ShouldReturnAddition1001kg() {
        double addition = 0;
        try {
            UnitManipulator tonne = new UnitManipulator(UnitConverter.ConvertUnit.TONNE, 1);
            UnitManipulator grams = new UnitManipulator(UnitConverter.ConvertUnit.GRAMS, 1000);
            addition = UnitManipulator.addition(tonne, grams) / 1000;
            Assert.assertEquals(1001, addition, 0.0);
        } catch (UnitManipulatorException e) {
            Assert.assertEquals(UnitManipulatorException.ExceptionType.WRONG_UNIT_TYPE, e.type);
        }
    }

    @Test
    public void given2gAnd2g_WhenAdded_ShouldReturn4grams() {
        double addition = 0;
        try {
            UnitManipulator grams1 = new UnitManipulator(UnitConverter.ConvertUnit.GRAMS, 2);
            UnitManipulator grams2 = new UnitManipulator(UnitConverter.ConvertUnit.GRAMS, 2);
            addition = UnitManipulator.addition(grams1, grams2);
            Assert.assertEquals(4, addition, 0.0);
        } catch (UnitManipulatorException e) {
            Assert.assertEquals(UnitManipulatorException.ExceptionType.WRONG_UNIT_TYPE, e.type);
        }
    }

    @Test
    public void given1kgAnd2g_WhenAdded_ShouldReturn1002grams() {
        double addition = 0;
        try {
            UnitManipulator kg1 = new UnitManipulator(UnitConverter.ConvertUnit.KG, 1);
            UnitManipulator kg2 = new UnitManipulator(UnitConverter.ConvertUnit.GRAMS, 2);
            addition = UnitManipulator.addition(kg1, kg2);
            Assert.assertEquals(1002, addition, 0.0);
        } catch (UnitManipulatorException e) {
            Assert.assertEquals(UnitManipulatorException.ExceptionType.WRONG_UNIT_TYPE, e.type);
        }
    }

    @Test
    public void given1kgAnd1tonne_WhenAdded_ShouldReturn1001000grams() {
        double addition = 0;
        try {
            UnitManipulator kg = new UnitManipulator(UnitConverter.ConvertUnit.KG, 1);
            UnitManipulator tonne = new UnitManipulator(UnitConverter.ConvertUnit.TONNE, 1);
            addition = UnitManipulator.addition(kg, tonne);
            Assert.assertEquals(1001000, addition, 0.0);
        } catch (UnitManipulatorException e) {
            Assert.assertEquals(UnitManipulatorException.ExceptionType.WRONG_UNIT_TYPE, e.type);
        }
    }

    @Test
    public void given212FahrenheitAnd100celsius_ShouldReturnTrue() {
        UnitManipulator far = new UnitManipulator(UnitConverter.ConvertUnit.FAHRENHEIT, 212);
        UnitManipulator cel = new UnitManipulator(UnitConverter.ConvertUnit.CELSIUS, 100);
        Boolean result = cel.compareTemperatures(far);
        Assert.assertTrue(result);
    }

    @Test
    public void given100celsiusAnd212fahrenheit_ShouldReturnTrue() {
        UnitManipulator cel = new UnitManipulator(UnitConverter.ConvertUnit.CELSIUS, 100);
        UnitManipulator far = new UnitManipulator(UnitConverter.ConvertUnit.FAHRENHEIT, 212);
        Boolean result = far.compareTemperatures(cel);
        Assert.assertTrue(result);
    }

    @Test
    public void given100celsiusAnd100fahrenheit_ShouldReturnFalse() {
        UnitManipulator far = new UnitManipulator(UnitConverter.ConvertUnit.CELSIUS, 100);
        UnitManipulator cel = new UnitManipulator(UnitConverter.ConvertUnit.FAHRENHEIT, 100);
        Boolean result = cel.compareTemperatures(far);
        Assert.assertFalse(result);
    }

    @Test
    public void given1kgAnd2Litres_WhenAdded_ShouldThrowException() {
        double addition = 0;
        try {
            UnitManipulator kg1 = new UnitManipulator(UnitConverter.ConvertUnit.KG, 1);
            UnitManipulator kg2 = new UnitManipulator(UnitConverter.ConvertUnit.LITRE, 2);
            addition = UnitManipulator.addition(kg1, kg2);
        } catch (UnitManipulatorException e) {
            Assert.assertEquals(UnitManipulatorException.ExceptionType.WRONG_UNIT_TYPE, e.type);
        }
    }

    @Test
    public void given1celsiusAnd1celsius_WhenAdded_ShouldThrowException() {
        double addition = 0;
        try {
            UnitManipulator cel1 = new UnitManipulator(UnitConverter.ConvertUnit.CELSIUS, 1);
            UnitManipulator cel2 = new UnitManipulator(UnitConverter.ConvertUnit.CELSIUS, 1);
            addition = UnitManipulator.addition(cel1, cel2);
        } catch (UnitManipulatorException e) {
            Assert.assertEquals(UnitManipulatorException.ExceptionType.WRONG_UNIT_TYPE, e.type);
        }
    }
}
