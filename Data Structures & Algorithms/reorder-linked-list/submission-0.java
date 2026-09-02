/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        if(head==null || head.next==null){
            return;

        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode second=slow.next;
        slow.next=null;

        ListNode pre=null;
        while(second!=null){
            ListNode next=second.next;
            second.next=pre;
            pre=second;
            second=next;
        }
        second=pre;

        ListNode first=head;

        while(first!=null && second!=null){
            ListNode l1=first.next;
            ListNode l2=second.next;
            first.next=second;
            second.next=l1;

            first=l1;
            second=l2;
        }
    }
}
