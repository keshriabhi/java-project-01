
public class TestJava {

	/*
	 * @author Abhinav
	 */
	private static void addKeyToEachArrayElement(int a[], int key) {

	}

	/*
	 * @author Abhishek
	 */
	private static void substractKeyFromEachArrayElement(int a[], int key) {

	}

	/*
	 * @author Bhavani
	 */
	private static void multiplyKeyToEachArrayElement(int a[], int key) {

	}

	/*
	 * @author Durgakishore
	 */
	private static void divideKeyFromEachArrayElement(int a[], int key) {

	}

	/*
	 * @author Mithun
	 */
	private static void modKeyFromEachArrayElement(int a[], int key) {

	}

	/*
	 * @author Nasreen
	 */
	private static int addAllArrayElement(int a[]) {
		return 0;
	}

	/*
	 * @author Roushan
	 */
	private static int substractAllArrayElement(int a[]) {
		return 0;
	}

	/*
	 * @author Rohit
	 */
	private static int multiplyAllArrayElement(int a[]) {
		return 0;
	}

	/*
	 * @author Shivay
	 */
	private static boolean isPalimdrome(String str) {
		return false;
	}

	/*
	 * @author Shubham
	 */
	private static int sumOfDigitOfNumber(int number) {
		return 0;
	}

	private static void printArray(int array[]) {
		for (int ele : array) {
			System.out.println(ele);
		}

	}

	public static void main(String[] args) {
		int array01[] = { 10, 8, 6, 4, 1, 2, 7, 55, 67, 80 };
		addKeyToEachArrayElement(array01, 5);
		printArray(array01);

		int array02[] = { 10, 8, 6, 4, 1, 2, 7, 55, 67, 80 };
		substractKeyFromEachArrayElement(array02, 5);
		printArray(array02);

		int array03[] = { 10, 8, 6, 4, 1, 2, 7, 55, 67, 80 };
		multiplyKeyToEachArrayElement(array03, 5);
		printArray(array03);

		int array04[] = { 10, 8, 6, 4, 1, 2, 7, 55, 67, 80 };
		divideKeyFromEachArrayElement(array04, 2);
		printArray(array04);

		int array05[] = { 10, 8, 6, 4, 1, 2, 7, 55, 67, 80 };
		modKeyFromEachArrayElement(array05, 2);
		printArray(array05);

		int array06[] = { 10, 8, 6, 4, 1, 2, 7, 55, 67, 80 };
		System.out.println(addAllArrayElement(array06));

		int array07[] = { 10, 8, 6, 4, 1, 2, 7, 55, 67, 80 };
		System.out.println(substractAllArrayElement(array07));

		int array08[] = { 10, 8, 6, 4, 1, 2, 7, 55, 67, 80 };
		System.out.println(multiplyAllArrayElement(array08));

		System.out.println(isPalimdrome("aabbcbbaa"));

		System.out.println(sumOfDigitOfNumber(12356));
	}

}
