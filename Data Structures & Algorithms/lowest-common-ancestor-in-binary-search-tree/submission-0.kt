/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        // BST
        var cur = root
        val pValue = q!!.`val`
        val qValue = p!!.`val`

        while(cur != null){
            val curValue = cur.`val`
            // go left
            if(curValue > pValue && curValue > qValue){
                cur = cur.left

            } else if (curValue < pValue && curValue < qValue){
                cur = cur.right
            } 
            // Otherwise, we have found the split point (the LCA)
            else {
                return cur
            }
        }
        return null
    }
}
