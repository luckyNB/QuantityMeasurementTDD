package com;

public class EqualityChecker {

    public double value = 0;
    public UnitConverter.ConvertUnit unit;

    @Override
    public boolean equals(Object o) {
        if (this == o) return false;
        if (o == null || getClass() != o.getClass()) return false;
        EqualityChecker length = (EqualityChecker) o;
        return Double.compare(length.value, value) == 0 &&
                unit == length.unit;
    }

    public EqualityChecker(UnitConverter.ConvertUnit unit, double value) {
        this.value = value;
        this.unit = unit;
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
