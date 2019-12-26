package Array_1;

public class Array_1Main {
	static Array_1MainImpl impl;
	public static void main(String[] args) {
		
		int [] test = {6, 1, 2, 3};
		int [] test1 = {1, 2, 3, 1};
		int [] test3 = {1, 2, 3, 1};
		int [] test4 = {1};
		int [] testHas23 = {2, 4};
		int [] testRotateLeft3 = {2, 4, 5};
		int [] testRotateRight3 = {9, 7, 6};

		
		boolean verdict = Array_1MainImpl.firstLast6(test);
		System.out.println(verdict);
		
		verdict = Array_1MainImpl.sameFirstLast(test1);
		System.out.println(verdict);
		
		int [] result = Array_1MainImpl.makePi();
		System.out.println(result);
		
		verdict = Array_1MainImpl.commonEnd(test3, test4);
		System.out.println(verdict);
		
		int number = Array_1MainImpl.sum3(test3);
		System.out.println(number);
		
		number = Array_1MainImpl.sum2(test3);
		System.out.println(number);
		
		verdict = Array_1MainImpl.has23(testHas23);
		System.out.println(verdict);
		
		result = Array_1MainImpl.rotateLeft3(testRotateLeft3);
		System.out.println(result);
		
		result = Array_1MainImpl.reverse3(testRotateLeft3);
		System.out.println(result);
		
		result = Array_1MainImpl.maxEnd3(testRotateLeft3);
		System.out.println(result);
		
		result = Array_1MainImpl.middleWay(testRotateLeft3, testRotateRight3);
		System.out.println(result);
		
		result = Array_1MainImpl.makeEnds(test3);
		System.out.println(result);
		
		verdict = Array_1MainImpl.no23(testHas23);
		System.out.println(verdict);
		
		result = Array_1MainImpl.makeLast(test3);
		System.out.println(result);
	}

}
