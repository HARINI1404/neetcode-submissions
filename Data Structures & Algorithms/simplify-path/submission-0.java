class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack=new Stack<>();

        String[] parts=path.split("/");

        for(String part:parts){
            if(part.equals("") || part.equals(".")){
                continue;
            }
            if(part.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else{
                stack.push(part);
            }
        }
        StringBuilder res=new StringBuilder();
        for(String dir:stack){
            res.append("/");
            res.append(dir);
        }
        if(res.length()==0){
            return "/";
        }
        return res.toString();
    }
}