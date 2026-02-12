public int maxsubarray(int []nums){
  int curr=nums[0];
  int maxx=nums[0];

  for(int i=0;i<nums.length;i++){
    curr=Math.max(curr,curr+nums[i]);
    maxx=Math.max(curr,maxx);
  }
return maxx;
}
