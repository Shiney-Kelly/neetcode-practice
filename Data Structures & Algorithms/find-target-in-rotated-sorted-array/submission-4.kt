class Solution {
    fun search(nums: IntArray, target: Int): Int {
        // binary search- half sorted lists
        var l = 0
        var r = nums.size-1

        while(l<=r){
            val mid = l+ (r-l)/2
            if(nums[mid]==target){
                return mid
            }

            // u dont know which left/right is a ascending list
            if(nums[mid]>=nums[l]){
                // check target in left
                if (nums[l]<=target && nums[mid]>target){
                    r = mid -1
                } else{
                    l = mid +1
                }
            } else{
                // check target in left
                if (nums[mid]<target && nums[r]>=target){
                    l = mid +1
                } else{
                    r = mid -1
                }
            }
        }
        return -1
    }
}
