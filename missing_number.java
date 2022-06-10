
class missing_number{
  public int missingNumber(int[] arr){
    int sum = 0;
    int n = arr.length;
    for(int i = 0; i<n; i++){
      sum += arr[i];
    }
    int res = add(n);
    return (res-sum);
  }

  public int add(int n){
    if(n != 0){
      return n + add(n-1);
    }
    return 0;
  }
}