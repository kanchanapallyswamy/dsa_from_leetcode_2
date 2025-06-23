class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> mp = new LinkedHashMap<>();
        List<Pair> l = new ArrayList<>();
        for(var i : s.toCharArray())mp.put(i,1+mp.getOrDefault(i,0));
        for(var i : mp.entrySet())l.add(new Pair(i.getKey(),i.getValue()));
        l.sort((xx,yy)->{
            return yy.y - xx.y;
        });
        for(var i: l)System.out.print(i.x+" ");
        String ans = "";
        for(var i : l){
            String k = i.x+"";
            int t = i.y;
            while(t-->0)ans+=k;
        }
    return ans;
    }
}

class Pair{
    char x;
    int y;
    Pair(char x,int y){
        this.x = x;
        this.y = y;
    }
}