class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val countOccurMap = hashMapOf<Int, Int>()
        for(num in nums){
            if(countOccurMap.contains(num)){
                countOccurMap[num] = countOccurMap[num]!! +1
            }else{
                countOccurMap[num] = 1
            }
        }

        val sortedOccurMap = countOccurMap.entries.sortedByDescending{
            it.value
        }
        
        val firstKEntries = sortedOccurMap.take(k).map{it.key}.toIntArray()
        
        return firstKEntries
    }
}
