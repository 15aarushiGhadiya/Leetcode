/*QUESTION
  *
  * Reverse a singly linked list.

Example:

Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NULL

*/

/*  1.ITERATIVE APPROACH
 *  time comlexity :o(n)
 *  space complexity : o(1)
 *  */


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode previous = null;
        ListNode Next;
        while(current !=null)
        {
            Next = current.next;
            current.next = previous;
            previous = current;
            current = Next;

        }
        head = previous;
        return head;
    }
}

