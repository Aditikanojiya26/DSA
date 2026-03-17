/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
       

        // handle head separately (like you suggested)
        while (head != null && head.val == val) {
            head = head.next;
        }

        ListNode prev = head;
        ListNode curr = head;

        while (curr != null) {
            if (curr.val == val) {
                prev.next = curr.next; // remove
            } else {
                prev = curr; // move prev only when kept
            }
            curr = curr.next;
        }

        return head;
    }

}