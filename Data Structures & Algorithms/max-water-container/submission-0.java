class Solution {
    public int maxArea(int[] heights) {
        int minheight=0;
        int maxarea=0;
        int left=0;
        int right=heights.length-1;

        while(left<right){
            int width=right-left;
            minheight=Math.min(heights[left],heights[right]);
            int area=width*minheight;
            maxarea=Math.max(area,maxarea);

            if(heights[left]<heights[right]){
            left++;
            }else{
            right--;
            }
        }
        return maxarea;

        
    }
}
