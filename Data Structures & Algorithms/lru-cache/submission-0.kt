class LRUCache(capacity: Int) {

    private val storeMap = object: LinkedHashMap<Int, Int>(capacity, 0.75f, true){
        override fun removeEldestEntry(eldest: MutableMap.MutableEntry<Int, Int>?): Boolean {
        // Return true when the map exceeds your target capacity
        return size > capacity
    }
    }

    fun get(key: Int): Int {
        return storeMap[key]?: -1
    }

    fun put(key: Int, value: Int) {
        storeMap[key] = value
    }
}
