class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();

        for(String word:strs){
        char[] ch=word.toCharArray();
        Arrays.sort(ch);

        String newstr=new String(ch);

        
            if(!map.containsKey(newstr)){
                map.put(newstr,new ArrayList<>());
            }
            map.get(newstr).add(word);
        }
        return new ArrayList<>(map.values());

        
    }
}
