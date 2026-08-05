class Solution:
    def combinationSum(self, nums: List[int], target: int) -> List[List[int]]:
        ret = []
        nums.sort()

        def dfs(start, remain, path):
            if remain == 0:
                ret.append(list(path))
                return

            for i in range(start, len(nums)):
                if remain - nums[i] < 0:
                    break

                path.append(nums[i])
                dfs(i, remain - nums[i], path)
                path.pop()

        dfs(0, target, [])
        return ret
