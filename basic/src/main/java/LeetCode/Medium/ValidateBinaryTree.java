package src.main.java.LeetCode.Medium;


import src.main.java.LeetCode.DataStructure.BinaryTree;

public class ValidateBinaryTree {
    public static Boolean ValidateBinaryTree(BinaryTree root) {
        if (root == null) return true;
        return checkLeftAndRight(root) && ValidateBinaryTree(root.left) && ValidateBinaryTree(root.right);
    }

    private static Boolean checkLeftAndRight(BinaryTree root) {
        return (root.right == null || root.right.value > root.value) &&
                (root.left == null || root.left.value < root.value);
    }

    public static void Print(BinaryTree root) {

    }
}
