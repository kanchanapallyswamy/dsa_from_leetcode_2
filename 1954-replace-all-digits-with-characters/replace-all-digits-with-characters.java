class Solution {
    public String replaceDigits(String s) {
        Map< Character, Map < Integer, Character>> mp = new TreeMap<>();
        char c = 'a';
        for(int i = 1; i <= 26; i++){
            mp.put(c++, new HashMap<>());
        }

        for(var i : mp.entrySet()){
            char ch = i.getKey();
            char copy = ch;
            Map<Integer, Character> innerMap = i.getValue();
            for(int idx = 1; idx <= 26; idx++){
                copy++;
                if(copy>'z')break;
                innerMap.put(idx,copy);
            }
            innerMap.put(0,ch);
        }

        String ans = "";
        for(int i = 0; i< s.length() - 1; i++){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(i+1);
            int val = ch2-'0';
            ans += ch1;
            Map<Integer, Character> innerMap = new HashMap<>(mp.get(ch1));
            System.out.println(innerMap.size());
            ans += innerMap.get(val);
            i++;
        }
        if(s.length()%2==1)ans += s.charAt(s.length()-1);
        System.out.println(ans);
        return ans;

    }
}