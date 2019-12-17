package com;

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
        Length inches = (Length) o;
        return Double.compare(inches.value, value) == 0;
    }

    public Length(  Unit unit,double value) {
        this.value = value;
        this.unit = unit;
    }
}
