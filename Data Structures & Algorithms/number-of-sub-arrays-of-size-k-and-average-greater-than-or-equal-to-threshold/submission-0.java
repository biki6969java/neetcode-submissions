class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum=0;
        int res=0;
        for(int i=0;i<k-1;i++){
            sum+=arr[i];
        }
        for(int j=0;j<=arr.length-k;j++){
            sum+=arr[j+k-1];
            if((sum/k)>=threshold){
                res++;
            }
            sum-=arr[j];
        }
        return res;
    }
}