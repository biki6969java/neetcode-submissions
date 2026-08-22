class Solution {
    public int totalFruit(int[] fruits) {
        int l=0,r=0;
        int res=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        while(r<fruits.length){
            map.put(fruits[r],map.getOrDefault(fruits[r],0)+1);
            r++;

            if(map.size()>2){
                int value=fruits[l];
                map.put(value,map.get(value)-1);
                    if (map.get(value) == 0) {
                    map.remove(value);
                }
            l++;
            }
           
           res=Math.max(res,r-l);
        }
        return res;
    
    }
}