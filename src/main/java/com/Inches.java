package com;

public class Inches {
    private final double value;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inches inches = (Inches) o;
        return Double.compare(inches.value, value) == 0;
    }

    public Inches(double value) {
        this.value = value;
    }
}
