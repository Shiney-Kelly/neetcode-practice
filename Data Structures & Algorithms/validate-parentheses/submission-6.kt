class Solution {
    fun isValid(s: String): Boolean {
        // stack = arrayDeque
        if(s.length %2 !=0) return false

        val bracketMap = mapOf(
            ')' to '(',
            '}' to '{',
            ']' to '['
        )
        
        val stack = ArrayDeque<Char>()
        for(c in s){
            if(bracketMap.containsKey(c)){
                val topElement = if(stack.isNotEmpty()) stack.pop() else '#'
                if(topElement != bracketMap[c]){
                    return false
                }
            } else {
                stack.push(c)
            }
        }
        return stack.isEmpty()
    }
}
