class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        ListNode temp = head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        int t = len-n;
        if(t==0){
            return head.next;
        }
        temp =head;
        for(int i=0;i<t-1;i++){
            temp=temp.next;
        }
        if(temp!=null && temp.next!=null){
        temp.next=temp.next.next;
        }
        return head;
    }
}