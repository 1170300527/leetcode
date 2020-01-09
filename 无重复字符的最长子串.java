import java.util.HashMap;
import java.util.Map;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        Map <Character, Integer> map = new HashMap<>();
        for (int j = 0, i = 0; j < s.length(); j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)) + 1, i); //在i前面可能有重复的
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j);
        }
        return ans;
    }
}