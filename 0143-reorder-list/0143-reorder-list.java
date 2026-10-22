
class Solution {
    public void reorderList(ListNode head) {

        if (head == null || head.next == null) {
            return;
        }

        ListNode curr = head;

        while (curr != null && curr.next != null) {

            ListNode prev = null;
            ListNode next = curr.next;
            while (next.next != null) {
                prev = next;
                next = next.next;
            }
            if (prev == null) {
                break;
            }

            prev.next = null;
            next.next = curr.next;
            curr.next = next;
            curr = next.next;
        }
    }
}
