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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        while(list1!=null && list2!=null){
            if(list1.val>list2.val){
                current.next = new ListNode(list2.val);
                current = current.next;
                list2=list2.next;
            }else if(list1.val<list2.val){
                current.next = new ListNode(list1.val);
                current = current.next;
                list1=list1.next;
            }else{
                current.next = new ListNode(list1.val);
                current = current.next;
                current.next = new ListNode(list2.val);
                current = current.next;
                list1=list1.next;
                list2=list2.next;
            }
        }
        if(list1!=null){
            while(list1!=null){
                current.next = new ListNode(list1.val);
                current = current.next;
                list1=list1.next;
            }
        }else{
            while(list2!=null){
                current.next = new ListNode(list2.val);
                current = current.next;
                list2=list2.next;
            }
        }
        return dummy.next;
    }
}