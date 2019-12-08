import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomTenAhmed {

	public static void main(String[] args) {
		// Md Ahmed

		final int RANGE = 20;
		final int SIZE = 10;

		int[] randArray = new int[SIZE];
		for (int i = 0; i < randArray.length; i++) {
			randArray[i] = (int) (Math.random() * RANGE) + 1;
		}
		System.out.print("All array items: ");
		for (int element : randArray) {
			System.out.print(element + " ");
		}
		System.out.println();
		// even index
		System.out.print("Even index items: ");
		for (int i = 0; i < randArray.length; i = i + 2) {
			System.out.print(randArray[i] + " ");
		}
		System.out.println();
		// even elements
		System.out.print("Even elements: ");
		for (int i = 0; i < randArray.length; i++) {
			if (randArray[i] % 2 == 0) {
				System.out.print(randArray[i] + " ");
			}
		}
		System.out.println();
		// reversed array
		System.out.print("Reversed array: ");
		for (int i = randArray.length - 1; i >= 0; i--) {
			System.out.print(randArray[i] + " ");
		}
		System.out.println();
		System.out.println("First array element: " + randArray[0]);
		System.out.println("Last array element: "
				+ randArray[randArray.length - 1]);
		System.out
				.println("Highest number in array: " + findLargest(randArray));
		System.out
				.println("Lowest number in array: " + findSmallest(randArray));
	}

	public static int findLargest(int[] array) { // highest number method
		int largest = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > largest) {
				largest = array[i];
			}
		}
		return largest;
	}

	public static int findSmallest(int[] array) { // lowest number method
		int smallest = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < smallest) {
				smallest = array[i];
			}
		}
		return smallest;
	}

}