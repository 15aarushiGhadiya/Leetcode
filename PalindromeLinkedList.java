/*QUESTION

Given a singly linked list, determine if it is a palindrome.

Example 1:

Input: 1->2
Output: false
Example 2:

Input: 1->2->2->1
Output: true  */

/* SOLUTION: 1.By reversing second half of linkedlist and then comparing it with other first half.
Time Complexity: O(n) */


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution 
{        
    ListNode findMiddle(ListNode head) //function to find middle node of linked list
    {
    ListNode fast = head;
        ListNode slow =head;
        while(fast !=null && fast.next !=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
     ListNode reverse(ListNode head) //function to reverse a linkedlist
     { 
        ListNode current = head;
        if(current ==null)
            return null ;
        else if(current.next == null)
            return current;
        ListNode nextNode = current.next;
        current.next = null;
        ListNode remain = reverse(nextNode);
        nextNode.next = current;
        return remain;
     }
    public boolean isPalindrome(ListNode head) 
    {
        ListNode slow = findMiddle(head); //middle of list is found
        ListNode revHead = reverse(slow); //second half list is reversed
         while(head!= null && revHead !=null)//now comparing first half and the reversed second half lists
             {   if(head.val != revHead.val)
               {
                 return false;
               }
                 head = head.next;
                 revHead = revHead.next;
             }
        return true;
     }
 }
