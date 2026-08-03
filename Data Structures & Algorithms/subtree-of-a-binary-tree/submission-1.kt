/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun isSubtree(root: TreeNode?, subRoot: TreeNode?): Boolean {
        // A null subRoot is technically a subtree of any tree
        if(subRoot == null) return true
        if(root == null) return false

        val queue = ArrayDeque<TreeNode>()
        queue.add(root)

        while(queue.isNotEmpty()){
            val cur = queue.poll()
            if(isSameTree(cur, subRoot)){
                return true
            }
            cur.left?.let{
                queue.add(it)
            }
            cur.right?.let{
                queue.add(it)
            }

        }

        return false

    }

    private fun isSameTree(p: TreeNode?, q:TreeNode?): Boolean{
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
