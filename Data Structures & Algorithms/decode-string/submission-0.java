class Solution {
    public String decodeString(String s) {
        Stack<Integer> numstack=new Stack<>();
        Stack<String> strstack=new Stack<>();
        int num=0;
        StringBuilder curr=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
             
            

            if(Character.isDigit(ch)){
                num=num*10+(ch-'0');
            }else if(ch=='['){
                numstack.push(num);
                strstack.push(curr.toString());

                num=0;
                curr=new StringBuilder();
            }else if(ch==']'){
                int repeate=numstack.pop();
                String pre=strstack.pop();

                StringBuilder temp=new StringBuilder();

                for(int j=0;j<repeate;j++){
                    temp.append(curr);
                }
                curr=new StringBuilder(pre);
                curr.append(temp);
            }
            else{
                curr.append(ch);
            }
        }
        return curr.toString();
    }
}