package LeetCode.generator;

import LeetCode.DataStructure.BinaryTree;

public class TreeGenerator {
	public static BinaryTree GenerateBinaryTree(int size) {
		int[] array = ArrayGenerator.GenerateDistinctRandomIntArray(size);
		BinaryTree binaryTree = new BinaryTree();
		for (int i = 0; i < size; i++) {
			binaryTree.add(array[i]);
		}
		return binaryTree;
	}

	public static void InOrderPrint(BinaryTree.Node node) {
		if (node == null) return;
		InOrderPrint(node.left);
		System.out.print(node.value + " ");
		InOrderPrint(node.right);
	}

}
