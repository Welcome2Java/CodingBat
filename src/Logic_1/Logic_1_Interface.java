package Logic_1;

public interface Logic_1_Interface {
	public static boolean cigarParty(int cigars, boolean isWeekend) {
		if (isWeekend) {
			if (cigars >= 40) {
				return true;
			}
		}
		if (cigars >= 40 && cigars <= 60) {
			return true;
		}
		return false;
	}

	// none of the following below are used currently
	public static int dateFashion(int you, int date) {
		if (you == 2 || date == 2) {
			return 0;
		}

		if ((you >= 8 && date >= 8) || (you >= 8 || date >= 8)) {
			return 2;
		}
		if ((you >= 8 && date <= 2) || (you <= 2 && date >= 8)) {
			return 0;
		}
		if ((you >= 5 && date <= 2) || (you <= 2 && date >= 5) || (you <= 2 && date <= 2)) {
			return 0;
		}

		return 1;
	}

	public static boolean squirrelPlay(int temp, boolean isSummer) {
		if (!isSummer) {
			if (temp >= 60 && temp <= 90) {
				return true;
			} else {
				return false;
			}
		}
		if (temp >= 60 && temp <= 100) {
			return true;
		} else {
			return false;
		}
	}

	public static int caughtSpeeding(int speed, boolean isBirthday) {
		if (!isBirthday) {
			if (speed < 61) {
				return 0;
			} else if (speed >= 61 && speed <= 80) {
				return 1;
			} else {
				return 2;
			}
		}
		if (speed < 66) {
			return 0;
		} else if (speed >= 66 && speed <= 85) {
			return 1;
		} else {
			return 2;
		}
	}

	public static int sortaSum(int a, int b) {
		int sum = a + b;
		if (sum >= 10 && sum <= 19) {
			return 20;
		} else {
			return sum;
		}
	}

	public static String alarmClock(int day, boolean vacation) {
		if (!vacation) {
			if (day == 1 || day == 2 || day == 3 || day == 4 || day == 5) {
				return "7:00";
			} else {
				return "10:00";
			}
		}
		if (day == 1 || day == 2 || day == 3 || day == 4 || day == 5) {
			return "10:00";
		} else {
			return "off";
		}

	}

	public static boolean love6(int a, int b) {
		return ((a == 6 || b == 6) || (a + b == 6) || (Math.abs(a - b) == 6));
	}

	public static boolean in1To10(int n, boolean outsideMode) {
		if (!outsideMode) {
			return ((n >= 1 && n <= 10));
		}
		return ((n <= 1 || n >= 10));
	}

	public static boolean specialEleven(int n) {
		return (n % 11 == 0 || n % 11 == 1);

	}

	public static boolean more20(int n) {

		return (n % 20 == 1 || n % 20 == 2);

	}

	public static boolean old35(int n) {
		if (n % 3 == 0) {
			if (n % 5 == 0) {
				return false;
			}
			return true;
		}
		if (n % 5 == 0) {
			if (n % 3 == 0) {
				return false;
			}
			return true;
		}
		return false;
	}

	public static boolean nearTen(int num) {
		return (num % 10 == 2 || num % 10 == 1 || num % 10 == 0 || num % 10 == 8 || num % 10 == 9);
	}

	public static int teenSum(int a, int b) {
		if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) {
			return 19;
		}
		return a + b;
	}

	public static String fizzString(String str) {
		if (str.charAt(0) == 'f' && str.charAt(str.length() - 1) == 'b') {
			return "FizzBuzz";
		} else if (str.charAt(0) == 'f') {
			return "Fizz";
		} else if (str.charAt(str.length() - 1) == 'b') {
			return "Buzz";
		}
		return str;
	}

	public static boolean twoAsOne(int a, int b, int c) {
		if (a + b == c || b + c == a || a + c == b) {
			return true;
		}
		return false;
	}

	public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
		if (!isAsleep) {
			if (isMorning && isMom) {
				return true;
			} else if (!isMorning && isMom) {
				return true;
			} else if (!isMorning && !isMom) {
				return true;
			} else {
				return false;
			}
		}
		if (isAsleep) {
			return false;
		}
		return true;
	}

	public static int teaParty(int tea, int candy) {
		if (tea < 5 || candy < 5) {
			return 0;
		} else if (tea >= (2 * candy) || candy >= (2 * tea)) {
			return 2;
		} else if (tea >= 5 && candy >= 5) {
			return 1;
		}

		return 0;
	}

	public static String fizzString2(int n) {
		if (n % 3 == 0) {
			if (n % 5 == 0) {
				return "FizzBuzz!";
			} else {
				return "Fizz!";
			}
		}
		if (n % 5 == 0) {
			return "Buzz!";
		}
		return String.valueOf(n) + "!";

	}

	public static boolean inOrder(int a, int b, int c, boolean bOk) {
		if (bOk) {
			if (a < b && b < c) {
				return true;
			}
			if (a > b && b < c) {
				return true;
			}

		}
		if (a > b || a > c || b > c) {
			return false;
		}
		return true;
	}

	public static boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
		if (equalOk) {
			if (a <= b && b <= c) {
				return true;
			}
		}
		if (a < b && b < c) {
			return true;
		}

		return false;
	}

	public static boolean lastDigit(int a, int b, int c) {
		int modOne = a % 10;
		int modTwo = b % 10;
		int modThree = c % 10;
		return ((modOne == modTwo) || (modOne == modThree) || (modThree == modTwo));
	}

	public static int withoutDoubles(int die1, int die2, boolean noDoubles) {
		if (noDoubles) {
			if (die1 == die2) {
				if (die1 == 6) {
					return 1 + die2;
				}
				return die1 + die2 + 1;
			}
			return die1 + die2;
		}
		return die1 + die2;
	}

	public static int maxMod5(int a, int b) {
		if (a == b) {
			return 0;
		}

		if (a % 5 == b % 5) {
			if (a > b) {
				return b;
			} else {
				return a;
			}
		}

		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	public static int redTicket(int a, int b, int c) {
		if (a == 2 && b == 2 && c == 2) {
			return 10;
		}
		if (a == b && b == c && a == c) {
			return 5;
		}
		if (a != b && a != c) {
			return 1;
		}

		return 0;
	}

	public static int greenTicket(int a, int b, int c) {
		if (a != b && b != c && c != a) {
			return 0;
		}
		if (a == b && b == c && c == a) {
			return 20;
		}
		return 10;
	}

	public static int blueTicket(int a, int b, int c) {
		int ab = a + b;
		int bc = b + c;
		int ac = a + c;

		if ((ab == 10) || (bc == 10) || (ac == 10)) {
			return 10;
		}
		if ((ab - bc == 10) || (ab - ac) == 10) {
			return 5;
		}
		return 0;
	}

	public static int sumLimit(int a, int b) {
		int sum = a + b;
		String sumValue = String.valueOf(sum);
		String aValue = String.valueOf(a);
		if (sumValue.length() > aValue.length()) {
			return a;
		}

		return a + b;
	}

	public static boolean shareDigit(int a, int b) {
		String aString = String.valueOf(a);
		String bString = String.valueOf(b);

		if ((aString.charAt(0) == bString.charAt(0)) || (aString.charAt(0) == bString.charAt(1))
				|| (aString.charAt(1) == bString.charAt(0)) || (aString.charAt(1) == bString.charAt(1))) {
			return true;
		}
		return false;
	}

	public static boolean less20(int n) {
		if (n % 20 == 18 || n % 20 == 19) {
			return true;
		}
		return false;
	}

	public static boolean lessBy10(int a, int b, int c) {
		  if(c-a ==10 || c-a > 10){
		    return true;
		  }
		   if(b-a ==10 || b-a > 10){
		    return true;
		  }
		  if(a-b ==10 || a-b > 10){
		    return true;
		  }
		  
		  if(c-b ==10 || c-b > 10){
		    return true;
		  }
		  
		  if(b-c ==10 || b-c > 10){
		    return true;
		  }
		  
		  
		  
		  return false;

}
