class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        if(nums.isEmpty()) return 0
        val sortedNums = nums.sorted()
        val storeSet = hashSetOf<Int>()
        var res = 0

        for(num in sortedNums){
            if(storeSet.isEmpty()){
                storeSet.add(num)
            }
            val prevNum = num -1
            if(storeSet.contains(prevNum)){
                storeSet.add(num)
            }else{
                storeSet.clear()
                storeSet.add(num)
            }
            val curSize = storeSet.size
            res = maxOf(curSize, res)
        }
        return res

    }
}
