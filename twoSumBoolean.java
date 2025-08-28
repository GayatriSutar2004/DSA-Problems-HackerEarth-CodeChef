import java.util.Arrays.*;
class Solution {
    boolean twoSum(int arr[], int target) {
        int n=arr.length;
      int l=0,r=n-1;
      while(l<r){
        int s=arr[l]+arr[r];
        if(s==target){
          return true;
        }else if(s<target){
          l++;
        }
        else{
          r--;
        }
        }
return false;
    }
}

------------------------------------------------------------------------------


Upgrade to Premium for Doubt Support across all your problems and courses.

Explore Premium
Redirection Icon
Two Sum - Pair with Given Sum
Difficulty: EasyAccuracy: 30.61%Submissions: 408K+Points: 2Average Time: 20m
Given an array arr[] of integers and another integer target. Determine if there exist two distinct indices such that the sum of their elements is equal to the target.

Examples:

Input: arr[] = [0, -1, 2, -3, 1], target = -2
Output: true
Explanation: arr[3] + arr[4] = -3 + 1 = -2
Input: arr[] = [1, -2, 1, 0, 5], target = 0
Output: false
Explanation: None of the pair makes a sum of 0
Input: arr[] = [11], target = 11
Output: false
Explanation: No pair is possible as only one element is present in arr[]
Constraints:
1 ≤ arr.size ≤ 105
-105 ≤ arr[i] ≤ 105
-2*105 ≤ target ≤ 2*105
