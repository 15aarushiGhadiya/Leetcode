/*QUESTION
Given a linked list, determine if it has a cycle in it.

To represent a cycle in the given linked list, we use an integer pos which represents the position (0-indexed) in the linked list where tail connects to. If pos is -1, then there is no cycle in the linked list.

 

Example 1:

Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where tail connects to the second node.*/


/*SOLUTION
1.using two iterators (Floyd's method)
*/

/*time complexity : O(n)
space complexity :O(1) */

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution
{
    public boolean hasCycle(ListNode head)
    {
        ListNode fast = head;
        ListNode slow = head;
        if(head == null || head.next == null)
            return false;
        
        while(fast != null && fast.next !=null )
        {
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast)
            return true;
        }
        return false;
    }
}
            
  
        
    

