package com.github.mrdynamo.Project_4;

import java.io.FileWriter;
import java.io.IOException;

public class FTableBST extends BinaryTreeBasis<Word> implements ADTFrequencyTable {

    private TreeNode<Word> root;
    private int numOfComps;

    // Constructor
    public FTableBST() {
        numOfComps = 0;
        //root = ;
    }

    // Implement
    @Override
    public int size() {
        return 0;
    }

    // Implement
    @Override
    public boolean isEmpty() {
        return root == null;
    }

    // Implement
    @Override
    public void insert(KeyedItem newItem) throws FTableException {
        TreeNode<Word> r = root, prev = null, tmpNode = null;
        Word tmp = new Word(newItem.toString().toUpperCase(), 1);
        tmpNode = new TreeNode<Word>(tmp);

        while (r != null) {
            prev = r;
            if (r.key.compareTo(tmp) < 0)
                r = r.rightChild;
            else
                r = r.leftChild;
        }

        if (root == null)
            root = new TreeNode<Word>(tmp);
        else if (prev.key.compareTo(tmp) < 0)
            prev.rightChild = new TreeNode<Word>(tmp);
        else
            prev.leftChild = new TreeNode<Word>(tmp);
    }

    // Implement
    @Override
    public int retrieve(Comparable searchKey) {
        return 0;
    }

    // Implement
    @Override
    public void saveFTable(String fileName) throws IOException {
        /*
        FileWriter writer = new FileWriter(fileName);
        writer.write("total_number_of_words: " + this.getTotalWordCount() + System.lineSeparator());
        writer.write("total_number_of_distinct_words: " + this.getDistinctWordCount() + System.lineSeparator());
        for (Word w : this.getWords()) {
            writer.write(w.getKey().toUpperCase() + " " + w.getCount() + System.lineSeparator());
        }
        writer.close();

         */
    }

    // Implement
    @Override
    public int getNumOfComps() {
        return numOfComps;
    }

    @Override
    public void setRootItem(Word key) {

    }

} // End FTableBST
