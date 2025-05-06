class Solution {
    public int numUniqueEmails(String[] emails) {
       Set< String > st = new HashSet<>();
       for(var i : emails){
        st.add(find(i) ) ;
       }
       System.out.println(st);
       return st.size();
    }
    String find(String s){
        String ans  = "";
        for(var i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if( ch == '+' || ch == '@'){
                break;
            }
            if(ch == '.')continue;
            ans += ch;
        }
        int idx = s.indexOf('@');
        ans += s.substring(idx);
        return ans;

    }
}