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
        int gcdRes;
        ListNode iterator = head;
        ListNode temp= null;
        while(iterator != null && iterator.next != null){
            gcdRes = gcd(iterator.val, iterator.next.val);
            ListNode node = new ListNode(gcdRes);
            //node.val = gcdRes;
            temp = iterator.next;
            node.next = iterator.next;
            iterator.next = node;
            iterator = temp;
        }
    return head;
    }
    public int gcd(int a, int b){
        if(b == 0){
            return a;
        }else{
            return gcd(b,a%b);
        }
    }
}
