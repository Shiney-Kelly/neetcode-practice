class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        // sliding_window
        val set = hashSetOf<Char>()
        var left = 0
        var maxL = 0

        for(right in s.indices){
            while(set.contains(s[right])){
                set.remove(s[left])
                left++
            }
            set.add(s[right])
            maxL = maxOf(set.size, maxL)
        }
        return maxL
    }
}
