class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length != t.length) return false
        val sortedS = s.toCharArray().sorted()
        val sortedT = t.toCharArray().sorted()
        return sortedS == sortedT
    }
}
