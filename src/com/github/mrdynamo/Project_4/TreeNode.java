package com.github.mrdynamo.Project_4;

public class TreeNode<K, V> {
    K key; // Key
    V value; // Value
    TreeNode<K, V> leftChild; // Yes answer
    TreeNode<K, V> rightChild; // No answer

    public TreeNode(K key, V value) {
        // Initializes tree node with item and no children.
        this.key = key;
        this.value = value;
        leftChild  = null;
        rightChild = null;
    }  // End constructor

    public TreeNode(K key, V value,
                    TreeNode<K, V> left, TreeNode<K, V> right) {
        // Initializes tree node with item and
        // the left and right children references.
        this.key = key;
        this.value = value;
        leftChild  = left;
        rightChild = right;
    }  // End constructor

}  // End TreeNode