class Solution {
    public boolean checkDistances(String s, int[] distance) {
        PriorityQueue<Character> pq = new PriorityQueue<>();
        for( var i : s.toCharArray())if(!pq.contains(i))pq.add(i);
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(!pq.contains(ch))continue;
               if(pq.contains(ch))pq.remove(ch);
            //    if(pq.size() == 0)return true;
               int cnt = 0;
               for(int j = i + 1; j < s.length(); j++){
                char chr = s.charAt(j);
                if(chr == ch)break;
                else cnt++;
               }
               int ele = distance[(int)(ch-'a')];
               System.out.println(ch+" -> "+ele);
               if( ele != cnt)return false;
        }
        return true;
    }
}