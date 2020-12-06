package com.github.mrdynamo.Project_4;

public class FTableBST extends BinaryTreeBasis<String, Integer> implements ADTFrequencyTable {

    private TreeNode<Word, Integer> root;
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
        return false;
    }

    // Implement
    @Override
    public void insert(Word newItem) throws FTableException {
        TreeNode<Word, Integer> r = root, prev = null;
        while (r != null) {
            prev = r;
            if (r.key.compareTo(newItem) < 0)
                r = r.rightChild;
            else
                r = r.leftChild;
        }

        if (root == null)
            root = new TreeNode<Word, Integer>(newItem, 1);
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

    @Override
    public void setRootItem(String key) {

    }

} // End FTableBST
