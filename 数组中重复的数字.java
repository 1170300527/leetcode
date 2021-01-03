import java.util.HashSet;
import java.util.Set;

class Solution {
    // public int findRepeatNumber(int[] nums) {
    //     Set<Integer> differentNumber = new HashSet<>();
    //     for (int i = 0; i < nums.length; i++) {
    //         if (!differentNumber.contains(nums[i])) {
    //             differentNumber.add(nums[i]);
    //         } else {
    //             return nums[i];
    //         }
    //     }
    //     return 0;
    // }
    public int findRepeatNumber(int[] nums) {
        int[] result = new int[nums.length];
        for (int i : nums) {
            if (result[i] == 0) {
                result[i] = 1;
            } else {
                return i;
            }
        }
        return 0;
    }
}