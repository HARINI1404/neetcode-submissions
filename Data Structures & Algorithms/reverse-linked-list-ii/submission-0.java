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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode temp=new ListNode(0);
        temp.next=head;

        ListNode pre=temp;

        for(int i=1;i<left;i++){
            pre=pre.next;
        }

        ListNode curr=pre.next;

        for(int i=0;i<right-left;i++){
            ListNode nextnode=curr.next;
            curr.next=nextnode.next;
            nextnode.next=pre.next;
            pre.next=nextnode;
        }
        return temp.next;
    }
}