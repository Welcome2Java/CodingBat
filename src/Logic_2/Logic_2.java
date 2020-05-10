package Logic_2;

public class Logic_2 {
	
	public static void main(String [] args) {
		
	}
	
	public int roundSum(int a, int b, int c) {
		return (round10(a) + round10(c) + round10(b));
	}

	public int round10(int num) {
		int remainder = num % 10;

		if (remainder >= 5) {
			return (10 - remainder) + num;
		} else if (remainder == 0) {
			return num;
		} else {
			return num - remainder;
		}
	}

	
	
	
	public boolean closeFar(int a, int b, int c) {
		  
		  if (Math.abs(a - b) <= 1 && Math.abs(a - c) >= 2 && Math.abs(b - c) >= 2){
		      return true;
		  } else if (Math.abs(a - c) <= 1 && Math.abs(a - b) >= 2 && Math.abs(b - c) >= 2){
		      return true;
		  }else{
		      return false;
		  }

		}
	
	
	public int noTeenSum(int a, int b, int c) {
		return fixTeen(a) + fixTeen(b) + fixTeen(c);
	}

	public int fixTeen(int n) {
		if (n >= 13 && n <= 19) {
			if (n == 15 || n == 16) {
				return n;
			} else {
				return 0;
			}
		} else {
			return n;
		}
	}

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
	

	public int luckySum(int a, int b, int c) {
		
		if (a == 13) {
			return 0;
		}

		if (b == 13) {
			return a;
		}
		if (c == 13) {
			return a + b;
		}

		return a + b + c;
	}

	public boolean makeBricks(int small, int big, int goal) {
		if (goal >= 5) {
			if (goal / 5 >= big) {
				goal = goal - (big * 5);
			} else {
				goal = goal % 5;
			}
		}
		if (goal <= small) {
			return true;
		}
		return false;
	}

	
	public int makeChocolate(int small, int big, int goal) {
		if(goal >= 5){
            if(goal/5 >= big){
                goal-= big * 5;
            }else{
                goal = goal % 5;
            }
        }
        if(goal <= small) {
        	return goal;
        }
        return -1;

	}

}
