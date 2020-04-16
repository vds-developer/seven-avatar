package LeetCode.DataStructure;

public class BinaryTree {
    public Node root;
    private Node addRecursive(Node current, int value) {
        if (current == null) return new Node(value);
        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        }else {
            current.right = addRecursive(current.right, value);
        }
        return current;
    }

    public void add(int value) {
        root = addRecursive(root, value);
    }

    public class Node {
        public int value;
        public Node left;
        public Node right;

        Node(int value){
            this.value = value;
            right = null;
            left = null;
        }
    }
}
