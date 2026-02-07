class Solution {
    public ListNode getNode(int index, ListNode head) {
        int i = 1;
        ListNode temp = head;

        while (i < index && temp != null) {
            temp = temp.next;
            i++;
        }
        return temp;
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        while (right > left) {
            ListNode rightmost = getNode(right, head);
            ListNode leftmost = getNode(left, head);

            int temp = rightmost.val;
            rightmost.val = leftmost.val;
            leftmost.val = temp;

            right--;
            left++;
        }
        return head;
    }
}
