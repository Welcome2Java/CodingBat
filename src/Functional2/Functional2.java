package Functional2;

import java.util.List;
import java.util.stream.Collectors;

public class Functional2 {

	public List<Integer> noNeg(List<Integer> nums) {
		nums.removeIf(n -> n < 0);
		return nums;
	}

	public List<Integer> no9(List<Integer> nums) {
		nums.removeIf(n -> n % 10 == 9);
		return nums;
	}

	public List<Integer> noTeen(List<Integer> nums) {
		nums.removeIf(n -> (n <= 19 && n >= 13));
		return nums;
	}

	public List<String> noZ(List<String> strings) {
		strings.removeIf(str -> str.contains("z"));
		return strings;
	}

	public List<String> noLong(List<String> strings) {
		strings.removeIf(str -> str.length() > 3);
		return strings;
	}

	public List<String> no34(List<String> strings) {
		strings.removeIf(str -> (str.length() == 3 || str.length() == 4));
		return strings;
	}
	
	public List<String> noYY(List<String> strings) {
		strings = (List<String>) strings.stream().map(str -> (str.concat("y"))).filter(str -> !str.contains("yy"))
				.collect(Collectors.toList());
		return strings;
	}
	
	public List<Integer> two2(List<Integer> nums) {
		nums = nums.stream().map(n -> n * 2).filter(n -> n % 10 != 2).collect(Collectors.toList());
		return nums;
	}





}
