package arraysClass;

public class TwoMaxCesar {

	public static void main(String[] args) {


		int[] numbers = {23, 1, 34, 3, 54, 54, 51};

		// CHECKS FIRST MAX NUMBER
		int max = 0;
		for (int number : numbers) {
			if (number > max) {
				max = number;
			}
		}
		System.out.println(max);

		//CHECK SECOND MAX NUMBER
		int max2 = 0;
		for (int num : numbers) {
			if (num != max) {
				if (num > max2) {
					max2 = num;
				}
			}
		}
		System.out.println(max2);

	}
}