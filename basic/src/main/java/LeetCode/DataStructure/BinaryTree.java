package src.main.java.LeetCode.DataStructure;

public class BinaryTree {
    public int value;
    public BinaryTree left;
    public BinaryTree right;
    BinaryTree(int x, BinaryTree left, BinaryTree right) {
        value = x;
        this.left = left;
        this.right = right;
    }
}
