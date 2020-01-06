package Array_1;

public class Array_1MainImpl {
	
	public static boolean firstLast6(int[] nums) {
		for(int i=0; i<nums.length; i++) {
			int value = nums[i];
			if(i == 0 || i == nums.length-1) {
				if(value == 6) {
					return true;
				}
			}
		}
		 return false; 
	}

	public static boolean sameFirstLast(int[] nums) {
		if(nums.length < 1) {
			return false;
		}
		if(nums[0] == nums[nums.length-1] && nums.length>=1) {
			return true;
		}
		 return false; 
	}

	public static int[] makePi() {
		int [] value = {3,1,4};
		return value;
	}

	public static boolean commonEnd(int[] a, int[] b) {
		if(a[0]==b[0]) {
			return true;
		}
		else if(a[a.length-1]==b[b.length-1]) {
			return true;
		}
		return false;
	}

	public static int sum3(int[] nums) {
		int result=0;
		for(int i =0; i<nums.length ; i++) {
			int value = nums[i];
			result = value + result;
		}
		  return result;
	}

	public static int sum2(int[] nums) {
		int sum = 0;
		if (nums.length == 0) {
			return 0;
		}

		if (nums.length <= 2) {
			for (int i = 0; i < nums.length; i++) {
				int value = nums[i];
				sum = value + sum;
			}
			return sum;
		}
		for (int i = 0; i < 2; i++) {
			int value = nums[i];
			sum = value + sum;

		}
		return sum;
	}

	public static boolean has23(int[] nums) {
		return nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3;
	}
	
	public static int[] rotateLeft3(int[] nums) {
		  int first=nums[0];
		  int second=nums[1];
		  int third = nums[2];
		  
		  nums[2] = first;
		  nums[0] = third;
		  
		  nums[1] = nums[0];
		  nums[0] = second;
		  
		  return nums;
		}

	public static int[] reverse3(int[] nums) {
		  int first = nums[0]; 
		  int third = nums[2];
		  
		  nums[0] = third;
		  nums[2] = first;
		  
		  return nums;
		}

	
	public static int[] maxEnd3(int[] nums) {
		int first = nums[0];
		int third = nums[2];

		int max = 0;
		if (first > third) {
			max = first;
		} else {
			max = third;
		}
		nums[0] = max;
		nums[1] = max;
		nums[2] = max;
		return nums;
	}
	
	public static int[] middleWay(int[] a, int[] b) {
		int middleOne = a[1];
		int middleTwo = b[1];

		int[] result; // declaring array
		result = new int[2]; // allocating memory to array

		result[0] = middleOne;
		result[1] = middleTwo;

		return result;
	}
	
	public static int[] makeEnds(int[] nums) {
		int length = nums.length;
		int first = nums[0];
		int last = nums[length - 1];

		int[] result = new int[2];
		result[0] = first;
		result[1] = last;

		return result;
	}

	public static boolean no23(int[] nums) {
		  return !(nums[0]==2 || nums[0]==3 || nums[1]==3 || nums[1]==2);
		}
	
	public static int[] makeLast(int[] nums) {
		  int size = nums.length;
		  int lastNumber = nums[size-1];
		  
		  int [] result;
		  result = new int[size*2];
		  
		  result[result.length-1]= lastNumber;
		  return result;
		}

	public static boolean double23(int[] nums) {
		  if(nums.length ==0 || nums.length ==1){
		    return false;
		  }
		  if(nums[0] ==2 && nums[1] ==2){
		    return true;
		  } 
		  if((nums[0] ==3 && nums[1] ==3)){
		    return true;
		  }
		  return false;
		}
	
	public static int[] fix23(int[] nums) {
		if (nums[0] == 2 && nums[1] == 3) {
			nums[1] = 0;
		}

		if (nums[1] == 2 && nums[2] == 3) {
			nums[2] = 0;
		}

		return nums;
	}

	public int start1(int[] a, int[] b) {
		int count = 0;
		if (a.length == 0 && b.length == 0) {
			return count;
		}
		if (a.length == 0 && b.length > 0) {
			if (b[0] == 1) {
				count++;
			}
		}
		if (a.length > 0 && b.length == 0) {

			if (a[0] == 1) {
				count++;
			}
		}

		if (a.length > 0 && b.length > 0) {

			if (a[0] == 1) {
				count++;
			}
			if (b[0] == 1) {
				count++;
			}
		}
		return count;
	}

	public static int[] biggerTwo(int[] a, int[] b) {
		  int sumA = 0;
		  int sumB = 0;
		  
		  sumA = a[0]+a[1];
		  sumB = b[0]+b[1];
		  
		  if((sumA > sumB) || (sumA == sumB)){
		    return a;
		  }
		  return b;
		  
		}

	public static int[] makeMiddle(int[] nums) {
		int[] result;
		result = new int[2];

		int size = nums.length;
		int half = size / 2;
		result[0] = nums[half - 1];
		result[1] = nums[half];
		return result;
	}
	
	public static int[] plusTwo(int[] a, int[] b) {
		int[] result;
		result = new int[4];

		result[0] = a[0];
		result[1] = a[1];
		result[2] = b[0];
		result[3] = b[1];

		return result;
	}
	
	//need calls
	public static int[] swapEnds(int[] nums) {
		if (nums.length <= 1) {
			return nums;
		}
		int first = nums[0];
		int last = nums[nums.length - 1];
		nums[0] = last;
		nums[nums.length - 1] = first;

		return nums;
	}
	
	public static int[] midThree(int[] nums) {
		if (nums.length <= 3) {
			return nums;
		}
		int[] result = new int[3];
		result[0] = nums[nums.length / 2 - 1];
		result[1] = nums[nums.length / 2];
		result[2] = nums[nums.length / 2 + 1];

		return result;

	}
	//already called. 
	public static int maxTriple(int[] nums) {
		  if(nums.length ==1 ){
		    return nums[0];
		  }
		  
		  int max = nums[0];
		  int middle = nums[nums.length/2];
		  int last = nums[nums.length-1];
		  
		  if(max < middle){
		    max = middle;
		  }
		  if(max < last){
		    max = last;
		  }
		  return max;
		}

	public static int[] frontPiece(int[] nums) {
		  if(nums.length<=2){
		    return nums;
		  }
		  int[] result = new int[2];
		  result[0]= nums[0];
		  result[1]= nums[1];
		  
		  return result;
		}

	

}
