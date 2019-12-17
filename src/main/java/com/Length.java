package com;

public class Length {

    private final double value;
    public Conversion.ConversionOfUnits unit;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 &&
                unit == length.unit;
    }

    public Length(Conversion.ConversionOfUnits unit, double value) {
        this.value = value;
        this.unit = unit;
    }

    public boolean compareCheck(Length that) {
            Double firstValue = this.unit.convertToInches(this.value);
            Double secondValue = that.unit.convertToInches(that.value);
            return firstValue.equals(secondValue);
    }

}
