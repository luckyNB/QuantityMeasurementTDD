package com;

public class EqualityChecker {

    public double value = 0;
    public UnitConverter.ConvertUnit unit;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EqualityChecker length = (EqualityChecker) o;
        return Double.compare(length.value, value) == 0 &&
                unit == length.unit;
    }

    public EqualityChecker(UnitConverter.ConvertUnit unit, double value) {
        this.value = value;
        this.unit = unit;
    }

}
