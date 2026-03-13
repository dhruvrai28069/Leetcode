import java.util.*;

class Solution {
    public int countVowelSubstrings(String word) {
        return countAtMost(word, 5) - countAtMost(word, 4);
    }

    private int countAtMost(String word, int k) {
        int n = word.length();
        int count = 0;
        int left = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < n; right++) {
            char c = word.charAt(right);

            if (!isVowel(c)) {
                map.clear();
                left = right + 1;
                continue;
            }
            map.put(c, map.getOrDefault(c, 0) + 1);

            while (map.size() > k) {
                char leftChar = word.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                left++;
            }

            count += (right - left + 1);
        }
        return count;
    }

    private boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }
}