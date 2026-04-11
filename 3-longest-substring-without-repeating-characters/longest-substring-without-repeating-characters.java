import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {

        // stores character → last seen index
        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            // if duplicate found, jump left pointer
            if (map.containsKey(ch)) {
                // take max to avoid moving left backwards
                left = Math.max(left, map.get(ch) + 1);
            }

            // update latest index of character
            map.put(ch, right);

            // calculate window size
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}