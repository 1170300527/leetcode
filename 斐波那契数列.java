import java.util.HashMap;
import java.util.Map;

class Solution {
    public int fib(int n) {
        return fib(n, new HashMap<Integer, Integer>());
    }
    public int fib(int n, Map<Integer, Integer> map) {
        if(n < 2) {
            return n;
        }
        if (map.get(n) != null) {
            return map.get(n);
        } else {
            int result = (fib(n-1, map) + fib(n-2, map)) % 1000000007;
            map.put(n, result);
            return result;
        }
    }
}