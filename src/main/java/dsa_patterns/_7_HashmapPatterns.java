package dsa_patterns;

import java.util.HashMap;

public class _7_HashmapPatterns {


    /**
     * <h2>First Unique Character in a String</h2>
     * <p>
     * Given a string s, find the first non-repeating character in it and return its index.
     * If it does not exist, return -1.
     * <br>
     * Example 1:
     * Input: s = "leetcode"
     * Output: 0
     * <br>
     * Explanation:
     * The character 'l' at index 0 is the first character that does not occur at any other index.
     * <br>
     * Example 2:
     * Input: s = "aabb"
     * Output: -1
     * </p>
     */
    public static int firstUniqueChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            //not unique
            if (map.get(ch) == 1) {
                return i;
            }
        }

        return -1;
    }

    /**
     *
     */
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> have = new HashMap<>();
        HashMap<Character, Integer> need = new HashMap<>();

        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);

            need.put(ch, need.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < magazine.length(); i++) {
            char ch = magazine.charAt(i);

            have.put(ch, have.getOrDefault(ch, 0) + 1);
        }

        return isValidConstruct(have, need);
    }

    private static boolean isValidConstruct(
            HashMap<Character, Integer> have,
            HashMap<Character, Integer> need
    ) {

        for (Character ch : need.keySet()) {
            int freqNeed = need.get(ch);
            int freqHave = have.getOrDefault(ch, 0);

            if (freqHave < freqNeed) {
                return false;
            }

        }

        return true;
    }

    /**
     * Maximum Number of Balloons
     */
    public static int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> have = new HashMap<>();

        HashMap<Character, Integer> need = new HashMap<>();
        need.put('b', 1);
        need.put('a', 1);
        need.put('l', 2);
        need.put('o', 2);
        need.put('n', 1);

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            have.put(ch, have.getOrDefault(ch, 0) + 1);
        }

        return isValidBalloon(have, need);
    }

    private static int isValidBalloon(
            HashMap<Character, Integer> have,
            HashMap<Character, Integer> need
    ) {
        int result = Integer.MAX_VALUE;

        for (Character ch : need.keySet()) {
            int freqNeed = need.get(ch);
            int freqHave = have.getOrDefault(ch, 0);

            int howManyEach =  freqHave / freqNeed;
            result =  Math.min(result, howManyEach);
        }

        return result;
    }
}
