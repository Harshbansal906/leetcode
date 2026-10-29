class Solution {
    public int[] nextLargerNodes(ListNode head) {
        int n = 0;
        ListNode temp = head;

        while (temp != null) {
            n++;
            temp = temp.next;
        }

        int[] ans = new int[n];

        ListNode curr = head;
        int i = 0;

        while (curr != null) {
            ListNode next = curr.next;

            while (next != null && next.val <= curr.val) {
                next = next.next;
            }

            if (next != null) {
                ans[i] = next.val;
            }

            curr = curr.next;
            i++;
        }

        return ans;
    }
}