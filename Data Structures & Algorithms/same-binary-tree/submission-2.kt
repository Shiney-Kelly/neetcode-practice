/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        // BFS - FIFO
        if(p == null && q != null) return false
        if(q == null && p != null) return false

        val queue = ArrayDeque<Pair<TreeNode?, TreeNode?>>()

        queue.add(Pair(p,q))

        while(queue.isNotEmpty()){
            val (nodeP, nodeQ) = queue.poll()
            if(nodeP == null && nodeQ == null) continue
            if(nodeP == null || nodeQ == null) return false
            if(nodeP.`val` != nodeQ.`val`) return false

            queue.add(Pair(nodeP.left, nodeQ.left))
            queue.add(Pair(nodeP.right, nodeQ.right))
        }

        return true
        

    }
}
