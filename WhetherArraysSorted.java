Given an array arr[], check whether it is sorted in non-decreasing order. Return true if it is sorted otherwise false.

Examples:

Input: arr[] = [10, 20, 30, 40, 50]
Output: true
Explanation: The given array is sorted.
Input: arr[] = [90, 80, 100, 70, 40, 30]
Output: false
Explanation: The given array is not sorted.
Constraints:
1 ≤ arr.size ≤ 106
- 109 ≤ arr[i] ≤ 109
--------------------------------------------------------------------
import java.util.Arrays.*;
class Solution {
    public boolean isSorted(int[] arr) {
        // code here
        int []arr2=Arrays.copyOf(arr,arr.length);
        Arrays.sort(arr2);
        if(Arrays.equals(arr,arr2))
            return true;
        else return false;
    }
}
