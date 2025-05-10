class Solution {
    public int numDifferentIntegers(String s) {
        Set<String> st = new HashSet<>();
        for(var i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
                String ans = "";
                if( ch>='0' && ch<='9'){
                    int cnt = 0;
                    for(int j = i; j < s.length(); j++){
                            char ch1 = s.charAt(j);
                            if(ch1>='0' && ch1<='9') {cnt++;ans+=ch1;}
                            else break;
                    }
                    i += cnt;
                    if(ans.charAt(0)!='0')st.add(ans);
                    else{
                    String k = "";
                    int p  = 0;
                    for( ; p < ans.length();p++){
                        char chh = ans.charAt(p);
                        if(chh !='0' )break;
                    }
                    k = ans.substring(p);
                    
                    st.add(k);
                System.out.println(p+" ->"+k);
                    }
                }
        }
        return st.size();
    }
}