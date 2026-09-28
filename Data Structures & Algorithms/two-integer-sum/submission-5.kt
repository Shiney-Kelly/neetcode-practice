class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val tempStore = hashMapOf<Int, Int>()
        val res = mutableListOf<Int>()
        nums.forEachIndexed{ index, value ->
        val first = target - value
        if(tempStore.contains(first)){
            res.add(tempStore[first]!!)
            res.add(index)
        }
        tempStore[value] = index

        }
        return res.toIntArray()
    }
}
