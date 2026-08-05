class Solution {
    fun combinationSum(nums: IntArray, target: Int): List<List<Int>> {
        val res = mutableListOf<List<Int>>()
        val stack = ArrayDeque<State>()
        for(i in nums.indices){
            stack.push(State(i, mutableListOf(nums[i]), nums[i]))
        }

        while(stack.isNotEmpty()){
            val (currentIdx, curNumsChosen, curSum) = stack.pop()
            if(curSum == target){
                res.add(curNumsChosen)
                continue
            }

            if(curSum > target){
                continue
            }

            for (i in currentIdx until nums.size) {
        val nextSum = curSum + nums[i]
        if (nextSum <= target) {
            val nextPath = (curNumsChosen + nums[i]).toMutableList()
            stack.push(State(i, nextPath, nextSum))
        }
    }

        }
        return res

    }

    data class State(
        val index: Int, // current index
        val numsChosen: MutableList<Int>, // nums chosen so far
        val sum: Int,
    )
}
