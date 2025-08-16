You are given an array arr[] of non-negative integers. You have to move all the zeros in the array to the right end while maintaining the relative order of the non-zero elements. The operation must be performed in place, meaning you should not use extra space for another array.

Examples:

Input: arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
Output: [1, 2, 4, 3, 5, 0, 0, 0]
Explanation: There are three 0s that are moved to the end.
Input: arr[] = [10, 20, 30]
Output: [10, 20, 30]
Explanation: No change in array as there are no 0s.
Input: arr[] = [0, 0]
Output: [0, 0]
Explanation: No change in array as there are all 0s.
---------------------------------------------------------------
Steps to Solve

Initialize a pointer count
count will track the position where the next non-zero element should go.
Initially, count = 0.
Traverse the array from start to end using a loop i = 0 to n-1.
Check each element:
If arr[i] != 0 → it’s a non-zero element that belongs toward the front.
Swap non-zero element to the correct position:
Swap arr[i] with arr[count].
This moves the non-zero element forward and pushes zeros backward.
Increment count after each swap (or after placing a non-zero).
This ensures the next non-zero goes to the next available position.
Finish traversal:
All non-zero elements are now at the front in the same relative order.
All zeros automatically end up at the back.
----------------------------------------------------------------
class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int n=arr.length;
        int c=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                int t=arr[i];
                arr[i]=arr[c];
                arr[c]=t;
                c++;
            }
           
        }
    }
}
