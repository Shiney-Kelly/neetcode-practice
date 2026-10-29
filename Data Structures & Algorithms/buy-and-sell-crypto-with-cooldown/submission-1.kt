class Solution {
    fun maxProfit(prices: IntArray): Int{
        val n = prices.size
        val memo = Array(n){
            IntArray(2){Int.MIN_VALUE}
        }

        // decision tree, dfs
        // skip or act (buy/sell)
        fun dfs(i: Int, holding: Int): Int{
            if(i >= n) return 0

            if(memo[i][holding] != Int.MIN_VALUE){
                return memo[i][holding]
            }

            val skip = dfs(i+1, holding)
            val act = if(holding == 1){
                // skip the next day
                prices[i] + dfs(i+2, 0)
            } else{
                -prices[i] + dfs(i+1, 1)
            }
            memo[i][holding] = maxOf(skip, act)
            return memo[i][holding]
        }
        return dfs(0, 0)

    }
}
