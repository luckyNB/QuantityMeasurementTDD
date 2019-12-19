package com;

public class UnitManipulatorException extends Exception {
    public enum ExceptionType {
        WRONG_UNIT_TYPE
    }
    ExceptionType type;
    public UnitManipulatorException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }
}
