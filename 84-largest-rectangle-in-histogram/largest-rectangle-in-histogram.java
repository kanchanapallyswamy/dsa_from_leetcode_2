class Solution {
    public int largestRectangleArea(int[] a) {
        int l[]=new int[a.length];
        int r[]=new int[a.length];
        l=NSE(a);
        r=PSE(a);
        int max=0;
        for(int i=0;i<a.length;i++){
            max=Math.max(max,a[i]*(l[i]-1-r[i]));
        }
        return max;
    }
    static int[] NSE(int a[]){
        int k[]=new int[a.length];
        Arrays.fill(k,a.length);
        Stack<Integer> st=new Stack<>();
        for(int i=a.length-1;i>=0;i--){
        while(!st.isEmpty() && a[st.peek()] >= a[i]){
            st.pop();
        }
        if(!st.isEmpty())k[i]=st.peek();
        st.push(i);
        }
        return k;
    }

      static int[] PSE(int a[]){
        int k[]=new int[a.length];
        Arrays.fill(k,-1);
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<a.length;i++){
        while(!st.isEmpty() && a[st.peek()] >= a[i]){
            st.pop();
        }
        if(!st.isEmpty())k[i] = st.peek();
        st.push(i);
        }
        return k;
    }
}