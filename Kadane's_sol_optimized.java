class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int m=arr[0];
        int c=arr[0];
        
        for(int i=1;i<arr.length;i++){
            c=Math.max(c+arr[i],arr[i]);
            m=Math.max(c,m);
        }
        
        return m;
    }
}
