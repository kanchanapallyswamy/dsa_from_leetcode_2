class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Set<Integer> st = new HashSet<>();
        for(var i : arr2)st.add(i);
        Set<Integer> st2 = new TreeSet<>();
        Map<Integer,Integer> mp = new HashMap<>();
        for(var i : arr1){
            if(st.contains(i))mp.put(i,1+mp.getOrDefault(i,0));
        }
        List<Integer> ans = new ArrayList<>();
        for(var i : arr2){
            int freq = mp.get(i);
            while(freq --> 0){
                ans.add(i);
            }
        }
        List<Integer> st3 = new ArrayList<>();
        for(var i : arr1)if(!st.contains(i))st3.add(i);
        Collections.sort(st3);
        ans.addAll(st3);
        // System.out.println(ans);
        int anss [] = new int[ans.size()];
        for(int  i = 0; i < anss.length; i++)anss[i] = ans.get(i);
        // return new int[0];
        return anss;


    }
}