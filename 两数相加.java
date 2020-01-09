
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
 
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode sumNode = result;
        int x = 0, y = 0;
        while (true) {
            int val1 =0,  val2 = 0;
            if (l1 != null) {
                val1 = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                val2 = l2.val;
                l2 = l2.next;
            }
            int sum = val1 + val2 + x;
            System.out.println(val1 + " " + val2 + " " + x + " " + sum);
            x = sum / 10;
            y = sum % 10;
            sumNode.val = y;
            if (l1 == null && l2 == null && x == 0) {
                break;
            }
            sumNode.next = new ListNode(0);
            sumNode = sumNode.next;
        }
        return result;
    }
}