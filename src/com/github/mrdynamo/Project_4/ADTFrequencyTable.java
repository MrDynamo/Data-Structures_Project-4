package com.github.mrdynamo.Project_4;

import java.io.IOException;

public interface ADTFrequencyTable {

    int size();
    // Determines the size of the table.
    // Precondition:
    // Postcondition:
    // Throws:

    boolean isEmpty();
    // Determines whether the table is empty.
    // Precondition:
    // Postcondition:
    // Throws:

    void insert(KeyedItem newItem) throws FTableException;
    // Inserts a newItem to the table. If newItem is already in the table, increment its count.
    // Otherwise newItem is inserted to the table with the count 1.
    // Set the number of comparisons required for this task accordingly.
    // Precondition:
    // Postcondition:
    // Throws: FTableException if frequency table is full.

    int retrieve(Comparable<String> searchKey);
    // Retrieves the count of an item with a given searchKey. Return 0 if not found.
    // Set the number of comparisons required for this task accordingly.
    // Precondition:
    // Postcondition:
    // Throws:

    void saveFTable(String filename) throws IOException;
    // Saves the words and their frequencies in the table in the output file filename in the ascending order based on the searchKey.
    // Precondition:
    // Postcondition:
    // Throws: IOException writing the file

    int getNumOfComps();
    // Returns the number of key comparisons required to perform a particular frequency table operation.
    // (In reality this operation might not be an operation of ADT frequency table.
    // It is included to obtain the statistics of comparisons.
    // Precondition:
    // Postcondition:
    // Throws:

} // End ADTFrequencyTable
