/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        var head1 = list1
        var head2 = list2
        // build new list needs a dummy head to resolve Null Pointer Exception
        val dummyHead = ListNode(0)
        var res = dummyHead

        while(head1 != null && head2 != null){
            if(head1.`val` <= head2.`val`){
                res.next = head1
                head1 = head1.next
            } else{
                res.next = head2
                head2 = head2.next
            }
            res = res.next!!
        }

        // Attach whatever is left over (if one list is longer than the other)
        if (head1 != null) {
            res.next = head1
        } else {
            res.next = head2
        }
        // not res.next because res keeps changing
        return dummyHead.next
    }
}
