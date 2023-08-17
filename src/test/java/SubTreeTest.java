import org.example.Node;
import org.example.Tree;
import org.junit.Assert;
import org.junit.Test;

public class SubTreeTest {

    @Test
    public void tree_with_one_node_is_its_own_subtree() {
        // GIVEN
        Node root = new Node(2);
        Tree t = new Tree(root);
        // WHEN
        boolean isSubTree = t.isSubTree(t);
        // THEN
        Assert.assertTrue(isSubTree);
    }

    @Test
    public void same_tree_with_right_and_left_should_find_subtree() {
        // GIVEN
        Node firstLeft = new Node(0);
        Node firstRight = new Node(1);
        Node firstRoot = new Node(2, firstLeft, firstRight);
        Tree first = new Tree(firstRoot);
        Node secondLeft = new Node(0);
        Node secondRight = new Node(1);
        Node secondRoot = new Node(2, secondLeft, secondRight);
        Tree second = new Tree(secondRoot);
        // WHEN
        boolean isSubTree = first.isSubTree(second);
        // THEN
        Assert.assertTrue(isSubTree);
    }

    @Test
    public void different_tree_with_right_and_left_should_not_find_subtree() {
        // GIVEN
        Node firstLeft = new Node(0);
        Node firstRight = new Node(1);
        Node firstRoot = new Node(2, firstLeft, firstRight);
        Tree first = new Tree(firstRoot);
        Node secondLeft = new Node(0);
        Node secondRight = new Node(1);
        Node secondRoot = new Node(3, secondLeft, secondRight);
        Tree second = new Tree(secondRoot);
        // WHEN
        boolean isSubTree = first.isSubTree(second);
        // THEN
        Assert.assertFalse(isSubTree);
    }

    @Test
    public void tree_with_right_and_left_should_find_leaf_as_subtree() {
        // GIVEN
        Node firstLeft = new Node(0);
        Node firstRight = new Node(1);
        Node firstRoot = new Node(2, firstLeft, firstRight);
        Tree first = new Tree(firstRoot);
        Node secondRoot = new Node(1);
        Tree second = new Tree(secondRoot);
        // WHEN
        boolean isSubTree = first.isSubTree(second);
        // THEN
        Assert.assertTrue(isSubTree);
    }

    @Test
    public void tree_with_right_only_should_find_leaf_as_subtree() {
        // GIVEN
        Node firstRight = new Node(1);
        Node firstRoot = new Node(2, null, firstRight);
        Tree first = new Tree(firstRoot);
        Node secondRoot = new Node(1);
        Tree second = new Tree(secondRoot);
        // WHEN
        boolean isSubTree = first.isSubTree(second);
        // THEN
        Assert.assertTrue(isSubTree);
    }

    @Test
    public void should_return_true_on_full_tree_example() {
        // GIVEN
        Node firstNode1 = new Node(1);
        Node firstNode5 = new Node(5);
        Node firstNode2 = new Node(2, firstNode5, firstNode1);
        Node firstNode6 = new Node(6);
        Node firstNode0 = new Node(0, firstNode6, firstNode2);
        Node firstRoot2 = new Node(2, null, firstNode0);
        Tree first = new Tree(firstRoot2);
        Node secondNode1 = new Node(1);
        Node secondNode5 = new Node(5);
        Node secondNode2 = new Node(2, secondNode5, secondNode1);
        Node secondNode6 = new Node(6);
        Node secondNode0 = new Node(0, secondNode6, secondNode2);
        Node secondRoot2 = new Node(2, null, secondNode0);
        Node secondNode0Right = new Node(0);
        Node secondNode3 = new Node(3);
        Node secondNode0Right2 = new Node(0, secondNode3, secondNode0Right);
        Node secondRoot = new Node(6, secondRoot2, secondNode0Right2);
        Tree second = new Tree(secondRoot);
        // WHEN
        boolean subTree = second.isSubTree(first);
        // THEN
        Assert.assertTrue(subTree);
    }

    @Test
    public void should_return_false_on_full_tree_example() {
        // GIVEN
        Node firstNode1 = new Node(2);
        Node firstNode5 = new Node(5);
        Node firstNode2 = new Node(2, firstNode5, firstNode1);
        Node firstNode6 = new Node(6);
        Node firstNode0 = new Node(0, firstNode6, firstNode2);
        Node firstRoot2 = new Node(2, null, firstNode0);
        Tree first = new Tree(firstRoot2);
        Node secondNode1 = new Node(1);
        Node secondNode5 = new Node(5);
        Node secondNode2 = new Node(2, secondNode5, secondNode1);
        Node secondNode6 = new Node(6);
        Node secondNode0 = new Node(0, secondNode6, secondNode2);
        Node secondRoot2 = new Node(2, null, secondNode0);
        Node secondNode0Right = new Node(0);
        Node secondNode3 = new Node(3);
        Node secondNode0Right2 = new Node(0, secondNode3, secondNode0Right);
        Node secondRoot = new Node(6, secondRoot2, secondNode0Right2);
        Tree second = new Tree(secondRoot);
        // WHEN
        boolean subTree = second.isSubTree(first);
        // THEN
        Assert.assertFalse(subTree);
    }
}
