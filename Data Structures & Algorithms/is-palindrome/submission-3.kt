class Solution {
    fun isPalindrome(s: String): Boolean {
       val filteredS = s.filter{
        it.isLetterOrDigit()
       }.trim().lowercase()

    //    println(filteredS)
       return filteredS.reversed() == filteredS
    }
}
