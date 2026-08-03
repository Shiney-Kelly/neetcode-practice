/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun maxDepth(root: TreeNode?): Int {
        // DFS with stack
        if(root == null) return 0
        val stack = ArrayDeque<Pair<TreeNode,Int>>()
        stack.push(Pair(root,1))
        var maxDepth = 0

        while(stack.isNotEmpty()){
            val (node,depth) = stack.pop()
            maxDepth = maxOf(maxDepth, depth)

            node.left?.let{
                stack.push(Pair(it,depth+1))
            }

            node.right?.let{
                stack.push(Pair(it,depth+1))
            }
        }
        
        return maxDepth
    }
}
