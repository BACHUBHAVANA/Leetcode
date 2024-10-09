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
    public ListNode getIntersectionNode(ListNode hA, ListNode hB) {
        ListNode s=hA;
        ListNode f=hB;
        while(s!=f)
        {
            if(s==null)s=hB;
            else
            s=s.next;
            if(f==null)f=hA;
            else 
            f=f.next;
        }
        return f;

    }
}