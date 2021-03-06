package Warmup_2;


public class WarmUp2Main {

	public static void main(String[]args) {
		String result = altPairs("Chocolate");
		System.out.println(result);
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
	
	public int arrayCount9(int[] nums) {
		int size = nums.length;
		int count = 0;

		for (int i = 0; i < size; i++) {
			int value = nums[i];
			if (value == 9) {
				count++;
			}
		}

		return count;
	}
	
	public boolean arrayFront9(int[] nums) {
		int size = nums.length;

		for (int i = 0; i < size; i++) {
			int value = nums[i];
			if (value == 9) {
				if (i > 3) {
					return false;
				}
				return true;
			}
		}
		return false;
	}

	public boolean array123(int[] nums) {
		int size = nums.length;
		if (size > 2) {
			for (int i = 0; i < size - 2; i++) {
				int value = nums[i];
				if (value == 1) {
					int second = nums[i + 1];
					int third = nums[i + 2];
					if (second == 2 && third == 3) {
						return true;
					}
				}
			}
		}

		return false;
	}

	public String stringYak(String str) {
		if (str.contains("yak")) {
			str = str.replaceAll("yak", "");
		}
		return str;
	}
	
	public boolean has271(int[] nums) {

		  for (int i=0; i < (nums.length-2); i++) {
		    int val = nums[i];
		    if (nums[i+1] == (val+5) &&              
		      Math.abs(nums[i+2] - (val-1)) <= 2) {  
		        return true;
		    }
		  }
		  return false;
	}
	
	int countXX(String str) {
		String match = "xx";
		int count = 0;
		for(int i=0; i<str.length()-1; i++) {
			String sub = str.substring(i,i+2);
			if(sub.equals(match)) {
				count++;
			}
		}
		
		return count;
	}

	public int stringMatch(String a, String b) {
		int count = 0;
		if (a.length() == 0 || b.length() == 0) {
			return 0;
		}
		int len = Math.min(a.length(), b.length());
		for (int i = 0; i < len - 1; i++) {
			String aSub = a.substring(i, i + 2);
			String bSub = b.substring(i, i + 2);
			if (aSub.equals(bSub)) { // Use .equals() with strings
				count++;
			}
		}

		return count;
	}
	
	public String stringX(String str) {

		if (str.length() == 0) {
			return str;
		}
		if (str.length() == 1) {
			if (str.contentEquals("x")) {
				return str;
			}
		}

		if (str.charAt(0) == 'x') {
			if (str.charAt(str.length() - 1) == 'x') {
				return "x" + str.replaceAll("x", "") + "x";
			} else {
				return "x" + str.replaceAll("x", "");
			}
		} else if (str.charAt(0) != 'x' && str.charAt(str.length() - 1) != 'x') {
			return str.replaceAll("x", "");
		}

		return str;

	}
	
	public static String altPairs(String str) {
		String result = "";
		String second = "";
		String combine = "";
		int length = str.length();
		
		if (str.length() <= 2) {
			return str;
		}
		
		int i = 0;
		while (i <= length - 1) {
			String first = Character.toString(str.charAt(i));
			if (length - i != 1) {
				second = Character.toString(str.charAt(i + 1));
				combine = first + second;
			} else {
				combine = first;
			}

			result = result + combine;
			i = i + 4;
		}

		return result;
	}
	
	public int array667(int[] nums) {
		int count = 0;

		if (nums.length <= 1) {
			return 0;
		} else {
			for (int i = 0; i < nums.length - 1; i++) {
				int valueOne = nums[i];
				int valueTwo = nums[i + 1];

				if (valueOne == 6) {
					if (valueOne == valueTwo) {
						count++;
					} else if (valueTwo == 7) {
						count++;
					}
				}
			}
		}

		return count;
	}
	
	public boolean noTriples(int[] nums) {
		  int length = nums.length;
		  
		  for(int i=0; i<length-2; i++){
		    int value1 = nums[i];
		    int value2 = nums[i+1];
		    int value3 = nums[i+2];
		    if(value1 == value2 && value2 == value3){
		      return false;
		    }    
		    
		  }
		  return true;
		}


}