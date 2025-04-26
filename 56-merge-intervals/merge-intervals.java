class Solution {
    public int[][] merge(int[][] intervals) {
        List<Pair> l = new ArrayList<>();
        for (var i : intervals) {
            l.add(new Pair(i[0], i[1]));
        }

        Collections.sort(l, (a, b) -> a.x - b.x);

        List<Pair> ans = new ArrayList<>();
        Pair prev = l.get(0);

        for (int i = 1; i < l.size(); i++) {
            Pair curr = l.get(i);
            if (curr.x <= prev.y) {
                prev.y = Math.max(prev.y, curr.y);
            } else {
                ans.add(prev);
                prev = curr;
            }
        }

        ans.add(prev); // Don't forget the last one

        // Debug output
        for (var i : ans)
            System.out.println(i.x + " " + i.y);

        // Convert to int[][]
        int[][] res = new int[ans.size()][2];
        for (int i = 0; i < ans.size(); i++) {
            res[i][0] = ans.get(i).x;
            res[i][1] = ans.get(i).y;
        }

        return res;
    }
}
class Pair{
    int x, y;
    Pair(int x, int y){
        this.x = x;
        this.y = y;
    }
}