package LeetCode.Easy;

import LeetCode.DataStructure.BinaryTree;
import LeetCode.generator.TreeGenerator;

import java.util.HashMap;

public class MostFrequentSubTreeSum {
	public static Integer MostFrequentSubTreeSum(BinaryTree binaryTree){
		// key is subtree sum, value is the frequency
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		BinaryTree.Node root = binaryTree.root;
		search(root, hashMap);
		Integer subtreeRootValue = null;

		for (Integer key :
				hashMap.keySet()) {
				if (subtreeRootValue == null) {
					subtreeRootValue = key;
				}else if (hashMap.get(key) > hashMap.get(subtreeRootValue)) {
					subtreeRootValue = key;
				}
		}
		return hashMap.get(subtreeRootValue);
	}

	private static int getSum(BinaryTree.Node node, int sum) {
		if (node == null) return sum;
		return node.value + getSum(node.left,sum) + getSum(node.right, sum);

	}

	private static void search(BinaryTree.Node node, HashMap<Integer, Integer> hashMap){
		if (node == null) return;
		int sum = getSum(node, 0);
		if(hashMap.containsKey(sum)) {
			hashMap.put(sum, hashMap.get(sum) + 1);
		}else{
			hashMap.put(sum, 1);
		}
		search(node.left, hashMap);
		search(node.right, hashMap);
	}

	public static void main (String[] args) {
		BinaryTree binaryTree = TreeGenerator.GenerateBinaryTree(10);
		//BinaryTree binaryTree = new BinaryTree();
		//binaryTree.add(0);
		//binaryTree.add(0);
		//binaryTree.add(1);
		TreeGenerator.InOrderPrint(binaryTree.root);

		System.out.println();

		int mostFrequent = MostFrequentSubTreeSum(binaryTree);
		System.out.println(mostFrequent);

		TreeGenerator.InOrderPrint(binaryTree.root);
	}
}
