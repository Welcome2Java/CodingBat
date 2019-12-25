import java.util.ArrayList;

/*
 * solutions to codingBat Java
 * Warmup-1 Problems
 */

public class WarmUp1Impl {
	public boolean sleepIn(boolean weekday, boolean vacation) {
		if (!weekday || vacation) {
			return true;
		}
		return false;
	}

	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		if ((aSmile == true && bSmile == true) || (aSmile == false && bSmile == false)) {
			return true;
		}
		return false;
	}

	public int sumInt(int a, int b) {
		if (a == b) {
			return (a + b) * 2;
		}
		return a + b;
	}

	public int diff21(int n) {
		if (n > 21) {
			return Math.abs(21 - n) * 2;
		} else {
			return Math.abs(21 - n);
		}
	}

	public boolean parrotTrouble(boolean talking, int hour) {
		if ((talking == true && hour < 7) || (talking == true && hour > 20)) {
			return true;
		}
		return false;
	}

	public boolean makes10(int a, int b) {
		if (a == 10 || b == 10 || a + b == 10) {
			return true;
		}
		return false;
	}

	public boolean nearHundred(int n) {
		return true;
	}

	public boolean posNeg(int a, int b, boolean negative) {
		if (negative) {
			return (a < 0 && b < 0);
		} else {
			return ((a < 0 && b > 0) || (a > 0 && b < 0));
		}
	}

	public String notString(String str) {
		if (str.length() >= 3 && str.substring(0, 3).contentEquals("not")) {
			return str;
		}
		return "not " + str;
	}

	public String missingChar(String str, int n) {
		StringBuilder sb = new StringBuilder(str);
		return sb.deleteCharAt(n).toString();

	}

	public String frontBack(String str) {
		if (str.length() <= 1) {
			return str;
		}
		String mid = str.substring(1, str.length() - 1);
		return str.charAt(str.length() - 1) + mid + str.charAt(0);
	}

	public String front3(String str) {
		if (str.length() <= 3) {
			return str + str + str;
		}
		String sub = str.substring(0, 3);

		return sub + sub + sub;
		// no one in the right mind would return a value in this form.
	}

	public String backAround(String str) {
		char last = str.charAt(str.length() - 1);
		return last + str + last;
	}

	public boolean or35(int n) {
		if (n % 3 == 0 || n % 5 == 0) {
			return true;
		}
		return false;
	}

	public String front22(String str) {
		if (str.length() <= 2) {
			return str + str + str;
		}
		String sub = str.substring(0, 2);
		return sub + str + sub;
	}

	public boolean startHi(String str) {
		if (str.length() < 2) {
			return false;
		} else if (str.substring(0, 2).equals("hi")) {
			return true;
		}
		return false;
	}

	public boolean icyHot(int temp1, int temp2) {
//		if (temp1 < 0) {
//			if (temp2 > 100) {
//				return true;
//			}
//		}
//		if (temp1 > 100) {
//			if (temp2 < 0) {
//				return true;
//			}
//		}
//		return false;
		// refactored
		if (temp1 < 0 && temp2 > 100) {
			return true;
		}
		if (temp1 > 100 && temp2 < 0) {
			return true;
		}
		return false;
	}

	public boolean in1020(int a, int b) {
//		if ((a <= 20 && a >= 10) || (b <= 20 && b >= 10)) {
//			return true;
//		}
//		return false;
		// refactored
		return ((a <= 20 && a >= 10) || (b <= 20 && b >= 10));
	}

	public boolean hasTeen(int a, int b, int c) {
		return ((a <= 19 && a >= 13) || (b <= 19 && b >= 13) || (c <= 19 && c >= 13));
	}

	public boolean loneTeen(int a, int b) {
		if ((13 <= a && a <= 19) || (13 <= b && b <= 19)) {
			if ((13 <= a && a <= 19) && (13 <= b && b <= 19)) {
				return false;
			}
			return true;
		}
		return false;
	}

	public String delDel(String str) {
		if (str.length() > 3 && str.substring(1, 4).equals("del")) {
			return str.replace("del", "");
		}
		return str;
	}

	public boolean mixStart(String str) {
		// if(str.length()>=3 && str.substring(1,3).equals("ix")){
		// return true;
		// }
		// return false;
		return (str.length() >= 3 && str.substring(1, 3).equals("ix"));
	}

	public String startOz(String str) {
		if (str.equals("")) {
			return "";
		}

		if (str.length() > 1 && str.substring(0, 2).equals("oz")) {
			return "oz";
		} else if (str.charAt(0) == 'o') {
			return "o";
		} else if (str.charAt(1) == 'z') {
			return "z";
		}

		return "";
	}

	public int intMax(int a, int b, int c) {
		int max = a;
		if (a < b) {
			max = b;
		}
		if (max < c) {
			max = c;
		}
		return max;
	}

	public boolean in3050(int a, int b) {
		if ((30 <= a && a <= 40) && (30 <= b && b <= 40)) {
			return true;
		} else if ((40 <= a && a <= 50) && (40 <= b && b <= 50)) {
			return true;
		} else {
			return false;
		}
	}

	public int close10(int a, int b) {
		int temp1 = 0, temp2 = 0;
		temp1 = Math.abs(10 - a);
		temp2 = Math.abs(10 - b);
		if (temp1 == temp2) {
			return 0;
		} else if (temp1 > temp2) {
			return b;
		} else {
			return a;
		}
	}

	public int max1020(int a, int b) {
		if (((10 <= a && a <= 20) && (10 <= b && b <= 20))) {
			if (a > b) {
				return a;
			} else {
				return b;
			}
		} else if ((10 <= a && a <= 20) && !(10 <= b && b <= 20)) {
			return a;
		} else if (!(10 <= a && a <= 20) && (10 <= b && b <= 20)) {
			return b;
		} else {
			return 0;
		}
	}

	public boolean stringE(String str) {
		int count = 0;
		ArrayList<Character> string = new ArrayList<Character>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			string.add(c);
		}
		for (int n = 0; n < string.size(); n++) {
			char e = string.get(n);
			if (e == 'e') {
				count++;
			}
		}
		if (count <= 3 && count > 0) {
			return true;
		} else {
			return false;
		}
		/*
		 * better to be refactored to this int count = 0;
		 * 
		 * for (int i=0; i<str.length(); i++) { if (str.charAt(i) == 'e') count++; //
		 * alternately: str.substring(i, i+1).equals("e") }
		 * 
		 * return (count >= 1 && count <= 3);
		 */
	}

	public boolean lastDigit(int a, int b) {
		if (b % 10 == a) {
			return true;
		} else if (a % 10 == b) {
			return true;
		} else {
			return false;
		}
	}

	public String endUp(String str) {
		if (str.length() <= 2) {
			return str.toUpperCase();
		}
		String start = str.substring(0, str.length() - 3);
		String end = str.substring(str.length() - 3, str.length()).toUpperCase();
		return start + end;
	}

	public String everyNth(String str, int n) {
		String result = "";
		
		for(int i=0; i<str.length(); i= i+n) {
			result = result + str.charAt(i);
		}
		return result;
	}

}
