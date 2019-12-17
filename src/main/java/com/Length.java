package com;

import java.util.Objects;

public class Length {
    private final double value;
    private  Unit unit;

    enum Unit{
    FEET,INCH;
}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 &&
                unit == length.unit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }

    public Length(Unit unit, double value) {
        this.value = value;
        this.unit = unit;
    }
}
