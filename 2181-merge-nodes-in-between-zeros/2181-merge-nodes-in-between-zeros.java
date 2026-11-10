class Solution {
    public ListNode mergeNodes(ListNode head) {

        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        int sum = 0;
        ListNode curr = head.next;

        while(curr != null) {

            if(curr.val != 0) {
                sum += curr.val;
            }
            else {
                temp.next = new ListNode(sum);
                temp = temp.next;
                sum = 0;
            }

            curr = curr.next;
        }

        return dummy.next;
    }
}