/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
class Solution141 {
    public boolean hasCycle(Solution19.ListNode head) {

        Solution19.ListNode runner_1 = head;
        Solution19.ListNode runner_2 = head;

        if (head == null) {
            return false;
        }
        if (head.next == null) {
            return false;
        }

        while (runner_2.next != null && runner_2.next.next != null) {
            runner_1 = runner_1.next;
            runner_2 = runner_2.next.next;

            if (runner_1 == runner_2) {
                return true;
            }
        }
        return false;
    }
}