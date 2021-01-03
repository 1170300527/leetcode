import jdk.internal.jshell.tool.resources.l10n;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int[] reversePrint(ListNode head) {
        int size = 0;
        int[] nums = new int[10000];
        while (head != null) {
            nums[size++] = head.val;
            head = head.next;
        }
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = nums[size-i-1];
        }
        return result;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}