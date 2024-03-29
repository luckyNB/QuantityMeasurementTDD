package com;

public class UnitManipulator {

    public double value = 0;
    public UnitConverter.ConvertUnit unit;

    @Override
    public boolean equals(Object o) {
        if (this == o) return false;
        if (o == null || getClass() != o.getClass()) return false;
        UnitManipulator length = (UnitManipulator) o;
        return Double.compare(length.value, value) == 0 &&
                unit == length.unit;
    }

    public UnitManipulator(UnitConverter.ConvertUnit unit, double value) {
        this.value = value;
        this.unit = unit;
    }

    public static boolean compare(UnitManipulator input1, UnitManipulator input2) throws UnitManipulatorException {
        if (input1.unit.typeOfUnits.equals(input2.unit.typeOfUnits)) {
            Double firstValue = Double.valueOf((Math.round(input1.value * input1.unit.baseUnit)));
            Double secondValue = Double.valueOf(Math.round(input2.value * input2.unit.baseUnit));
            return firstValue.equals(secondValue);
        }
        throw new UnitManipulatorException("invalid unit type..not compatible to compare", UnitManipulatorException
                .ExceptionType.WRONG_UNIT_TYPE);

    }

    public static double addition(UnitManipulator input1, UnitManipulator input2) throws UnitManipulatorException {
        if (input1.unit.typeOfUnits.equals(input2.unit.typeOfUnits) && input1.unit.typeOfUnits != TypeOfUnits.TEMPERATURE)  {
            Double firstValue = input1.value*input1.unit.baseUnit;
            Double secondValue = input2.value*input2.unit.baseUnit;
            return Math.round(firstValue+secondValue);
        }
        throw new UnitManipulatorException("invalid unit type..cannot add temperatures", UnitManipulatorException
                .ExceptionType.WRONG_UNIT_TYPE);
    }

    public Boolean compareTemperatures(UnitManipulator that) {
        Double temperature;
        if (this.unit.equals(UnitConverter.ConvertUnit.FAHRENHEIT)) {
            temperature = ((this.value - 32) * 5 / 9);
        }else {
            temperature = (this.value * 9 / 5) + 32;
        }
        return Double.compare(temperature,that.value) == 0;
    }
}
