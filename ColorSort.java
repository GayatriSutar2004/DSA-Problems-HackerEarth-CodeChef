
Code
Testcase
Testcase

class Solution{
  public void Sort(int arr[]){
  int l=0,m=0,h=arr.lenght-1;
  while(m<=h){
    if(arr[m]==0){
      int t=arr[m];
      arr[m]=arr[l];
      arr[l]=t;
      l++;
      m++;
    }
    else if(arr[m]==1){
      m++;
    }else{
      int t=arr[m];
      arr[m]=arr[h];
      arr[h]=t;
      h--;
    }
  }
}
}

--------------------------------------------------------
Test Result
75. Sort Colors
Solved
Medium
Topics
premium lock icon
Companies
Hint
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

 

Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]
 

Constraints:

n == nums.length
1 <= n <= 300
nums[i] is either 0, 1, or 2.
