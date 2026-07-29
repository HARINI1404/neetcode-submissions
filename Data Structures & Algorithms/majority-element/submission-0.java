class Solution {
    public int majorityElement(int[] nums) {
        int frq=0;
        int count=0;

        for(int num:nums){
            if(count==0){
                frq=num;
            }
            if(frq==num){
                count++;
            }else{
                count--;
            }
        }
        return frq;
    }
}