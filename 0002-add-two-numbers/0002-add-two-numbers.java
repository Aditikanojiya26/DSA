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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = l1.val + l2.val;
        boolean flag = sum >= 10 ? true : false ;
        ListNode head = new ListNode(sum%10);
        ListNode temp = head;
        ListNode temp1 = l1.next;
        ListNode temp2 = l2.next;
        while(temp1!=null && temp2!=null){
            sum = temp1.val + temp2.val;
            int ans = ((sum) + (flag ? 1 : 0))%10;
            temp.next = new ListNode(ans);
            temp = temp.next;
            flag = (sum) + (flag ? 1 : 0) >= 10 ? true : false;  
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        if(temp1!=null){
        while(temp1!=null){
            sum = temp1.val;
            int ans =( (sum) + (flag ? 1 : 0))%10;
            temp.next = new ListNode(ans);
            temp = temp.next;
            flag = (sum) + (flag ? 1 : 0) >= 10 ? true : false;  
            temp1 = temp1.next;
        }
        }
        else{
        while(temp2!=null){
            sum = temp2.val;
            int ans = ( (sum) + (flag ? 1 : 0))%10;
            temp.next = new ListNode(ans);
            temp = temp.next;
            flag =(sum) + (flag ? 1 : 0) >= 10 ? true : false; 
            temp2 = temp2.next;
        }
        

        }
        if(flag==true){
             temp.next = new ListNode(1);
        }
        return head;
    }
}