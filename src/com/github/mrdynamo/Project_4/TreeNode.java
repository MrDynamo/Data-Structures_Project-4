package com.github.mrdynamo.Project_4;

public class TreeNode<T> {
    T item; // Question
    TreeNode<T> leftChild; // Yes answer
    TreeNode<T> rightChild; // No answer

    public TreeNode(T newItem) {
        // Initializes tree node with item and no children.
        item = newItem;
        leftChild  = null;
        rightChild = null;
    }  // End constructor

    public TreeNode(T newItem,
                    TreeNode<T> left, TreeNode<T> right) {
        // Initializes tree node with item and
        // the left and right children references.
        item = newItem;
        leftChild  = left;
        rightChild = right;
    }  // End constructor

}  // End TreeNode