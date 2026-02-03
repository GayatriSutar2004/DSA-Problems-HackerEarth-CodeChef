public int majority(int arr[]){
    HashMap<Integer,Integer> map=new HashMap<>();
    int maxK=0;int maxV=0;

  for(int i=0;i<arr.length;i++){
    if(map.containsKey(arr[i])){
      map.put(arr[i],map.get(arr[i]));
      if(maxV<map.get(arr[i])){
        maxK=arr[i];
        maxV=map.get(arr[i]);
      }
    }else{
      map.put(arr[i],1);
      if(maxV<map.get(arr[i])){
        maxK=arr[i];
        maxV=map.get(arr[i]);
      }
    }
  }
}
