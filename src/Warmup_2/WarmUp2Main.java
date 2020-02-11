package Warmup_2;


public class WarmUp2Main {

	public static void main(String[]args) {

	}
	
	public String stringTimes(String str, int n) {
		if (n == 0) {
			return "";
		}
		if (n == 1) {
			return str;
		}
		String result = "";

		for (int i = 0; i < n; i++) {
			result = result + str;
		}
		
		return result;
	}
	
	public String frontTimes(String str, int n) {
		  String result = "";
		  String subString = "";
		  if(str.length()>2){
		    subString = str.substring(0,3);
		  } else{
		    subString = str;
		  }
		  
		   for(int i=0; i<n; i++){
		    result = result+subString;
		  }
		  return result;
		}
	
	boolean doubleX(String str) {
		if (str.length() == 0 || str.length() == 1) {
			return false;
		}

		int index = str.indexOf("x");
		if (index == -1) {
			return false;
		}
		
		
		if (index == str.length() - 1) {
			return false;
		}

		if (str.charAt(index + 1) == str.charAt(index)) {
			return true;
		}

		return false;
	}
	
	public String stringBits(String str) {
		String result = "";

		int length = str.length();

		for (int i = 0; i < length; i++) {
			if (i % 2 == 0) {
				String index = Character.toString(str.charAt(i));
				result = result + index;

			}
		}

		return result;
	}

	
	public int last2(String str) {
		if (str.length() <= 2) {
			return 0;
		}

		String last = str.substring(str.length() - 2);
		int count = 0;
		for (int i = 0; i < str.length() - 2; i++) {
			String sub = str.substring(i, i + 2);
			if (last.equals(sub)) {
				count++;
			}
		}

		return count;
	}

}