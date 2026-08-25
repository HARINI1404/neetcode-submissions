class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")){
                int last=stack.pop();
                int secondlast=stack.pop();
                stack.push (last+secondlast);
            }else if(tokens[i].equals("-")){
                int last=stack.pop();
                int secondlast=stack.pop();
                stack.push(secondlast-last);
            }else if(tokens[i].equals("*")){
                int last=stack.pop();
                int secondlast=stack.pop();
                stack.push(last*secondlast);
            }else if(tokens[i].equals("/")){
                int last=stack.pop();
                int secondlast=stack.pop();
                stack.push(secondlast/last);
            }else{
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.pop();
    }
}
