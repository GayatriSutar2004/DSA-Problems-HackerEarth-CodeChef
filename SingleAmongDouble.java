// User function Template for Java

class Sol {
    public static int search(int n, int arr[]) {
        // your code here
       int ans=0;
       
       for(int i=0;i<n;i++){
           ans^=arr[i];
       }
       return ans;
    }
}


------------------------------------------------------------------------------------
Single Among Doubles
Difficulty: MediumAccuracy: 53.69%Submissions: 95K+Points: 4Average Time: 20m
Given a sorted array arr[] of n positive integers having all the numbers occurring exactly twice, except for one number which will occur only once. Find the number occurring only once.

Examples :

Input: n = 5, arr[] = {1, 1, 2, 5, 5}
Output: 2
Explanation: Since 2 occurs once, while other numbers occur twice, 2 is the answer.
Input: n = 7, arr[] = {2, 2, 5, 5, 20, 30, 30}
Output: 20
Explanation: Since 20 occurs once, while other numbers occur twice, 20 is the answer.
