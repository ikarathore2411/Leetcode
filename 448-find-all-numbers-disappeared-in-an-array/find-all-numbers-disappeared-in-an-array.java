class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for(int x: nums){
            int idx = Math.abs(x)-1;

            if(nums[idx]>0) nums[idx] = -nums[idx];
        }

        List<Integer> res = new ArrayList <>();
        for(int i=0; i<nums.length; i++){
            if(nums[i]>0) res.add(i+1);
            
        }return res;
    }
}