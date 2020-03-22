package BasicString_2;

public class BasicString_2 {
	
	public void run() {
		
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


}
