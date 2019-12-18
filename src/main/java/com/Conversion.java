package com;

public class Conversion {

   public enum ConversionOfUnits {

       FEET {
           public double convertToInches(double value) {
               return value * 12;
           }

       }, INCHES {
           public double convertToInches(double value) {
               return value;
           }

       },
       YARD {
           public double convertToInches(double value) {

               return value * 3 * 12;
           }
       };
       public double convertToInches(double value) {return 0.0;}
       }
   }


