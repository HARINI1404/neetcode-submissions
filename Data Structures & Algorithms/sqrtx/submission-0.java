class Solution {
    public int mySqrt(int x) {
        int left=0;
        int right=x;
        int ans=0;

        while(left<=right){
            int mid=left+(right-left)/2;
            long sqrt=(long)mid*mid;

            if(sqrt==x){
                return mid;
            }else if(sqrt>x){
                right=mid-1;
            }else{
                ans=mid;
                left=mid+1;
            }
            
        
        
        }
        return ans;
    }
}