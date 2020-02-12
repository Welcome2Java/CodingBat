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


}
