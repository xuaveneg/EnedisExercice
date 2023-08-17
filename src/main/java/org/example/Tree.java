package org.example;

public class Tree {

    private Node root;

    public Tree(Node root) {
        this.root = root;
    }

    public boolean isSubTree(Tree tree) {
        return this.root.isSubNode(tree.root);
    }
}
