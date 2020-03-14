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

	
}
