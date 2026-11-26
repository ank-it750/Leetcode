class Solution {
    public int singleNonDuplicate(int[] arr) {
      int n=arr.length;
      if(n==1) return arr[0];
      if(arr[0] != arr[1]) return arr[0];
      if(arr[n-1] != arr[n-2]) return arr[n-1];
      int lo = 0;
      int hi = n-1;
      while(lo<=hi){
        int m = lo+(hi-lo)/2;
        if(arr[m] != arr[m-1] && arr[m] != arr[m+1]){
            return arr[m];
        }
        int a = m, b= m;
        if(arr[m-1]==arr[m]) a=m-1;
        else b = m+1;
        int leftcount = a-lo;
        int rightcount = hi-b;
        if(leftcount%2==0) lo = b+1;
        else hi = a-1;
      } 
      return -1;  
    }
}