/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun levelOrder(root: TreeNode?): List<List<Int>> {
        // BFS traversal for tree
        val res = mutableListOf<List<Int>>()
        if(root == null) return res
        val queue = ArrayDeque<TreeNode>()
        queue.add(root)

        while(queue.isNotEmpty()){
            val levelSize = queue.size
            val curLevel = mutableListOf<Int>()
            for(idx in 0..levelSize-1){
                val node = queue.poll()
                curLevel.add(node.`val`)

                node.left?.let{
                    queue.add(it)
                }
                node.right?.let{
                    queue.add(it)
                }
            }
            res.add(curLevel)

        }
        return res

    }
}
