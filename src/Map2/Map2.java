package Map2;

import java.util.HashMap;
import java.util.Map;

public class Map2 {

	public Map<String, Integer> word0(String[] strings) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < strings.length; i++) {
			String temp = strings[i];

			if (!map.containsKey(temp)) {
				map.put(temp, 0);
			}
		}
		return map;
	}

	public Map<String, Integer> wordLen(String[] strings) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < strings.length; i++) {
			String temp = strings[i];
			if (!map.containsKey(temp)) {
				map.put(temp, temp.length());
			}
		}
		return map;
	}

	public Map<String, String> pairs(String[] strings) {
		Map<String, String> map = new HashMap<String, String>();

		for (int i = 0; i < strings.length; i++) {
			String temp = strings[i];
			String first = Character.toString(temp.charAt(0));
			String last = Character.toString(temp.charAt(temp.length() - 1));

			if (!map.containsKey(first)) {
				map.put(first, last);
			} else if (map.containsKey(first) && !map.get(first).equals(last)) {
				map.put(first, last);
			}
		}
		return map;
	}

	public Map<String, Integer> wordCount(String[] strings) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < strings.length; i++) {
			String temp = strings[i];
			if (!map.containsKey(temp)) {
				map.put(temp, 1);
			} else {
				int count = map.get(temp);
				count++;
				map.put(temp, count);
			}
		}
		return map;
	}

	public Map<String, Boolean> wordMultiple(String[] strings) {
		Map<String, Boolean> map = new HashMap<String, Boolean>();

		for (int i = 0; i < strings.length; i++) {
			String temp = strings[i];
			if (!map.containsKey(temp)) {
				map.put(temp, false);
			} else {
				map.put(temp, true);
			}
		}
		return map;
	}

}
