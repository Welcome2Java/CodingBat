package src.Map1;

import java.util.HashMap;
import java.util.Map;

public class Map1 {
    public static void main(String[] args){

    }

    public Map<String, String> topping2(Map<String, String> map) {
        if(map.containsKey("ice cream")){
            map.put("yogurt", map.get("ice cream"));
        }
        if(map.containsKey("spinach") && map.get("spinach") != null){
            map.put("spinach", "nuts");
        }
        return map;
    }

    public Map<String, String> topping1(Map<String, String> map) {
        map.put("bread", "butter");
        if(map.containsKey("ice cream")){
            map.put("ice cream", "cherry");
        }
        return map;
    }

    public Map<String, String> mapShare(Map<String, String> map) {
        if(map.containsKey("a")){
            map.put("b", map.get("a"));
        }
        map.remove("c");
        return map;
    }

    public Map<String, String> mapAB(Map<String, String> map) {
        if(map.containsKey("a") &&  map.containsKey("b")){
            map.put("ab", map.get("a")+map.get("b"));
        }
        return map;
    }

    public Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");
        } else {
            return map;
        }
        return map;
    }
}