package com.github.mrdynamo.Project_4;

public class FTableArray implements ADTFrequencyTable {

    private String[][] ftArray;
    private final int MAX_SIZE = 10000;
    private int numOfComps;

    // Constructor
    public FTableArray() {
        ftArray = new String[MAX_SIZE][2];
        numOfComps = 0;
    }

    // Implement
    @Override
    public int size() {
        return 0;
    }

    // Implement
    @Override
    public boolean isEmpty() {
        return false;
    }

    // Implement
    @Override
    public void insert(KeyedItem newItem) throws FTableException {

    }

    // Implement
    @Override
    public int retrieve(Comparable searchKey) {
        return 0;
    }

    // Implement
    @Override
    public void saveFTable(String fileName) {

    }

    // Implement
    @Override
    public int getNumOfComps() {
        return numOfComps;
    }

} // End FTableArray
