class Solution {
    public int numWays(int n) {
        return numWays(n, new HashMap<Integer, Integer>());
    }
    public int numWays(int n, Map<Integer, Integer> map) {
        if(n < 2) {
            return 1; 
        }
        if (map.get(n) != null) {
            return map.get(n);
        } else {
            int result = (numWays(n-1, map) + numWays(n-2, map)) % 1000000007;
            map.put(n, result);
            return result;
        }
    }
}