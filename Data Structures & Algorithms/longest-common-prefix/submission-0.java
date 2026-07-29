class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0){
            return "";
        }
        String word=strs[0];
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);

            for(int j=1;j<strs.length;j++){
                if(i==strs[j].length() || strs[j].charAt(i)!=ch){
                    return word.substring(0,i);
                }
            }
        }
        return word;
    }
}