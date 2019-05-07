/* QUESTION :
 
 Write a program to find the node at which the intersection of two singly linked lists begins.
Example 1:
Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,0,1,8,4,5], skipA = 2, skipB = 3
Output: Reference of the node with value = 8
Input Explanation: The intersected node's value is 8 (note that this must not be 0 if the two lists intersect).
From the head of A, it reads as [4,1,8,4,5]. From the head of B, it reads as [5,0,1,8,4,5]. 
There are 2 nodes before the intersected node in A; There are 3 nodes before the intersected node in B.*/

/* SOLUTION:
 Time Complexity : O(n)
 Space Complexity :O(1) */
 
 /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    //function to find length of linkedlist
    int lengthOfList(ListNode head)
    {
        int count = 0;
        ListNode temp = head;
        while(temp != null)
        {
            count++;
            temp = temp.next;
        }
        return count;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       int  countA = lengthOfList(headA);//finding length of list A
       int countB = lengthOfList(headB);//finding length of list B
        int diff;// to find difference in length of lists
        
        //if  list A is larger than list B
        if(countA > countB)
        {
            diff = countA - countB;
            int n=0;
            while(n != diff)
            {
                headA = headA.next; //bringing pointer to a node so that remaining length of                                       //list A becomes equal to length of list B
                n++;
            }
        }
        //if list B is larger than list B
        else
        {
            diff = countB - countA;
            int n=0;
         while(n != diff)
            {
                headB = headB.next; //bringing pointer to a node so that remaining length of                                       //list B becomes equal to length of list A
                n++;
            }
        }
        //comparing nodes of lists till a comman node between two is found
        while(headA != headB)
        {
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
        
        
    }
}
