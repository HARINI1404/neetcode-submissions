class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack=new Stack<>();
        int maxarea=0;
        int curr;

        for(int i=0;i<=heights.length;i++){
            if(i==heights.length){
               curr=0;
            }else{
            curr=heights[i];
            }

            while(!stack.isEmpty() && curr<heights[stack.peek()]){
                int height=heights[stack.pop()];
                
                int width;
                if(stack.isEmpty()){
                    width=i;
                }else{
                    width=i-stack.peek()-1;
                }
                int area=height*width;
                maxarea=Math.max(area,maxarea);
            }
            stack.push(i);
        }
        return maxarea;
        

    }
}
