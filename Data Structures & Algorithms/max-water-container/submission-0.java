class Solution {
    public int maxArea(int[] heights) {
         int i=0;
         int j=heights.length-1;
         int maxArea=0;
         while(i<j){
            int width=j-i;
            int currArea=width*Math.min(heights[i],heights[j]);
            maxArea=Math.max(currArea,maxArea);

            if(heights[i]<heights[j]){
                i++;
            } else{
                j--;
            }
         }
         return maxArea;
    }
}
