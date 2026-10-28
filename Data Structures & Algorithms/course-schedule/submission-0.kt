class Solution {
    fun canFinish(numCourses: Int, prerequisites: Array<IntArray>): Boolean {
        val graph = Array(numCourses){
            mutableListOf<Int>()
        }

        for((a,b)in prerequisites){
            graph[b].add(a)
        }

        val state = IntArray(numCourses)
        
        fun hasCycle(node:Int): Boolean{
            if(state[node] == 1){
                return true
            }
            if(
                state[node] == 2
            ){
                return false
            }
            state[node] = 1
            // neighbour check
            for(next in graph[node]){
                if (hasCycle(next)) return true
            }
            state[node] = 2
            return false
        }

        for(i in 0 until numCourses){
            if(hasCycle(i)) return false
        }
        return true

    }
}
