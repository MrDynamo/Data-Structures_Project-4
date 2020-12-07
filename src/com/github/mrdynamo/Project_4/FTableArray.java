package com.github.mrdynamo.Project_4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class FTableArray implements ADTFrequencyTable {

    private List<Word> words;
    private final int MAX_SIZE = 10000;
    private int numOfComps, totalWordCount, distinctWordCount;

    // Constructor
    public FTableArray() {
        words = new ArrayList<Word>(MAX_SIZE);
        numOfComps = 0;
        totalWordCount = 0;
        distinctWordCount = 0;
    }

    // Returns size of frequency table
    @Override
    public int size() {
        return totalWordCount;
    }

    // Checks if frequency table is empty
    @Override
    public boolean isEmpty() {
        return words.size() == 0;
    }

    // Inserts word into frequency table
    @Override
    public void insert(KeyedItem newItem) throws FTableException {

        if (words.size() > MAX_SIZE)
            throw new FTableException("FTableException: Frequency table full!");

        Word tmp = new Word(newItem.toString().toUpperCase(), 1);

        int contains = Collections.binarySearch(words, tmp);
        if (contains < 0) {
            System.out.println("DEBUG: New");
            words.add(tmp);
            totalWordCount++;
            distinctWordCount++;
        } else {
            System.out.println("DEBUG: Contains");
            int tmpCount = words.get(contains).getCount();
            words.set(contains, new Word(tmp.getKey(), tmpCount + 1));
            totalWordCount++;
        }

        Collections.sort(words);

    }

    // Retrieves count of input word
    @Override
    public int retrieve(Comparable searchKey) {

        Word tmp = new Word(searchKey.toString().toUpperCase(), 1);

        int contains = Collections.binarySearch(words, tmp);

        if (contains < 0)
            return 0;
        else
            return words.get(contains).getCount();

    }

    // Saves frequency table to file
    @Override
    public void saveFTable(String fileName) throws IOException {
        FileWriter writer = new FileWriter(fileName);
        writer.write("total_number_of_words: " + this.getTotalWordCount() + System.lineSeparator());
        writer.write("total_number_of_distinct_words: " + this.getDistinctWordCount() + System.lineSeparator());
        writer.write(System.lineSeparator());
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

} // End FTableArray
