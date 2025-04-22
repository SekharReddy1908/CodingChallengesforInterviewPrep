// Longest Substring Without Repeating Characters
// Given a string s, find the length of the longest substring without duplicate characters.

import java.util.HashSet;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        int result = lengthOfLongestSubstring("pwwkew");
        System.out.println("LengthOfLongestSubstring : " + result);

    }

    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> hset = new HashSet<>();
        int maxLen = 0;
        int j = 0;

        for (int i = 0; i < s.length(); i++) {
            while (hset.contains(s.charAt(i))) {
                hset.remove(s.charAt(j));
                j++;
            }
            hset.add(s.charAt(i));
            maxLen = Math.max(maxLen, i - j + 1);
        }

        return maxLen;
    }
}
