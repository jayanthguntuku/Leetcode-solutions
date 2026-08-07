# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        fast_poi = head
        slow_poi = head

        while fast_poi != None and fast_poi.next != None:
            fast_poi = fast_poi.next.next
            slow_poi = slow_poi.next

            if slow_poi == fast_poi:
                return True
        return False
