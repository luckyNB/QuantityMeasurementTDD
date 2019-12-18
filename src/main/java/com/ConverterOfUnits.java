package com;

public class ConverterOfUnits {

    private double value = 0;
    public TypeOfUnits.ConvertUnit unit;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConverterOfUnits length = (ConverterOfUnits) o;
        return Double.compare(length.value, value) == 0 &&
                unit == length.unit;
    }

    public ConverterOfUnits(TypeOfUnits.ConvertUnit unit, double value) {
        this.value = value;
        this.unit = unit;
    }

    public boolean compareCheck(ConverterOfUnits that) {
        Double firstValue = this.unit.convertToInches(this.value);
        Double secondValue = that.unit.convertToInches(that.value);
        return firstValue.equals(secondValue);
    }

    public double additionOfUnits(ConverterOfUnits that) {
        Double firstValue = this.unit.convertToInches(this.value);
        Double secondValue = that.unit.convertToInches(that.value);
        return firstValue+secondValue;
    }

}
