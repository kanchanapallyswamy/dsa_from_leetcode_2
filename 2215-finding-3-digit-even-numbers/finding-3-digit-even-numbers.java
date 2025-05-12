class Solution {
    public int[] findEvenNumbers(int[] d) {
        Set<Integer> st = new TreeSet<>();
        for(int i = 0; i < d.length; i++){
            if(d[i] == 0)continue;
            for(int j = 0; j < d.length; j++){
                if(i == j)continue;
                for(int k = 0; k < d.length; k++){
                    if(k == i || k == j)continue;
                    if(d[k]%2==0){
                        st.add(d[i]*100 + d[j]*10 + d[k]);
                    }
                }
            }
        }
        int ans [] = new int[st.size()];
        List<Integer> lst = new ArrayList<>(st);
        for(int i = 0; i < st.size(); i++)ans[i] = lst.get(i);
        return ans; 
    }
}