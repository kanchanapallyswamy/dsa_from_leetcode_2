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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null)return l2;
        if(l2==null)return l1;
        l1=reverse(l1);
        l2=reverse(l2);
        int c=0;
        if(l1==null)return l2;
        if(l2==null)return l1;
        ListNode head=new ListNode(-2);
        ListNode temp=head;
        while(l1!=null && l2!=null){
            int a=l1.val;
            int b=l2.val;
            int s=a+b+c;
            ListNode nn=new ListNode(s%10);
            c=s/10;
            temp.next=nn;
            temp=temp.next;
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null){
            int s=l1.val+c;
            temp.next=new ListNode(s%10);
            c=s/10;
            temp=temp.next;
            l1=l1.next;
        }
        while(l2!=null){
            int s=l2.val+c;
            temp.next=new ListNode(s%10);
            c=s/10;
            temp=temp.next;
            l2=l2.next;
        }
        if(c!=0)temp.next=new ListNode(c);
        head=reverse(head.next);
        return head;

    }
    ListNode reverse(ListNode head){
        ListNode c=head,prev=null,next=null;
        while(c!=null){
            next=c.next;
            c.next=prev;
            prev=c;
            c=next;
        }
        return prev;
    }
}


        