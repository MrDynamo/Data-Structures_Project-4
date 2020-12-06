package com.github.mrdynamo.Project_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FTableArray implements ADTFrequencyTable {

    //private String[][] ftArray;
    private Word[] ftArray;
    private List<Word> words;
    private final int MAX_SIZE = 10000;
    private int numOfComps;

    // Constructor
    public FTableArray() {
        //ftArray = new String[MAX_SIZE][2];
        ftArray = new Word[MAX_SIZE];
        words = new ArrayList<Word>(MAX_SIZE);
        numOfComps = 0;
    }

    // Implement
    @Override
    public int size() {
        return ftArray.length;
    }

    // Implement
    @Override
    public boolean isEmpty() {
        return ftArray.length == 0;
    }

    // Implement
    @Override
    public void insert(KeyedItem newItem) throws FTableException {

        if (words.size() > MAX_SIZE)
            throw new FTableException("FTableException: Frequency table full!");

        Word tmp = new Word(newItem.toString(), 1);
        int tmpIndex = words.indexOf(tmp);
        int tmpCount = words.get(tmpIndex).getCount();
        if (words.contains(tmp))
            words.set(tmpIndex, new Word(newItem.toString().toUpperCase(), tmpCount));
        else
            words.add(tmp);

        Collections.sort(words);

        /*
        if (words.contains(words.stream().anyMatch(o -> o.getKey().equals(newItem.toString())))) {
            words.set()
        }
         */

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
