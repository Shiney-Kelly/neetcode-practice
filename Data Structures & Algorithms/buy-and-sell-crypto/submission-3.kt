class Solution {
    fun maxProfit(prices: IntArray): Int {
       var left = 0
       var maxProf = 0
       for(right in 1 until prices.size){
        val curDiff = prices[right] - prices[left]
        if(curDiff<0){
            left = right
            continue
        }else{
            maxProf = maxOf(curDiff, maxProf)
        }
       }
       return maxProf
    }
}
