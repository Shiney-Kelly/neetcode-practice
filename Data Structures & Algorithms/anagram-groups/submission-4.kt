class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
       val res = mutableListOf<MutableList<String>>()
       val storeBaseStr = hashMapOf<String, Int>()

       for(str in strs){
        val sortedS = str.toCharArray().sorted().joinToString("")
        if(!storeBaseStr.contains(sortedS)){
            storeBaseStr[sortedS] = res.size
            res.add(mutableListOf(str))
        }else{
            val idx = storeBaseStr[sortedS]!!
            res[idx].add(str)
        }
       }

       
       return res
    }
}
