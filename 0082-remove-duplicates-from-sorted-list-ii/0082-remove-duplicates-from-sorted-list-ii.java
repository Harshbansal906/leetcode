class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode temp = head;
        ListNode prev = null;

        while (temp != null) {

            if (temp.next != null &&
                temp.val == temp.next.val) {

                while (temp.next != null &&
                       temp.val == temp.next.val) {
                    temp = temp.next;
                }

                if (prev == null) {
                    head = temp.next;
                } else {
                    prev.next = temp.next;
                }

            } else {
                prev = temp;
            }

            temp = temp.next;
        }

        return head;
    }
}