class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        if(nums.isEmpty()) return listOf()
        nums.sort()

        val res = mutableListOf<List<Int>>()
      
        for(i in 0 until nums.size-2){
            if (i > 0 && nums[i] == nums[i - 1]) continue
            var r = nums.size-1
            val cur = nums[i]
            var l = i+1
            while(l < r){
                val last = nums[r]
                val curTotal = nums[l] + cur
                val sum = last + curTotal
                when{
                    sum == 0 ->{
                        res.add(listOf(nums[r],nums[i],nums[l]))
                        l++
                        r--
                        while(l<r && nums[l] == nums[l-1]) l++
                    while (l < r && nums[r] == nums[r + 1]) r--
                    }
                    sum < 0 -> l++
                    else -> r--
                }
            }
        }
        return res

    }
}
