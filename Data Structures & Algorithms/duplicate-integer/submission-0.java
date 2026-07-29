class Solution {
    public boolean hasDuplicate(int[] nums) {
        java.util.Arrays.sort(nums);
        int fre=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]==nums[i]){
                fre++;
            }
        }
        if(fre!=0){
            return true;
        }
        return false;
    }
}