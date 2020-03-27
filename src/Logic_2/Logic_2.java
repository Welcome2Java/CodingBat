package Logic_2;

public class Logic_2 {
	public int loneSum(int a, int b, int c) {
		if (a == b && b == c) {
			return 0;
		}

		if (a == b) {
			return c;
		}
		if (b == c) {
			return a;
		}
		if (a == c) {
			return b;
		}
		return a + b + c;
	}
	
	public boolean evenlySpaced(int a, int b, int c) {
		int small = 0;
		int medium = 0;
		int large = 0;

		// determining the smallest
		if (a < b && a < c) {
			small = a;
		} else if (b < a && b < c) {
			small = b;
		} else if (c < a && c < b) {
			small = c;
		}
		
		// determining which is the largest
		if (a > b && a > c) {
			large = a;
		} else if (b > a && b > c) {
			large = b;
		} else if (c > a && c > b) {
			large = c;
		}

		//determining the medium value
		if ((b > a && b < c) || (b > c && b < a)) {
			medium = b;
		} else if ((a > b && a < c) || (a > c && a < b)) {
			medium = a;
		} else if ((c > a && c < b) || (c > b && c < a)) {
			medium = c;
		}

		int differenceOne = Math.abs(large - medium);
		int differenceTwo = Math.abs(medium - small);
		if (differenceOne == differenceTwo) {
			return true;
		}
		return false;

	}
	
	public int blackjack(int a, int b) {
		if (a > 21 && b > 21) {
			return 0;
		} else if (a > 21) {
			return b;
		} else if (b > 21) {
			return a;
		}

		int differenceOne = Math.abs(21 - a);
		int differenceTwo = Math.abs(21 - b);

		if (differenceOne < differenceTwo) {
			return a;
		} else {
			return b;
		}
	}
	



}
