package Array_2;

public class Array_2 {
	
	//medium array solutions
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


}
