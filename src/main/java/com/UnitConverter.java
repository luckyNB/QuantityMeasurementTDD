package com;
public class UnitConverter {

public enum ConvertUnit {
    FEET(12.0,TypeOfUnits.LENGTH),
    INCHES(1.0,TypeOfUnits.LENGTH),
    YARD(36.0,TypeOfUnits.LENGTH),
    CM(0.394,TypeOfUnits.LENGTH),
    GALLONS(3.78,TypeOfUnits.VOLUME),
    LITRE(1.00, TypeOfUnits.VOLUME),
    GRAMS(1.00, TypeOfUnits.WEIGHT),
    KG(1000,TypeOfUnits.WEIGHT),
    TONNE(1000, TypeOfUnits.WEIGHT);

    private final TypeOfUnits typeOfUnits;
    private final double baseUnit;

    ConvertUnit(double baseUnit, TypeOfUnits typeOfUnits) {
        this.baseUnit = baseUnit;
        this.typeOfUnits = typeOfUnits;
    }

    public static boolean compare(EqualityChecker input1, EqualityChecker input2) {
        if (input1.unit.typeOfUnits.equals(input2.unit.typeOfUnits)) {
            Double firstValue = Double.valueOf((Math.round(input1.value*input1.unit.baseUnit)));
            Double secondValue = Double.valueOf(Math.round(input2.value*input2.unit.baseUnit));
            return firstValue.equals(secondValue);
        }
        return false;
    }

    public static double addition(EqualityChecker input1, EqualityChecker input2) {
        if (input1.unit.typeOfUnits.equals(input2.unit.typeOfUnits)) {
            Double firstValue = input1.value*input1.unit.baseUnit;
            Double secondValue = input2.value*input2.unit.baseUnit;
            return Math.round(firstValue+secondValue);
        }
        return 0;
    }
}
}


