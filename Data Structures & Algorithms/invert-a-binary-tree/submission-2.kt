/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun invertTree(root: TreeNode?): TreeNode? {
        // consider BFS (queue) or DFS (stack)
        if(root == null) return null
        
        val queue = ArrayDeque<TreeNode>()
        queue.add(root)

        while(queue.isNotEmpty()){
            val cur = queue.poll()

            // switch
            val temp = cur.left
            cur.left = cur.right
            cur.right = temp

            // add left and right childs when not null
            cur.left?.let{
                queue.add(it)
            }

            cur.right?.let{
                queue.add(it)
            }
        }

        return root
    }
}
