package com;

public class TypeOfUnits {

    public enum ConvertUnit {
       FEET {
           public double convertToInches(double value) {
               return value * 12;
           }

       }, INCHES {
            public double convertToInches(double value) {
               return value;
           }
        }, YARD {
            public double convertToInches(double value) {
               return value * 3 * 12;
           }
        }, CM {
            public double convertToInches(double value) {
                return Math.round(value / 2.54);
            }
        };

        public abstract double convertToInches(double value);
    }
}


