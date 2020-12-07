package com.github.mrdynamo.Project_4;

import java.io.FileWriter;
import java.io.IOException;

public class FTableBST extends BinaryTreeBasis<Word> implements ADTFrequencyTable {

    private TreeNode<Word> root;
    private int numComparisons, numInsertions, totalWordCount, distinctWordCount;

    // Constructor
    public FTableBST() {
        root = null;
        numComparisons = 0;
        numInsertions = 0;
        totalWordCount = 0;
        distinctWordCount = 0;
    }

    // Implement - Returns size of BST
    @Override
    public int size() {
        return 0;
    }

    // Checks if BST is empty
    @Override
    public boolean isEmpty() {
        return root == null;
    }

    // Implement - Inserts word into frequency table
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

    // Implement - Returns count of searchKey
    @Override
    public int retrieve(Comparable searchKey) {
        return 0;
    }

    // Saves frequency table to file
    @Override
    public void saveFTable(String fileName) throws IOException {
        FileWriter writer = new FileWriter(fileName);
        writer.write("total_number_of_words: " + this.getTotalWordCount() + System.lineSeparator());
        writer.write("total_number_of_distinct_words: " + this.getDistinctWordCount() + System.lineSeparator());
        writer.write(System.lineSeparator());

        writer.write(inOrder());

        writer.close();
    }

    // Returns number of comparisons made
    @Override
    public int getNumOfComps() {
        return numComparisons;
    }

    // Return total word count
    public int getTotalWordCount() {
        return this.totalWordCount;
    }

    // Return distinct word count
    public int getDistinctWordCount() {
        return this.distinctWordCount;
    }

    // Sets root item of BST
    @Override
    public void setRootItem(Word key) {
        this.root = new TreeNode<Word>(key);
    }

    // InOrder traversal
    private String inOrder() {
        return inOrder(this.root);
    }

    // InOrder traversal
    private String inOrder(TreeNode<Word> node) {
        String tmp = "";
        if (node != null) {
            tmp += inOrder(node.leftChild) + System.lineSeparator();
            tmp += node.key.toString().toUpperCase();
            tmp += inOrder(node.rightChild);
        }

        return tmp;
    }

} // End FTableBST
