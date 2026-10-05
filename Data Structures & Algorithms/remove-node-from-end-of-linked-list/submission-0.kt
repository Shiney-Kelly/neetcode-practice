/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        val nodes = mutableListOf<ListNode?>()
        var cur = head
        while(cur != null){
            nodes.add(cur)
            cur = cur.next
        }

        val removeFromIdx = nodes.size -n
        if (removeFromIdx == 0) {
            return head?.next
        }
        
        nodes[removeFromIdx-1]?.next = nodes[removeFromIdx-1]?.next?.next
        
        return head
    }
}
