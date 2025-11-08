
Q1. Minimum Moves to Equal Array Elements III
Easy
You are given an integer array nums.
------------------------------------------------------------------------------------------------------------------

In one move, you may increase the value of any single element nums[i] by 1.

Return the minimum total number of moves required so that all elements in nums become equal.

-figure the max element as there is no direct built in method avail that works for integer so use
                                    Arrays.stream(arr).max().getAsInt()
 method to figure the max element.

-then in for loop go from 0 to n-1 in where check for every single no. whether its equal to max  if no increase it and the counter
--------------------------------------------------------------------------------------------------------------------

class Solution {
    public int minMoves(int[] nums) {
       int max= Arrays.stream(nums).max().getAsInt();
        int c=0;
        for(int i=0;i<nums.length;i++){
            while(nums[i]<max){
                nums[i]++;
                c++;
            }
        }

        return c;
    }
}
