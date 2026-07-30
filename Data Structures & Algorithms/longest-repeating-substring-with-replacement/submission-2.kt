class Solution {
    fun characterReplacement(s: String, k: Int): Int {
        var left = 0
        var maxFreq = 0
        var maxLen = 0
        val freq = hashMapOf<Char, Int>()
        for(right in s.indices){
            val rightChar = s[right]
            freq[rightChar] = freq.getOrDefault(rightChar, 0)+1
            // If the characters we need to replace exceeds k, shrink the window
            maxFreq = maxOf(maxFreq,freq[rightChar]!!)     
            val windowSize = right - left +1
            if(windowSize - maxFreq > k){
                val leftChar = s[left]
                freq[leftChar] = freq[leftChar]!!-1
                left++
            }   
            maxLen = maxOf(maxLen, right-left+1)
        }
        return maxLen
        
    }
}
