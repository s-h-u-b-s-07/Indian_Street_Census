package com.bridgelabz.IndianStreet;

public class CensusAnalyserException extends Exception {
    public ExceptionType type;

    public enum ExceptionType {
        WRONG_CSV_FILE_PATH
    }

    public CensusAnalyserException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }
}
