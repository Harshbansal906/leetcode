class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {

        ListNode dummy = new ListNode(0);
        dummy.next = list1;

        ListNode prev = dummy;

        for(int i = 1; i <= a; i++){
            prev = prev.next;
        }

        ListNode curr = prev;

        for(int i = 0; i <= b-a+1; i++){
            curr = curr.next;
        }

        prev.next = list2;

        ListNode temp = list2;

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = curr;

        return dummy.next;
    }
}