package LeetCode.Medium;


import LeetCode.DataStructure.BinaryTree;

public class ValidateBinaryTree {
    public static Boolean ValidateBinaryTree(BinaryTree root) {
        if (root == null) return true;
      return  ValidateBinaryTree(root.root);
    }
    private static boolean ValidateBinaryTree(BinaryTree.Node node) {
        return ValidateBinaryTree(node.left) && ValidateBinaryTree(node.right);
    }

    private static Boolean checkLeftAndRight(BinaryTree.Node root) {
        return (root.right == null || root.right.value > root.value) &&
                (root.left == null || root.left.value < root.value);
    }

    public static void Print(BinaryTree root) {

    }
}
