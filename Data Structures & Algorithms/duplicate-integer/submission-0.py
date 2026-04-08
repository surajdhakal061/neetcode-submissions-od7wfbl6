class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        setArr= set()
        for num in nums:
            if num in setArr:
                return True
            else:
              setArr.add(num)  

        return False