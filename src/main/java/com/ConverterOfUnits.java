package com;

public class ConverterOfUnits {

    private double value = 0;
    public ConvertUnits.ConvertUnit unit;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConverterOfUnits length = (ConverterOfUnits) o;
        return Double.compare(length.value, value) == 0 &&
                unit == length.unit;
    }

    public ConverterOfUnits(ConvertUnits.ConvertUnit unit, double value) {
        this.value = value;
        this.unit = unit;
    }

    public boolean compareCheck(ConverterOfUnits that) {
        if (this.unit.thisType.equals(that.unit.thisType) ){
            Double firstValue = this.unit.convertToDifferentValues(this.value);
            Double secondValue = that.unit.convertToDifferentValues(that.value);
            return firstValue.equals(secondValue);
        }
        return false;
    }

    public double additionOfUnits(ConverterOfUnits that) {
        Double firstValue = this.unit.convertToDifferentValues(this.value);
        Double secondValue = that.unit.convertToDifferentValues(that.value);
        return firstValue+secondValue;
    }

}
