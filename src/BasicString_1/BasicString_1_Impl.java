package BasicString_1;

/*
 * coding bat String-1 solution
 */
public class BasicString_1_Impl {
	public static String helloName(String name) {
		return "Hello " + name + "!";
	}

	public static String makeAbba(String a, String b) {
		return a + b + b + a;
	}

	public static String makeTags(String tag, String word) {
		return "<" + tag + ">" + word + "</" + tag + ">";
	}

	public static String makeOutWord(String out, String word) {
		String first = out.substring(0, 2);
		String last = out.substring(2, out.length());
		return first + word + last;
	}

	public static String extraEnd(String str) {
		return str.substring(str.length() - 2, str.length()) + str.substring(str.length() - 2, str.length())
				+ str.substring(str.length() - 2, str.length());
	}

	public static String firstTwo(String str) {
		if (str.length() < 2) {
			return str;
		}
		return str.substring(0, 2);
	}

	public static String firstHalf(String str) {
		return str.substring(0, str.length() / 2);
	}

	public static String withoutEnd(String str) {
		return str.substring(1, str.length() - 1);
	}

	public static String comboString(String a, String b) {
		if (a.length() > b.length()) {
			return b + a + b;
		}
		return a + b + a;
	}

	public static String nonStart(String a, String b) {
		return a.substring(1, a.length()) + b.substring(1, b.length());
	}

	public static String left2(String str) {
		if (str.length() <= 2) {
			return str;
		}

		return str.substring(2, str.length()) + str.substring(0, 2);
	}

	public static String right2(String str) {
		if (str.length() <= 2) {
			return str;
		}
		return str.substring(str.length() - 2, str.length()) + str.substring(0, str.length() - 2);
	}

	public static String theEnd(String str, boolean front) {
		if (front) {
			return str.substring(0, 1);
		}
		return str.substring(str.length() - 1, str.length());
	}

	public static String withouEnd2(String str) {
		if (str.length() <= 2) {
			return "";
		}
		return str.substring(1, str.length() - 1);
	}

	public static String middleTwo(String str) {
		if (str.length() <= 2) {
			return str;
		}
		return str.substring((str.length() / 2) - 1, (str.length() / 2) + 1);
	}

	public static boolean endsLy(String str) {
		if (str.length() < 2) {
			return false;
		} else if (str.length() >= 2 && (str.substring(str.length() - 2, str.length()).equals("ly"))) {
			return true;
		}

		return false;
	}

	public static String nTwice(String str, int n) {
		String front = str.substring(0, n);
		String end = str.substring(str.length() - n, str.length());
		return front + end;
	}

	public static String twoChar(String str, int index) {
		if (index == str.length() || index < 0 || index > str.length() || index == str.length() - 1) {
			return str.substring(0, 2);
		}

		return str.substring(index, index + 2);
	}

	public static String middleThree(String str) {
		return str.substring(str.length() / 2 - 1, str.length() / 2 + 2);
	}

	public static boolean hasBad(String str) {
		if (str.length() < 3) {
			return false;
		}
		if (str.length() == 3) {
			if (str.equals("bad")) {
				return true;
			} else {
				return false;
			}

		}

		if (str.substring(0, 3).equals("bad") || str.substring(1, 4).equals("bad")) {
			return true;
		}
		return false;
	}

	public static String atFirst(String str) {
		if (str.length() == 0) {
			return "@@";
		}
		if (str.length() < 2) {
			return str + "@";
		}
		return str.substring(0, 2);
	}

	public static String lastChars(String a, String b) {
		if (a.equals("")) {
			a = "@";
		}
		if (b.equals("")) {
			b = "@";
		}

		char characterA = a.charAt(0);

		char characterB = b.charAt(b.length() - 1);

		String result = Character.toString(characterA) + Character.toString(characterB);
		return result;
	}

	public static String conCat(String a, String b) {
		if (a.length() == 0 || b.length() == 0) {
			return a + b;
		}

		if (a.charAt(a.length() - 1) == b.charAt(0)) {
			// need to mod for the same characters
			String sub = a.substring(0, a.length() - 1);
			return sub + b;
		}

		return a + b;
	}

	public static String lastTwo(String str) {
		if (str.length() < 2) {
			return str;
		}
		String subEnd = str.charAt(str.length() - 1) + "";
		String subSecondEnd = str.charAt(str.length() - 2) + "";

		if (str.length() == 2) {
			return subEnd + subSecondEnd;
		}
		String subBody = str.substring(0, str.length() - 2);
		return subBody + subEnd + subSecondEnd;
	}

	public static String seeColor(String str) {
		if (str.length() > 2) {
			if (str.substring(0, 3).equals("red")) {
				return "red";
			}
		}
		if (str.length() > 3) {
			if (str.substring(0, 4).equals("blue")) {
				return "blue";
			}
		}
		return "";
	}

	public static boolean frontAgain(String str) {
		if (str.length() < 2) {
			return false;
		}
		String temp1 = str.substring(0, 2);
		String temp2 = str.substring(str.length() - 2, str.length());

		if (temp1.equals(temp2)) {
			return true;
		}
		return false;
	}

	public static String minCat(String a, String b) {

		int aLength = a.length();
		int bLength = b.length();

		if (aLength > bLength) {
			return a.substring(aLength - bLength, aLength) + b;
		}
		return a + b.substring(bLength - aLength, bLength);
	}

	public static String extraFront(String str) {
		if(str.length()<=2) {
			return str + str + str;
		}
		String sub = str.substring(0,2);
		return sub + sub + sub;
	}

	public static String without2(String str) {
		if (str.length() < 2) {
			return str;
		}
		if (str.length() == 2) {
			return "";
		}
		//no need to declare extra objects to check. Substring comparison is enough
		String temp = str.substring(str.length() - 2, str.length());
		String temp1 = str.substring(0, 2);
		if (temp.equals(temp1)) {
			return str.substring(2, str.length());
		}
		return str;
	}

	public static String deFront(String str) {
		if(str.length()==2){
		    if(str.charAt(0)=='a' && str.charAt(1)=='b'){
		      return "ab";
		    } 
		    if(!(str.charAt(0)=='a') && str.charAt(1)=='b'){
		      return "b" + str.charAt(str.length());
		    }
		    if((str.charAt(0)=='a') && !(str.charAt(1)=='b')){
		      return "a";
		    }

		    return "";
		  }
		  if(str.length()>2){
		    if(str.charAt(0)=='a' && !(str.charAt(1)=='b')){
		      return "a" + str.substring(2, str.length());
		    }
		    if(str.charAt(0)=='a' && (str.charAt(1)=='b')){
		      return "ab" + str.substring(2, str.length());
		    }
		    if(!(str.charAt(0)=='a') && (str.charAt(1)=='b')){
		    return "b" + str.substring(2, str.length());
		    }
		    
		    if(!(str.charAt(0)=='a' && str.charAt(1)=='b')){
		      return str.substring(2, str.length());
		    } 
		  }
		  return str+str;
	}

	public static String startWord(String str, String word) {
		return null;
	}

	public static String withoutX(String str) {
		return null;
	}

	public static String withoutX2(String str) {
		return null;
	}
}
