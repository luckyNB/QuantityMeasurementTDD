package com;

public class ConvertUnits {

    public enum ConvertUnit {
        FEET(TypeOfUnits.LENGTH) {
            public double convertToDifferentValues(double value) {
                return value * 12;
            }
        }, INCHES(TypeOfUnits.LENGTH) {
            public double convertToDifferentValues(double value) {
                return value;
            }
        }, YARD(TypeOfUnits.LENGTH) {
            public double convertToDifferentValues(double value) {
                return value * 3 * 12;
            }
        }, CM(TypeOfUnits.LENGTH) {
            public double convertToDifferentValues(double value) {
                return Math.round(value / 2.54);
            }
        }, GALLONS(TypeOfUnits.VOLUME) {
            public double convertToDifferentValues(double value) {
                return value * 3.78;
            }
        }, LITRE(TypeOfUnits.VOLUME) {
            public double convertToDifferentValues(double value) {
                return value;
            }
        };

        public final TypeOfUnits thisType;

        ConvertUnit(TypeOfUnits type) {
            this.thisType = type;
        }

        public abstract double convertToDifferentValues(double value);
    }
}


