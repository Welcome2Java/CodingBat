package Array_2;

public class Array_2 {
	
	//medium array solutions
	
	public static void main(String [] args) {


	}
	
	public boolean no14(int[] nums) {
		boolean hasOne = false;
		boolean hasFour = false;

		for (int i = 0; i < nums.length; i++) {
			int value = nums[i];
			if (value == 1) {
				hasOne = true;
			}
			if (value == 4) {
				hasFour = true;
			}
		}
		if (hasOne && hasFour) {
			return false;
		}
		return true;
	}

	public int[] fizzArray(int n) {
		int[] result = new int[n];

		for (int i = 0; i < n; i++) {
			result[i] = n - (n - i);
		}

		return result;
	}
	
	public String[] fizzArray2(int n) {
		String[] result = new String[n];

		for (int i = 0; i < n; i++) {
			result[i] = Integer.toString(n - (n - i));
		}

		return result;
	}

	
	public boolean only14(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int value = nums[i];
			if (value != 4 && value != 1) {
				return false;
			}
		}
		return true;
	}


	public boolean has77(int[] nums) {
		boolean verdict = false;
		for (int i = 0; i < nums.length - 1; i++) {
			int value = nums[i];
			if (value == 7) {
				if (nums[i + 1] == 7) {
					return true;
				}

			}
			if (i <= nums.length - 3 && nums[i] == 7 && nums[i + 2] == 7)
				return true;
		}
		return verdict;
	}
			
	

	public boolean more14(int[] nums) {
		int numberOfFour = 0;
		int numberOfOne = 0;
		for (int i = 0; i < nums.length; i++) {
			int value = nums[i];
			if (value == 1) {
				numberOfOne++;
			} else if (value == 4) {
				numberOfFour++;
			}
		}
		if (numberOfFour < numberOfOne) {
			return true;
		}
		return false;
	}

	
	public boolean sum28(int[] nums) {
		boolean verdict = false;
		int sum = 0;

		for (int i = 0; i < nums.length; i++) {
			int value = nums[i];
			if (value == 2) {
				sum += value;
			}
		}

		if (sum == 8) {
			verdict = true;
		}
		return verdict;
	}
	
	public boolean lucky13(int[] nums) {
		boolean verdict = true;
		boolean one = true;
		boolean three = true;
		for (int i = 0; i < nums.length; i++) {
			int value = nums[i];
			if (value == 1) {
				one = false;
			}
			if (value == 3) {
				three = false;
			}

		}
		if (!one || !three) {
			verdict = false;
		}
		return verdict;
	}

	public boolean has22(int[] nums) {
		 boolean verdict = false;
		 for(int i = 0; i<nums.length-1; i++) {
			 int value = nums[i];
			 if(value == 2 && nums[i+1]==2) {
				 verdict = true;
				 break;
			 }
		 }
		 return verdict;
	}

	public int sum67(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}

		int sumOfAll = 0;
		for (int i = 0; i < nums.length; i++) {
			int value = nums[i];
			sumOfAll += value;
		}

		int inBetween = 0;
		boolean check = false;
		for (int n = 0; n < nums.length; n++) {
			int sixOrSeven = nums[n];
			if (sixOrSeven == 6) {
				check = true;
			}

			if (check) {
				inBetween += sixOrSeven;
				if (sixOrSeven == 7) {
					check = false;
				}
			} else if (sixOrSeven == 7) {

			}
		}

		return sumOfAll - inBetween;
	}
	

	public int countEvens(int[] nums) {
		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			int value = nums[i];
			if (value % 2 == 0) {
				count++;
			}
		}
		return count;
	}

	public int sum13(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}

		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			int value = nums[i];
			if (value != 13) {
				sum += value;
			} else {
				i++;
			}
		}

		return sum;
	}
	
	public int bigDiff(int[] nums) {

		if (nums.length == 1) {
			return 0;
		}

		int max = Math.max(nums[0], nums[1]);
		int min = Math.min(nums[0], nums[1]);

		for (int i = 0; i < nums.length; i++) {
			int valueOne = nums[i];
			if (valueOne < min) {
				min = valueOne;
			}
			if (valueOne > max) {
				max = valueOne;
			}
		}
		int result = max - min;

		return result;
	}

	public int centeredAverage(int[] nums) {
		int max = Math.max(nums[0], nums[1]);
		int min = Math.min(nums[0], nums[1]);

		for (int i = 0; i < nums.length; i++) {
			int valueOne = nums[i];
			if (valueOne < min) {
				min = valueOne;
			}
			if (valueOne > max) {
				max = valueOne;
			}
		}

		int count = 0;
		int sum = 0;
		for (int n = 0; n < nums.length; n++) {
			int valueTwo = nums[n];

			count++;
			sum += valueTwo;

		}

		int result = Math.round((sum - min - max) / (count - 2));
		return result;
	}

	public boolean tripleUp(int[] nums) {

		for (int i = 0; i < nums.length - 2; i++) {
			int value = nums[i];

			if (nums[i + 1] - value == 1 && nums[i + 2] - value == 2) {
				return true;
			}
		}
		return false;
	}

}
