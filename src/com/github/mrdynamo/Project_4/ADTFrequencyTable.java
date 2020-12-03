package com.github.mrdynamo.Project_4;

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

    void insert() throws FTableException;
    // Inserts a newItem to the table. If newItem is already in the table, increment its count. Otherwise newItem is inserted to the table with the count 1. Set the number of comparisons required for this task accordingly.T hrows FTableException if frequency tableisfull.
    // Precondition:
    // Postcondition:
    // Throws:

    int retrieve();
    // Retrieves the count of an item with a given searchKey. Return 0if not found. Set the number of comparisons required for this task accordingly.
    // Precondition:
    // Postcondition:
    // Throws:

    void saveFTable();
    // Saves the words and their frequencies in the table in the output file filename in the ascending order based on the searchKey.
    // Precondition:
    // Postcondition:
    // Throws:

    int getNumOfComps();
    // Returns the number of key comparisons required to perform a particular frequency table operation. (In reality this operation might not be an operation of ADT frequency table. It is included to obtain the statistics of comparisons.
    // Precondition:
    // Postcondition:
    // Throws:

}
