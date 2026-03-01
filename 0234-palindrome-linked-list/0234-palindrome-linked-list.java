class Solution {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode slow = head;
        ListNode fast = head;

        // Step 1: Store first half
        while(fast != null && fast.next != null){
            arr.add(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Skip middle if odd length
        if(fast != null){
            slow = slow.next;
        }

        // Step 3: Compare second half
        for(int i = arr.size()-1; i >= 0; i--){
            if(slow.val != arr.get(i)){
                return false;
            }
            slow = slow.next;  
        }

        return true;
    }
}