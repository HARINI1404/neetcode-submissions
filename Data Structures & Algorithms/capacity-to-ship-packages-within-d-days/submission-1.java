class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left=0;
        int right=0;

        for(int weight:weights){
            left=Math.max(left,weight);
            right+=weight;
        }
        int ans=right;

        while(left<=right){
            int mid=left+(right-left)/2;
            int reqdays=1;
            int currweight=0;

            for(int weight:weights){
                if(currweight+weight>mid){
                    reqdays++;
                    currweight=0;
                }
                currweight+=weight;
            }
            if(reqdays<=days){
                ans=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return ans;
    }
}