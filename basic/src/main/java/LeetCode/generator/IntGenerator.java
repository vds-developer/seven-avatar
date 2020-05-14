package LeetCode.generator;

import java.util.Random;

public class IntGenerator implements AbstractGenerator {

	public static int getRandomInt(int range){
		return random.nextInt(range + 1);
	}
}
