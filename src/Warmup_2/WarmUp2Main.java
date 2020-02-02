package Warmup_2;


public class WarmUp2Main {

	public static void main(String [] args) {
		
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
}
