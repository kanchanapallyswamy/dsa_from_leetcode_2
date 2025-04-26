class Solution {
    public int[][] insert(int[][] intervals, int[] n) {
    List<Pair> l = new ArrayList<>();
        for(var i : intervals){
            l.add(new Pair(i[0], i[1]));
        }
        l.add(new Pair(n[0], n[1]));
        Collections.sort(l, (a, b) ->{
            return a.x - b.x;
        } );
        List<Pair> ans = new ArrayList<>();
        var prev  = l.get(0);
        for(var i = 1; i < l.size(); i++){
            var present = l.get(i);
            if(present.x <= prev.y){
                prev.y = Math.max(prev.y, present.y);
            }
            else{
                ans.add(prev);
                prev  = present;
            }
        }
        ans.add(prev);
        for(var i : ans)
        System.out.println(i.x+" "+i.y);
        int[][] res = new int[ans.size()][2];
        for (int i = 0; i < ans.size(); i++) {
            res[i][0] = ans.get(i).x;
            res[i][1] = ans.get(i).y;
        }
        return  res;

    }
}
class Pair{
    int x, y;
    Pair(int x, int y){
        this.x = x;
        this.y = y;
    }
}