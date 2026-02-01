
public int BestTimeToBuyAndSell(int arr[])
{
int min=arr[i];
int p=0;
for(int i=0;i<arr.length;i++){
  if(min>arr[i]){
    min=arr[i];
  }
  int pr=arr[i]-min;
  if(p<pr)p=pr;
}
return p;}
