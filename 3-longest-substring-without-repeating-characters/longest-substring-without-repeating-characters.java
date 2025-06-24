class Solution {
    public int lengthOfLongestSubstring(String s) {
        Queue<Character> q=new  LinkedList<>();
        int max=0,size=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(q.contains(c)){
                while(q.remove() != c){
                };
                q.add(c);
            }
            else {
                q.add(c);
                max=Math.max(max,q.size());
            }
        }
        return max;
        
    }
}