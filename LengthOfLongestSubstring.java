// Longest Substring Without Repeating Characters
// Given a string s, find the length of the longest substring without duplicate characters.

import java.util.HashSet;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        int result = lengthOfLongestSubstring("pwwkew");
        System.out.println("LengthOfLongestSubstring : " + result);

    }

    static int lengthOfLongestSubstring(String s) {
        HashSet<Character> hset = new HashSet<>();
        int length = 0, maxLen = 0, j = 0;

        char[] chararr = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            if (hset.contains(chararr[i])) {
                length = hset.size();
                while (chararr[i] != chararr[j]) {
                    hset.add(chararr[j]);
                    j++;

                }
                maxLen = Math.min(length, maxLen);
                hset.remove(chararr[j]);
                j++;

            }

            hset.add(chararr[i]);
            length = hset.size();
            length = Math.max(length, maxLen);
        }

        return length;

    }
}
