class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int i=0,window=0,maxWindow=0,satisfied=0;

        for(int j=0;j<customers.length;j++){
            if(grumpy[j]==1){
                window+=customers[j];
            } else{
                satisfied+=customers[j];
            }

            if(j-i+1>minutes){
                if(grumpy[i]==1){
                    window-=customers[i];
                }
                i++;
            }

            maxWindow=Math.max(window,maxWindow);

        }
        return satisfied+maxWindow;
    }
}