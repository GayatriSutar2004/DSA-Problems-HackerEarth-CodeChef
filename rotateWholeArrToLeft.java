Rotate Array
Difficulty: MediumAccuracy: 37.06%Submissions: 556K+Points: 4Average Time: 20m
Given an array arr[]. Rotate the array to the left (counter-clockwise direction) by d steps, where d is a positive integer. Do the mentioned change in the array in place.

Note: Consider the array as circular.

Examples :

Input: arr[] = [1, 2, 3, 4, 5], d = 2
Output: [3, 4, 5, 1, 2]
Explanation: when rotated by 2 elements, it becomes 3 4 5 1 2.
Input: arr[] = [2, 4, 6, 8, 10, 12, 14, 16, 18, 20], d = 3
Output: [8, 10, 12, 14, 16, 18, 20, 2, 4, 6]
Explanation: when rotated by 3 elements, it becomes 8 10 12 14 16 18 20 2 4 6.
Input: arr[] = [7, 3, 9, 1], d = 9
Output: [3, 9, 1, 7]
Explanation: when we rotate 9 times, we'll get 3 9 1 7 as resultant array.

-----------------------------------------------------------------------------------------
Steps to Solve

Step 1: Handle d > n
Let n = arr.length.
If d > n, rotating d times is same as d % n times.
d = d % n;
Step 2: Store first d elements (optional for in-place)
These are the elements that will move to the end after rotation.
Example: arr[0..d-1] → [1,2]
Step 3: Shift the remaining elements to the left
Move elements from index d to n-1 forward by d positions.
After shift, the first n-d positions contain [arr[d..n-1]].
Example:
arr = [1,2,3,4,5], d = 2
Shift 3,4,5 to front → [3,4,5,4,5] (temporarily)
Step 4: Place the saved d elements at the end
Copy [1,2] to positions n-d to n-1.
arr = [3,4,5,1,2]
Step 5: Done
Array is rotated left by d positions.
Alternative: In-Place Reversal Method (No extra array)
This is more efficient for large arrays:
Reverse first d elements → [2,1,3,4,5]
Reverse remaining n-d elements → [2,1,5,4,3]
Reverse entire array → [3,4,5,1,2]
✅ Array rotated in-place without extra space.
Step 6: Complexity
Time: O(n)
Space: O(d) if using temp array, O(1) with reversal method


----------------------------------------------------------------------------------------------
// User function Template for Java

class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        int n=arr.length;
        d=d%n;
        int temp[]=new int[d];
        int j=0;
        
        for(int i = 0;i<d ; i++){
            temp[j++]=arr[i];
        }
        
        for(int i=d; i<n; i++){
            arr[i-d]=arr[i];
        }
        
        for(int i=0;i<temp.length;i++){
            arr[n-d+i]=temp[i];
        }
    }
}
