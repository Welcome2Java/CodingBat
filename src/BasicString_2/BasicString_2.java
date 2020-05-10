package BasicString_2;

public class BasicString_2 {
	
	public static void main(String [] args) {
		
	}
	
	public String plusOut(String str, String word) {
		String result = "";

		int i = 0;
		while (i < str.length()) {
			if (i <= str.length() - word.length()) {
				if(str.substring(i, i + word.length()).equals(word)) {
					result += word;
					i += word.length();
				}else {
					result += "+";
					i++;
				}
			} else {
				result += "+";
				i++;
			}

		}
		return result;
	}


	
	public boolean prefixAgain(String str, int n) {
		  String sub = str.substring(0,n);
		  String newStr = str.replaceFirst(sub, "");
		  if(newStr.contains(sub)){
		    return true;
		  }
		  return false;
		}

	
	public String zipZap(String str) {
		String result = "";
		if (str.length() < 3) {
			return str;
		}
		if (!str.contains("z") && !str.contains("p")) {
			return result;
		} else if (str.contains("z") && !str.contains("p")) {
			return str;
		} else if (!str.contains("z") && str.contains("p")) {
			return str;
		} else {
			for (int i = 0; i < str.length(); i++) {
				char value = str.charAt(i);
				if (value == 'z' && str.charAt(i + 2) == 'p') {
					result = result + value + str.charAt(i + 2);
					i++;
					i++;
				} else {
					result += value;
				}
			}

		}
		return result;
	}

	
	public String getSandwich(String str) {

		String check = "bread";
		int count = 0;

		for (int i = 0; i < str.length() - 4; i++) {
			String sub = str.substring(i, i + 5);
			if (sub.equals(check)) {
				count++;
			}
		}
		
		if (count == 1 || count == 0) {
			return "";
		} else {
			int firstIndex = str.indexOf(check);
			String firstCheck = str.substring(0, firstIndex + 5);
			str = str.replaceFirst(firstCheck, "");

			int lastIndex = str.lastIndexOf(check);
			String result = str.substring(0, lastIndex);

			return result;
		}
	}
	
	public boolean xyzThere(String str) {
		if (!str.contains("xyz")) {
			return false;
		} else {
			str = str.replace(".xyz", "yes");
			if (str.contains("xyz")) {
				return true;
			} else {
				return false;
			}
		}
	}
	
	public String mixString(String a, String b) {
		
		String result = "";
		int count = 0;
		
		if (a.length() == 0) {
			return b;
		}
		if (b.length() == 0) {
			return a;
		}
		if (a.length() == 0 && b.length() == 0) {
			return "";
		}

		int loopcondition = 0;
		if (a.length() == b.length()) {
			loopcondition = a.length();
		} else if (a.length() < b.length()) {
			loopcondition = a.length();
		} else {
			loopcondition = b.length();
		}
		
		for (int i = 0; i < loopcondition; i++) {
			char aStr = a.charAt(i);
			char bStr = b.charAt(i);
			count++;
			result = result + aStr + bStr;
		}

		if (a.length() < b.length()) {
			String sub = b.substring(count, b.length());
			result = result + sub;
		} else {
			String sub = a.substring(count, a.length());
			result = result + sub;
		}
		return result;
	}
	
	public boolean sameStarChar(String str) {
		boolean verdict = false;

		if (str.length() < 3) {
			return true;
		}

		for (int i = 0; i < str.length() - 1; i++) {
			char character = str.charAt(i);
			if (str.contains("*")) {
				if (i != 0) {
					if (character == '*') {
						if (str.charAt(i - 1) == str.charAt(i + 1)) {
							verdict = true;
						} else {
							verdict = false;
						}
					}
				}
			} else {
				verdict = true;
			}
		}
		return verdict;
	}


	public int countHi(String str) {

		int count = 0;
		String[] words = str.split(" +");

		if (words.length == 1) {
			String word = words[0];
			for (int n = 0; n < word.length() - 2; n++) {
				char character = word.charAt(n);
				char second = word.charAt(n + 1);
				if (character == 'h') {
					if (second == 'i') {
						count++;
					}
				}
			}
		}

		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			if (word.equals("hi") || word.contains("hi")) {
				count++;
			}
		}

		return count;
	}
	
	public boolean catDog(String str) {
		int cat = 0;
		int dog = 0;
		int length = str.length();
		if (length < 3) {
			return true;
		}
		if (str.contains("cat") && str.contains("dog")) {
			for (int i = 0; i < length - 2; i++) {
				char first = str.charAt(i);
				char second = str.charAt(i + 1);
				char third = str.charAt(i + 2);
				if (first == 'c') {
					if (second == 'a' && third == 't') {
						cat++;
					}
				}

				if (first == 'd') {
					if (second == 'o' && third == 'g') {
						dog++;
					}
				}
			}
			if (cat == dog) {
				return true;
			}
		}

		return false;
	}

	public String doubleChar(String str) {
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			char character = str.charAt(i);
			String convert = Character.toString(character);
			String twice = convert + convert;
			result = result + twice;
		}
		return result;
	}

	public boolean endOther(String a, String b) {
		int lengthA = a.length();
		int lengthB = b.length();
		
		
		if (a.length() == 0 || b.length() == 0) {
			return false;
		}
		String shortStr = "";
		if (a.length() < b.length()) {
			shortStr = a.toLowerCase();
			b = b.toLowerCase();
			if (b.contains(shortStr)) {
				if(b.substring((lengthB-lengthA), lengthB).equals(shortStr)){
					return true;
				}
			}

		} else {
			shortStr = b.toLowerCase();
			a = a.toLowerCase();
			if (a.contains(shortStr)) {
				if(a.substring((lengthA-lengthB), lengthA).equals(shortStr)){
					return true;
				}
			}
		}

		return false;
	}

	public int countCode(String str) {
		  int count = 0;
		  int length = str.length();
		  if(length<4) {
			  return 0;
		  }

		  for(int i=0; i<length-3; i++) {
			  char first = str.charAt(i);
			  char second = str.charAt(i+1);
			  char third = str.charAt(i+3);
			  if(first == 'c' && second == 'o' && third == 'e') {
				  count++;
			  }
		  }
		  return count;
	}

	public boolean bobThere(String str) {
		  int length = str.length();
		  if(length<3){
		    return false;
		  }
		  for(int i=0; i<length-2; i++){
		    char first = str.charAt(i);
		    char third = str.charAt(i+2);
		    if(first == 'b' && third == 'b'){
		      return true;
		    }
		  }
		  return false;
		}

	public String repeatSeparator(String word, String sep, int count) {
		String result = "";
		for (int i = 0; i < count; i++) {
			result = result + word;
			if (i != (count - 1)) {
				result = result + sep;
			}
		}
		return result;
	}
	
	public String repeatEnd(String str, int n) {
		String result = "";
		String extract = str.substring(str.length()-n, str.length());
		for(int i=0; i< n; i++) {
			result = result + extract;
		}
		
		
		return result;
	}


	public String repeatFront(String str, int n) {
		  String result = "";
		  
		  for(int i=n; i>0; i--){
		    String sub = str.substring(0,i);
		    result = result + sub;
		  }
		  return result;
		}
	
	public String oneTwo(String str) {
		String result = "";

		if (str.length() < 3) {
			return "";
		}

		for (int i = 0; i < str.length() - 2; i += 3) {
			char first = str.charAt(i);
			String sub = str.substring(i + 1, i + 3);
			String combine = sub + first;
			result += combine;

		}

		return result;
	}


}
