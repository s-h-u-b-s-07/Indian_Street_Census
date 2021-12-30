package com.bridgelabz.IndianStreet;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;


public class StateCensusAnalyserTest {
    public static final String CSV_FILE_PATH = "C:\\Users\\shiv\\IdeaProjects\\IndianStreet\\IndianStreet\\IndianStreet\\src\\Data\\IndiaStateCensusData.csv";
    public static final String WRONG_CSV_FILE_PATH = "C:\\Users\\shiv\\IdeaProjects\\IndianStreet\\IndianStreet\\IndianStreet\\src\\Data\\IndiaStateData.csv";

    @Test
    public void givenFilePathShouldReturnNumberOfRecords() {
        try {
            StateCensusAnalyser censusAnalyser = new StateCensusAnalyser();
            int numOfRecords = censusAnalyser.loadIndiaCensusData(CSV_FILE_PATH);
            Assert.assertEquals(29, numOfRecords);
        } catch (CensusAnalyserException | IOException e) {

        }
    }

    @Test
    public void givenWrongFilePathShouldReturnCustomException() throws IOException, CensusAnalyserException {
        StateCensusAnalyser censusAnalyser = new StateCensusAnalyser();
        int numOfRecords = censusAnalyser.loadIndiaCensusData(WRONG_CSV_FILE_PATH);
        Assert.assertEquals(29, numOfRecords);

    }
}
