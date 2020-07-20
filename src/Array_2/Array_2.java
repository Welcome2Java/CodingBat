package Array_2;

public class Array_2 {
	
	//medium array solutions
	
	
	public int matchUp(int[] nums1, int[] nums2) {
		int count = 0;

		for(int i=0; i<nums1.length; i++){
			int value1 = nums1[i];
			int value2 = nums2[i];

			if(Math.abs(value1-value2)<=2 && value1 != value2){
				count++;
			}
		}
		return count;
	}
	
	public boolean either24(int[] nums) {
		boolean has2 = false;
		boolean has4 = false;

		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 2 && nums[i] == nums[i + 1]) {
				has2 = true;
			}
			if (nums[i] == 4 && nums[i] == nums[i + 1]) {
				has4 = true;
			}
		}

		if (has2 && has4) {
			return false;
		} else if (has2) {
			return true;
		} else if (has4) {
			return true;
		}

		return false;

	}

	public String[] fizzBuzz(int start, int end) {
		String[] result = new String[end-start];
		int index = 0;
		for(int i=start; i<end; i++){
			if(i%3==0 && i%5==0){
				result[index] = "FizzBuzz";
				index++;
			} else if(i%5==0){
				result[index] = "Buzz";
				index++;
			} else if(i%3==0){
				result[index] = "Fizz";
				index++;
			} else {
				result[index] = Integer.toString(i);
				index++;
			}
		}

		return result;
	}

	public int[] evenOdd(int[] nums) {
		int index = 0;
		int[] result = new int[nums.length];

		int i = 0;
		while (i < nums.length) {
			if (nums[i] % 2 == 0) {
				result[index] = nums[i];
				index++;
			}
			i++;
		}

		int n = 0;
		while (n < nums.length) {
			if (nums[n] % 2 != 0) {
				result[index] = nums[n];
				index++;
			}
			n++;
		}
		return result;
	}


	public int[] zeroFront(int[] nums) {
		  int[] result = new int[nums.length];
		  int count = 0;
		  
		  for(int i=0; i<nums.length; i++){
		    if(nums[i]==0){
		      result[i] = nums[i];
		      count++;
		    }
		  }
		  for(int n=0; n<nums.length; n++){
		    if(nums[n]!=0){
		      result[count] = nums[n];
		      count++;
		    }
		  }
		  
		  return result;
		}

	
	public int[] withoutTen(int[] nums) {

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 10) {
				nums[i] = 0;
			}
		}

		for (int n = 0; n < nums.length - 1; n++) {
			if (nums[n] != 0) {
				n++;
			} else if (nums[n] == 0) {
				if (nums[n + 1] != 0) {
					int temp1 = nums[n];
					int temp2 = nums[n + 1];

					nums[n] = temp2;
					nums[n + 1] = temp1;

					if (n != 0) {
						if (nums[n - 1] == 0) {
							int temp3 = nums[n];
							int temp4 = nums[n - 1];
							nums[n] = temp4;
							nums[n - 1] = temp3;
						}
					}
				}
			}
		}
		return nums;
	}

	public int[] post4(int[] nums) {
		int index = 0;
		int indexOfSecondFour = 0;

		for (int i = 0; i < nums.length; i++) {
			int value = nums[i];
			if (value == 4) {
				index = i;
				break;
			}
		}
		for (int n = index + 1; n < nums.length; n++) {
			if (nums[n] == 4) {
				indexOfSecondFour = n;
				break;
			}
		}

		if (indexOfSecondFour > 0) {
			int[] result = new int[nums.length - indexOfSecondFour - 1];
			int m = indexOfSecondFour;
			int array = 0;
			while (m < nums.length) {
				int numsValue = nums[m];
				if (numsValue != 4) {
					result[array] = numsValue;
					array++;
				}
				m++;
			}
			return result;

		} else {
			int[] result = new int[nums.length - index - 1];
			int p = index;
			int array = 0;
			while (p < nums.length) {
				int numsValue = nums[p];
				if (numsValue != 4) {
					result[array] = numsValue;
					array++;
				}
				p++;
			}
			return result;
		}
	}

	public int[] tenRun(int[] nums) {
		boolean isTen = false;
		int newValue = 0;

		for (int i = 0; i < nums.length; i++) {
			int value = nums[i];
			if (value % 10 == 0) {
				isTen = true;
				newValue = value;
			}
			if (isTen) {
				nums[i] = newValue;
			}
		}
		return nums;
	}

	public int[] pre4(int[] nums) {
		int index = 0;

		for (int i = 0; i < nums.length; i++) {
			int value = nums[i];
			if (value == 4) {
				index = i;
				break;
			}
		}

		int[] result = new int[index];
		int n = 0;
		while (n < index) {
			int numsValue = nums[n];
			result[n] = numsValue;
			n++;
		}

		return result;
	}

	public boolean modThree(int[] nums) {
		boolean match = false;

		for (int i = 0; i < nums.length - 2; i++) {
			if ((nums[i] % 2 == 0) && (nums[i + 1] % 2 == 0) && (nums[i + 2] % 2 == 0)) {
				match = true;
			}
			if ((nums[i] % 2 == 1) && (nums[i + 1] % 2 == 1) && (nums[i + 2] % 2 == 1)) {
				match = true;
			}
		}
		if (match) {
			return true;
		}
		return false;
	}

	public static boolean has12(int[] nums) {

		boolean has12Verdict = false;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				for (int n = i; n < nums.length; n++) {
					if (nums[n] == 2) {
						has12Verdict = true;

					}
				}
			}
		}
		if (has12Verdict) {
			return true;
		}
		return false;
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
		for (int i = 0; i < nums.length - 1; i++) {
			int value = nums[i];
			if (value == 2 && nums[i + 1] == 2) {
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
