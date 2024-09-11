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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode l3 =  new ListNode();
        if(list1 == null && list2 == null){
            return null;
        }
        ListNode curr = l3;
        ListNode prev = null;
        
        while(list1 != null || list2 != null){
            int d1 = (list1 != null)? list1.val :101; 
            int d2 = (list2 != null)? list2.val :101;

            if(d1 <= d2){
                prev = curr;
                curr.val = d1;
                curr.next = new ListNode();
                curr = curr.next;

                list1 = (list1 != null)? list1.next :null;
            }
            else{
                prev = curr;
                curr.val = d2;
                curr.next = new ListNode();
                curr = curr.next;

                list2 = (list2 != null)? list2.next :null;
            }
        }
    if(prev != null ){
        prev.next = null;
    }
    
    return l3;
    }
}
