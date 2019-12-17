package arraysClass;

import java.util.Arrays;

public class Cars {
	public static void main(String[] args) {
		String car[]= {"bmw","amg","mercedes","toyota","zenda","lexus"};
		System.out.println(Arrays.toString(car));
		Arrays.sort(car);
		System.out.println(Arrays.toString(car));
	}

}
