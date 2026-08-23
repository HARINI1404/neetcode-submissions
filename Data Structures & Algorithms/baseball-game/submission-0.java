class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s=new Stack<>();
        int sum=0;
        for(String op:operations){
            
            if(op.equals("+")){
                int last=s.pop();
                int secondlast=s.peek();
                int news=last+secondlast;
                s.push(last);
                s.push(news);
            }
            else if(op.equals("D")){
                s.push(s.peek()*2);
            }else if(op.equals("C")){
                s.pop();
            }else{
                s.push(Integer.parseInt(op));
            }
        }
        for(int score:s){
            sum+=score;
        }
        return sum;
    }
}