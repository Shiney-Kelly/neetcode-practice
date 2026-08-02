/**
 * Definition of Interval:
 * class Interval(var start: Int, var end: Int) {}
 */

class Solution {
    fun canAttendMeetings(intervals: List<Interval>): Boolean {
        // sorting

        if(intervals.size <=1) return true

        // 1. Sort the intervals based on the start time
        val sortedIntervals = intervals.sortedBy { it.start }

        for(idx in 0 until sortedIntervals.size-1){
            val curMeeting = sortedIntervals[idx]
            val nextMeeting = sortedIntervals[idx+1]
            if(curMeeting.end > nextMeeting.start){
                return false
            }
        }
        return true
    }
}
