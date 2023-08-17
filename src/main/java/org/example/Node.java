package org.example;

import java.util.Objects;

public class Node {

    private Node right;
    private Node left;
    private int value;

    public Node(int value) {
        this.value = value;
        this.right = null;
        this.left = null;
    }

    public Node(int value, Node firstLeft, Node firstRight) {
        this.value = value;
        this.right = firstRight;
        this.left = firstLeft;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return value == node.value && Objects.equals(right, node.right) && Objects.equals(left, node.left);
    }

    @Override
    public int hashCode() {
        return Objects.hash(right, left, value);
    }

    public boolean isSubNode(Node node) {
        if (this.equals(node)) {
            return true;
        }
        if (this.left != null && this.left.equals(node)) {
            return true;
        }
        if (this.right != null && this.right.equals(node)) {
            return true;
        }
        return (this.left != null && this.left.isSubNode(node)) || (this.right != null && this.right.isSubNode(node));
    }
}
