package longhd.com.datastructure.nonlinear.hash_ds;

import java.util.HashSet;

/**
 * Demo of HashSEt to find string has unique characters.
 */
public class HashSetDS {

    public static  boolean isUnique(String s) {
        HashSet<Character> hashSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') continue;
            if (!hashSet.add(c)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "hello world";
        System.out.println("String: " + s);
        if(isUnique(s))
            System.out.println("String has unique characters.");
        else
            System.out.println("String does not have unique characters.");
    }
}
