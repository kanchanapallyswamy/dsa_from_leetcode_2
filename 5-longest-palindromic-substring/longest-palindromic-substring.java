class Solution {
    public String longestPalindrome(String s) {
        String x="";
        int n=s.length(),si=0,ei=0,max=0;
        for(int i=0;i<s.length();i++){
            int [] op1=find(s,i,i);
            int [] op2=find(s,i,i+1); 
            int dif1 = (op1[1]-op1[0]-1);
            int dif2 =(op2[1]-op2[0]-1);
            if(max < dif1 || max < dif2){
            max = Math.max(max,Math.max(dif1,dif2));
            if(dif1>dif2) x=s.substring(op1[0]+1,op1[1]);
            else x=s.substring(op2[0]+1,op2[1]);
            }
            
        }
        return x;
       
    }
    int[] find(String s,int i,int j){
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            i--;
            j++;
        }
        return new int[]{i,j};
    }
}