package functions;      //main.java.functions.ArraysManager.java;
public class ArraysManager {

	public static int squareSum(int[] n) {
		int sum = 0;
		for (int i = 0; i < n.length; i++) {
		sum += n[i]*n[i];
		}
		return sum;

		}
}
