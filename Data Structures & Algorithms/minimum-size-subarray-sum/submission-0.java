class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0,r=0,minLen=Integer.MAX_VALUE,sum=0;
        while(r<nums.length){
            sum+=nums[r];
            r++;
            while(sum>=target){
                minLen=Math.min(minLen,r-l);
                sum-=nums[l];
                l++;
            }
        }
        if (minLen == Integer.MAX_VALUE) {
            return 0;
        }

        return minLen;
    }
}