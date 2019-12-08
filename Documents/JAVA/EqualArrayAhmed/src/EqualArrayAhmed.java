public class EqualArrayAhmed {

	public static void main(String[] args) {
		// Md Ahmed
		int[] a1 = { 1, 2, 3, 4 };
		int[] a2 = { 1, 2, 3, 5 };
		int[] a3 = { 1, 2, 3, 4 };
		int[] a4 = { 1, 2, 3, 4, 5, 6 };
		if (compareArrays1(a1, a2)) {
			System.out.println("Array 1 and 2 are equal.");
		} else {
			System.out.println("Array 1 and 2 are not equal.");
		}
		if (compareArrays2(a1, a3)) {
			System.out.println("Array 1 and 3 are equal.");
		} else {
			System.out.println("Array 1 and 3 are not equal.");
		}
		if (compareArrays3(a1, a4)) {
			System.out.println("Array 1 and 4 are equal.");
		} else {
			System.out.println("Array 1 and 4 are not equal.");
		}
	}

	public static boolean compareArrays1(int[] a1, int[] a2) { // compare array
																// method 1
		boolean equal = true;
		if (a1.length != a2.length) {
			equal = false;
		} else {
			for (int i = 0; i < a1.length; i++)
				if (a1[i] != a2[i]) {
					equal = false;
				}
		}
		return equal;
	}

	public static boolean compareArrays2(int[] a1, int[] a3) { // compare array
																// method 2
		boolean equal = true;
		if (a1.length != a3.length) {
			equal = false;
		} else {
			for (int i = 0; i < a1.length; i++)
				if (a1[i] != a3[i]) {
					equal = false;
				}
		}
		return equal;
	}

	public static boolean compareArrays3(int[] a1, int[] a4) { // compare array
																// method 3
		boolean equal = true;
		if (a1.length != a4.length) {
			equal = false;
		} else {
			for (int i = 0; i < a1.length; i++)
				if (a1[i] != a4[i]) {
					equal = false;
				}
		}
		return equal;

	}
}
