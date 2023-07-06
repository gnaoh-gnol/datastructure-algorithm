package longhd.com.datastructure.nonlinear.hash_ds;

import java.util.HashMap;
import java.util.Map;

/**
 * Demo HashMap to count the characters in a string
 */
public class HashMapDS {

    public static HashMap<Character, Integer> countTheCharacterInStr(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') continue;
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }
        return map;
    }

    public static void displayMap(HashMap<Character, Integer> map) {
        for (Map.Entry<Character, Integer> item : map.entrySet()) {
            System.out.println("Count of character " + item.getKey() + ": " + item.getValue());
        }
    }

    public static void main(String[] args) {
        String s = "hello world";
        displayMap(countTheCharacterInStr(s));
    }
}
