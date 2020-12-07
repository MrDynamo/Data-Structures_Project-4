package com.github.mrdynamo.Project_4;

public abstract class BinaryTreeBasis<K extends Comparable<? super K>> {

    protected TreeNode<K> root;

    public BinaryTreeBasis() {
        root = null;
    }

    public BinaryTreeBasis(K key) {
        root = new TreeNode<K>(key, null, null);
    }

    public boolean isEmpty() {
        // Returns true if the tree is empty, else returns false.
        return root == null;
    }

    public void makeEmpty() {
        // Removes all nodes from the tree.
        root = null;
    }

    public K getRootItemKey() throws TreeException {
        // Returns the item in the tree's root.
        if (root == null) {
            throw new TreeException("TreeException: Empty tree");
        }
        else {
            return root.key;
        }  // end if
    }

    public abstract void setRootItem(K key);
    // Throws UnsupportedOperationException if operation
    // is not supported.

}  // End BinaryTreeBasis
