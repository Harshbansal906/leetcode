class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        if(head == null || head.next == null || k == 0) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode temp = head;

        int n = 0;

        // Find length and last node
        while(temp != null) {
            n++;
            temp = temp.next;
        }

        k = k % n;

        if(k == 0) return head;

        // Find new tail
        temp = head;

        for(int i = 0; i < n-k-1; i++) {
            temp = temp.next;
        }

        // Pointer manipulation
        ListNode next = temp.next;

        ListNode last = next;

        while(last.next != null) {
            last = last.next;
        }

        last.next = head;
        temp.next = null;

        return next;
    }
}