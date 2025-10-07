class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int m=Integer.MIN_VALUE;
        int n=arr.length;
        for(int i=0;i<=n-1;i++){
          int  s=0;
            for(int j=i;j<=n-1;j++){
               s=arr[j]+s;
               m=Math.max(s,m);
            }
        }
        
        return m;
    }
}
