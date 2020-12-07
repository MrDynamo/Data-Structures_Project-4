package com.github.mrdynamo.Project_4;

public class TreeNode<K extends Comparable<? super K>> extends KeyedItem<K> {
    K key; // Key
    TreeNode<K> leftChild; // Yes answer
    TreeNode<K> rightChild; // No answer

    // Initializes tree node with item and no children.
    public TreeNode(K key) {
        super(key);
        leftChild  = null;
        rightChild = null;
    }  // End constructor

    // Initializes tree node with item and the left and right children references.
    public TreeNode(K key, TreeNode<K> left, TreeNode<K> right) {
        super(key);
        leftChild  = left;
        rightChild = right;
    }  // End constructor

}  // End TreeNode