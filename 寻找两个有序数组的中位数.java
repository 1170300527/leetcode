class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            int[] tmp = nums1;
            nums1 = nums2;
            nums2 = tmp;
        }
        int m = nums1.length;
        int n = nums2.length;
        int iMin = 0, iMax = m, halfLen = (m + n + 1) / 2;
        while (iMin <= iMax) {
            int i = (iMin + iMax) / 2;
            int j = halfLen - i;
            if (i < iMax && nums2[j - 1] > nums1[i]) {
                iMin = i + 1;
            } else if (i > iMin && nums1[i - 1] > nums2[j]) {
                iMax = i - 1;
            } else {
                double maxLeft = 0;
                if (i == 0) {
                    maxLeft = nums2[j-1];
                } else if (j == 0) {
                    maxLeft = nums1[i-1];
                } else {
                    maxLeft = Math.max(nums2[j-1], nums1[i-1]);
                }
                if ((m+n) % 2  == 1) {
                    return maxLeft;
                }

                double maxRight = 0;
                if (i == m) {
                    maxRight = nums2[j];
                } else if (j == n) {
                    maxRight = nums1[i];
                } else {
                    maxRight = Math.min(nums2[j], nums1[i]);
                }
                return (maxLeft + maxRight)  / 2;
            }
        }
        return 0.0;
    }
}