package com.github.mrdynamo.Project_4;

import java.io.FileWriter;
import java.io.IOException;

public class FTableBST extends BinaryTreeBasis<Word> implements ADTFrequencyTable {

    private final int MAX_SIZE = 10000;
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

    // Returns size of BST
    @Override
    public int size()
    {
        return size(root);
    }
    
    // Returns size of BST
    public int size(TreeNode<Word> node) {
        if (node == null)
            return 0;
        else
            return(size(node.leftChild) + 1 + size(node.rightChild));
    }

    // Checks if BST is empty
    @Override
    public boolean isEmpty() {
        return root == null;
    }

    // Inserts word into frequency table
    @Override
    public void insert(KeyedItem newItem) throws FTableException {

        if (this.size() > MAX_SIZE)
            throw new FTableException("FTableException: Frequency table full!");

        TreeNode<Word> r = root, prev = null, tmpNode = null;
        Word tmp = new Word(newItem.toString().toUpperCase(), 1);
        tmpNode = new TreeNode<Word>(tmp);

        while (r != null) {
            prev = r;
            if (r.getKey().compareTo(tmp) < 0) {
                r = r.rightChild;
            } else {
                r = r.leftChild;
            }

            numComparisons++;

        }

        if (root == null) {
            root = tmpNode;
            totalWordCount++;
            distinctWordCount++;
            numComparisons++;
        } else if (prev.getKey().compareTo(tmp) < 0) {
            prev.rightChild = new TreeNode<Word>(tmp);
            totalWordCount++;
            distinctWordCount++;
            numComparisons++;
        } else if (prev.getKey().compareTo(tmp) == 0) {
            prev.getKey().addCount(1);
            totalWordCount++;
            numComparisons++;
        } else {
            prev.leftChild = new TreeNode<Word>(tmp);
            totalWordCount++;
            distinctWordCount++;
            numComparisons++;
        }

        numInsertions++;
    }

    // Returns count of searchKey
    @Override
    public int retrieve(Comparable searchKey) {
        Word tmp = new Word(searchKey.toString().toUpperCase());

        TreeNode<Word> tmpNode = findNode(root, tmp);

        if (tmpNode == null)
            return 0;
        else
            return tmpNode.getKey().getCount();
    }

    // Saves frequency table to file
    @Override
    public void saveFTable(String fileName) throws IOException {
        FileWriter writer = new FileWriter(fileName);
        writer.write("total_number_of_words: " + this.getTotalWordCount() + System.lineSeparator());
        writer.write("total_number_of_distinct_words: " + this.getDistinctWordCount() + System.lineSeparator());

        writer.write(System.lineSeparator());

        writer.write("number_of_comparisons: " + this.getNumOfComps() + System.lineSeparator());

        writer.write(inOrder());

        writer.write(System.lineSeparator());

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
            tmp += node.getKey().toString().toUpperCase() + " " + node.getKey().getCount();
            tmp += inOrder(node.rightChild);
        }

        return tmp;
    }

    private TreeNode<Word> findNode(TreeNode<Word> node, Word w) {
        // Base Cases: root is null or key is present at root
        numComparisons++;

        if (node == null || node.getKey().compareTo(w) == 0)
            return node;

        numComparisons++;

        // Key is greater than root's key
        if (node.getKey().compareTo(w) < 0)
            return findNode(node.rightChild, w);

        numComparisons++;

        // Key is smaller than root's key
        return findNode(node.leftChild, w);
    }

} // End FTableBST
