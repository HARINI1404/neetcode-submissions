class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> ts=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int duplicate=target-nums[i];
            if(ts.containsKey(duplicate)){
                return new int[] {ts.get(duplicate),i};
            }
            ts.put(nums[i],i);
        }
        return null;
    }
}
