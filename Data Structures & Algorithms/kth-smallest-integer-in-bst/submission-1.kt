/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun kthSmallest(root: TreeNode?, k: Int): Int {
        if(root == null) return -1
        var cur = root
        val stack = ArrayDeque<TreeNode>()
        // track of the loop until find
        var n = 0
        
        while(cur!= null || stack.isNotEmpty()){
            // go to the far left first
            while(cur!= null){
                stack.push(cur)
                cur = cur.left
            }
            cur = stack.pop()
            n++

            if(n==k){
                return cur.`val`
            }
            cur = cur.right
        }
        return -1

    }
}
