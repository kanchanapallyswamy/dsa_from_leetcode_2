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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if( head == null)return null;
        ListNode c = head;
        while(c.next != null){
            int a = c.val;
            int b = c.next.val;
            int get_gcd = find_gcd(a,b);
            ListNode nn = new ListNode(get_gcd);
            ListNode next = c.next;
            c.next = nn;
            nn.next = next;
            c = c.next.next;
        }
        return head;
    }
    int find_gcd(int a , int b){
        if(b == 0)return a;
        return find_gcd(b,a%b);
    }
}