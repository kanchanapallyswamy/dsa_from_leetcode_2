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
    public int pairSum(ListNode head) {
        int idx = 0 , max = 0;
        List<Pair> l = new ArrayList<>();
        int size=0;
        while(head!=null){
            l.add(new Pair(idx++,head.val));
            head=head.next;
            size++;
        }
        for(int i = 0;i<=(size/2)-1;i++){
            max = Math.max(max,(l.get(i).y+l.get(size-i-1).y));
        }
        return max;
    }
}
class Pair{
    int x,y;
    Pair(int x,int y){
        this.x=x;
        this.y=y;
    }
}