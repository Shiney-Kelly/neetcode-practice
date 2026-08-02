/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun hasCycle(head: ListNode?): Boolean {
        val vals = hashSetOf<ListNode>()
        var cur = head

        while(cur != null){
            if(vals.contains(cur)){
                return true
            }
            vals.add(cur)
            cur = cur.next
        }
        return false
    }
}
