package com.github.mrdynamo.Project_4;

public class FTableArray implements ADTFrequencyTable {

    private String[][] ftArray;

    // Constructor
    public FTableArray() {
        ftArray = new String[10000][10000];
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
        return 0;
    }

} // End FTableArray
