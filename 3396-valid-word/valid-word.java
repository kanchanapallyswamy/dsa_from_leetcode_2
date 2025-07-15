class Solution {
    public boolean isValid(String w) {
        if(w.length()<3)return false;
        boolean v=false;
        boolean c=false;

        for(int i=0;i<w.length();i++){
            char k=w.charAt(i);
            if (!Character.isLetterOrDigit(k)) return false;
            if(isvowel(k)){
                v=true;
            }
            else if(isconsonant(k)){
                c=true;
            }
        }
        return c&&v;
    }
    public static boolean isvowel(char c){
        c=Character.toLowerCase(c);
        return (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') ;
    }
    public static boolean isconsonant(char c) {
        c=Character.toLowerCase(c);
        return c >= 'a' && c <= 'z' && !isvowel(c);
    }

    
}