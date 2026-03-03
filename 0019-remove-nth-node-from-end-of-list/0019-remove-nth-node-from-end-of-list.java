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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || head.next==null) return null;
        int length=0;
        ListNode temp = head;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        int index = length - n + 1;
        if(index==1) return head.next;
        ListNode curr = head;
        ListNode prev = null;
        int count=1;
        while(count!=index){
            prev = curr;
            curr=curr.next;
            count++;
        }
        prev.next = curr.next;
        return head;
    }

}