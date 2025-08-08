Example 1:
Input: N = 6, array[] = {13,46,24,52,20,9}
Output: 9,13,20,24,46,52
Explanation: After sorting the array is: 9, 13, 20, 24, 46, 52

Example 2:
Input: N=5, array[] = {5,4,3,2,1}
Output: 1,2,3,4,5
Explanation: After sorting the array is: 1, 2, 3, 4, 5
-------------------------------------------------------------------------------------------

import java.util.*;

class Solution {
    public int[] selectionSort(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            int mini=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[mini]){
                    mini=j;
                }
            }

            int temp=nums[mini];
            nums[mini]=nums[i];
            nums[i]=temp;
        }

        return nums;
    }
}

