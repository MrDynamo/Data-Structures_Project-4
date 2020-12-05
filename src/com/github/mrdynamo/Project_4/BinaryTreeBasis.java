package com.github.mrdynamo.Project_4;

public abstract class BinaryTreeBasis<T> {

    protected TreeNode<T> root;

    public BinaryTreeBasis() {
        root = null;
    }

    public BinaryTreeBasis(T rootItem) {
        root = new TreeNode<T>(rootItem, null, null);
    }

    public boolean isEmpty() {
        // Returns true if the tree is empty, else returns false.
        return root == null;
    }

    public void makeEmpty() {
        // Removes all nodes from the tree.
        root = null;
    }

    public T getRootItem() throws TreeException {
        // Returns the item in the tree's root.
        if (root == null) {
            throw new TreeException("TreeException: Empty tree");
        }
        else {
            return root.item;
        }  // end if
    }

    public abstract void setRootItem(T newItem);
    // Throws UnsupportedOperationException if operation
    // is not supported.

}  // End BinaryTreeBasis
