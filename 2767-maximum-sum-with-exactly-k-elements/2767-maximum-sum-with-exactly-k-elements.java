class Solution {
    public int maximizeSum(int[] nums, int k) {
        int t=0;
        for(int n:nums){
            if(n>t){
                t=n;
            }
        }

        return ((k*t) +(k-1)*(k)/2);
        
    }
}