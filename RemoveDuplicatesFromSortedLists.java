/*QUESTION:

Given a sorted linked list, delete all duplicates such that each element appear only once.

Example 1:

Input: 1->1->2
Output: 1->2
Example 2:

Input: 1->1->2->3->3
Output: 1->2->3 */

/* SOLUTION:
Time Complexity: O(n)
Space Complexity: O(1)  */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
     public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while(temp != null && temp.next !=null)
        {    
            ListNode nextNode = temp.next;
            if(temp.val == nextNode.val)
            {
                temp.next = temp.next.next;
            }
            else
            temp = temp.next;
        }
        return head;
        
    }
}
