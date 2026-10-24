
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode smallDummy = new ListNode(0);
        ListNode bigDummy = new ListNode(0);

        ListNode small = smallDummy;
        ListNode big = bigDummy;

        ListNode temp = head;

        while (temp != null) {
            if (temp.val < x) {
                small.next = temp;
                small = small.next;
            } else {
                big.next = temp;
                big = big.next;
            }

            temp = temp.next;
        }

        big.next = null;
        small.next = bigDummy.next;

        return smallDummy.next;
    }
}
