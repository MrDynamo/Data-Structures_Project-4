package com.github.mrdynamo.Project_4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class FTableArray implements ADTFrequencyTable {

    //private String[][] ftArray;
    private Word[] ftArray;
    private List<Word> words;
    private final int MAX_SIZE = 10000;
    private int numOfComps, totalWordCount, distinctWordCount;

    // Constructor
    public FTableArray() {
        //ftArray = new String[MAX_SIZE][2];
        ftArray = new Word[MAX_SIZE];
        words = new ArrayList<Word>(MAX_SIZE);
        numOfComps = 0;
        totalWordCount = 0;
        distinctWordCount = 0;
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

        int tmpIndex, tmpCount;

        Word tmp = new Word(newItem.toString(), 1);

        /*
        if (words.contains(tmp)) {
            System.out.println("Contains");
            tmpIndex = words.indexOf(tmp);
            tmpCount = words.get(tmpIndex).getCount();
            words.set(tmpIndex, new Word(newItem.toString().toUpperCase(), tmpCount));
            totalWordCount++;
        } else {
            System.out.println("New");
            words.add(tmp);
            totalWordCount++;
            distinctWordCount++;
        }
         */


        if (contains(words, newItem.toString().toUpperCase())) {
            System.out.println("Contains");
            tmpIndex = words.indexOf(tmp);
            tmpCount = words.get(tmpIndex).getCount();
            words.set(tmpIndex, new Word(newItem.toString().toUpperCase(), tmpCount));
            totalWordCount++;
        } else {
            System.out.println("New");
            words.add(tmp);
            totalWordCount++;
            distinctWordCount++;
        }

        Collections.sort(words);

    }

    // Implement
    @Override
    public int retrieve(Comparable searchKey) {
        return 0;
    }

    // Implement
    @Override
    public void saveFTable(String fileName) throws IOException {
        FileWriter writer = new FileWriter("outputArrayInitial.txt");
        writer.write("total_number_of_words: " + this.getTotalWordCount() + System.lineSeparator());
        writer.write("total_number_of_distinct_words: " + this.getDistinctWordCount() + System.lineSeparator());
        for (Word w : this.getWords()) {
            writer.write(w.getKey().toUpperCase() + " " + w.getCount() + System.lineSeparator());
        }
        writer.close();
    }

    // Return number of comparisons
    @Override
    public int getNumOfComps() {
        return numOfComps;
    }

    // Return words list
    public List<Word> getWords() {
        return this.words;
    }

    // Return total word count
    public int getTotalWordCount() {
        return this.totalWordCount;
    }

    // Return distinct word count
    public int getDistinctWordCount() {
        return this.distinctWordCount;
    }
    
    public boolean contains(List<Word> list, String key) {
        return list.stream().filter(o -> o.getKey().toUpperCase().equals(key.toUpperCase())).findFirst().isPresent();
    }

    public void perform(List<Word> list, String key) {
        list.stream().filter(o -> o.getKey().toUpperCase().equals(key.toUpperCase())).forEach(o -> {

        });
    }

} // End FTableArray
