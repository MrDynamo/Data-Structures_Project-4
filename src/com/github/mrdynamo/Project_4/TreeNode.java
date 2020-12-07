package com.github.mrdynamo.Project_4;

public class TreeNode<K extends Comparable<? super K>> extends KeyedItem<K> {
    K key; // Key
    TreeNode<K> leftChild; // Yes answer
    TreeNode<K> rightChild; // No answer

    public TreeNode(K key) {
        // Initializes tree node with item and no children.
        super(key);
        //this.key = key;
        //this.value = value;
        leftChild  = null;
        rightChild = null;
    }  // End constructor

    public TreeNode(K key, TreeNode<K> left, TreeNode<K> right) {
        // Initializes tree node with item and
        // the left and right children references.
        super(key);
        //this.key = key;
        //this.value = value;
        leftChild  = left;
        rightChild = right;
    }  // End constructor

}  // End TreeNode