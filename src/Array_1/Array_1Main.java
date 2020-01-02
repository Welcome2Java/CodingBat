package Array_1;

public class Array_1Main {
	static Array_1MainImpl impl;

	public static void main(String[] args) {

		int[] test = { 6, 1, 2, 3 };
		int[] test1 = { 1, 2, 3, 1 };
		int[] test3 = { 1, 2, 3, 1 };
		int[] test4 = { 1 };
		int[] testHas23 = { 2, 4 };
		int[] testRotateLeft3 = { 2, 3, 5 };
		int[] testRotateRight3 = { 9, 7, 6 };
		int[] maxTripleArray = { 1, 7, 3, 1, 5 };

		boolean verdict = Array_1MainImpl.firstLast6(test);
		System.out.println(verdict);

		verdict = Array_1MainImpl.sameFirstLast(test1);
		System.out.println(verdict);

		int[] result = Array_1MainImpl.makePi();
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
		System.out.println();

		verdict = Array_1MainImpl.commonEnd(test3, test4);
		System.out.println(verdict);

		int number = Array_1MainImpl.sum3(test3);
		System.out.println(number);

		number = Array_1MainImpl.sum2(test3);
		System.out.println(number);

		verdict = Array_1MainImpl.has23(testHas23);
		System.out.println(verdict);

		result = Array_1MainImpl.rotateLeft3(testRotateLeft3);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
		System.out.println();
		result = Array_1MainImpl.reverse3(testRotateLeft3);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
		System.out.println();
		System.out.println();
		result = Array_1MainImpl.maxEnd3(testRotateLeft3);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
		System.out.println();
		result = Array_1MainImpl.middleWay(testRotateLeft3, testRotateRight3);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
		System.out.println();
		result = Array_1MainImpl.makeEnds(test3);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
		System.out.println();
		verdict = Array_1MainImpl.no23(testHas23);
		System.out.println(verdict);

		result = Array_1MainImpl.makeLast(test3);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
		System.out.println();
		verdict = Array_1MainImpl.double23(testHas23);
		System.out.println(verdict);

		result = Array_1MainImpl.makeLast(testHas23);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
		System.out.println();
		result = Array_1MainImpl.biggerTwo(testHas23, testHas23);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
		System.out.println();
		result = Array_1MainImpl.makeMiddle(testHas23);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
		System.out.println();
		result = Array_1MainImpl.plusTwo(testHas23, testHas23);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
		System.out.println();
		int value = Array_1MainImpl.maxTriple(maxTripleArray);
		System.out.println(value);
	}

}
