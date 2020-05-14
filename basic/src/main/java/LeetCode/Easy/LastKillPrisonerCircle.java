package LeetCode.Easy;

import LeetCode.generator.IntGenerator;

import java.util.LinkedList;

public class LastKillPrisonerCircle {

	public static int LastKillPrisonerCircle(int n, int k){
		if(n<1) return 0;
		LinkedList<Integer> prisonerList = new LinkedList<Integer>();
		for (int i = 1; i < n+1; i++) {
			prisonerList.add(i);
		}
		int currentIndex = 0;
		while(prisonerList.size() > 1) {
			currentIndex = (currentIndex + k - 1 ) % n;
			prisonerList.remove(currentIndex);
			n -=1;
		}
		return prisonerList.getFirst().intValue();
	}

	public static void main(String[] args) {
		int size = IntGenerator.getRandomInt(15);
		int successive =  IntGenerator.getRandomInt(7);
		int last = LastKillPrisonerCircle(size, successive);
		System.out.println("Size: " + size);
		System.out.println("Successive: " + successive);
		System.out.println(last);
	}
}
