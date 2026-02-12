public int maxSubArr(int nums[]){
  int max=Integer.MIN_VALUE;
   for(int i=0;i<nums.length;i++){
      int sum=0;
      for(int j=i;j<nums.legth;j++){
        sum=sum+nums[i];
        if(max<sum){
          max=sum;
        }
      }
    return max;
   }
}
