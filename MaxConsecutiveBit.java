class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, cur = 0;
        for (int x : nums) {
            if (x == 1) {
                cur++;
                if (cur > max) max = cur;
            } else {
                cur = 0;
            }
        }
        return max;
    }
}
----------------------------------OR--------------------------------
class Solution {
    public int maxConsecBits(int[] arr) {
        // code here
        int c=1;
        int m=1;
        
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                c++;
            }
            else{
                c=1;
            }
             m=Math.max(m,c);
        }
        
        return m;
    }
}
---------------------------------------------------------------------
Given an array arr[] consisting of only 0’s and 1’s, return count of the maximum number of consecutive 1’s or 0’s present in the array. 

Examples:

Input: arr[] = [0, 1, 0, 1, 1, 1, 1]
Output: 4
Explanation: The maximum number of consecutive 1’s in the array is 4 from index 3-6.
Input: arr[] = [0, 0, 1, 0, 1, 0]
Output: 2
Explanation: The maximum number of consecutive 0’s in the array is 2 from index 0-1.

---------------------------------
