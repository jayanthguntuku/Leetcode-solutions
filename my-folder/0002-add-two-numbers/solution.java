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
        ListNode l3 = new ListNode();
        ListNode head = l3;
        ListNode prev = null;
        int sum;
        int flag = 0;        
        while(l1 != null || l2 != null || flag != 0){
            int d1 = (l1 != null) ? l1.val : 0;
            int d2 = (l2 != null )? l2.val : 0;
            sum = d1 + d2 + flag;
            flag = sum/10;
            prev = head;
            head.val = sum%10;
            if (l1 != null || l2 != null || flag != 0) {
                head.next = new ListNode();
                head = head.next;
            }

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }
    prev.next = null;
    return l3;
    }   
}

