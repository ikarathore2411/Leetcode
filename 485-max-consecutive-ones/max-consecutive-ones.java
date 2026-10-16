class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int best=0,curr=0;
        for( int x : nums){
            if(x == 1){
                curr++;
                best = Math.max(best,curr);
            }else curr=0;
        }return best;
    }
}