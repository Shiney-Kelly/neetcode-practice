class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val convertedSet = nums.toHashSet()
        println(nums.size)
        return convertedSet.size != nums.size
    }
}
