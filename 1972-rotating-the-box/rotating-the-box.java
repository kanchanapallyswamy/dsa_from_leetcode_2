class Solution {
    public char[][] rotateTheBox(char[][] m) {
        int r = m.length , c = m[0].length;
        for(int i = 0; i < r; i++){
            change(m[i],c);
            // reverse(m[i],c);
        }
        char ans [][] = new char[c][r];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c ;j++){
                ans[j][r-i-1] = m[i][j];
            }
        }
        return ans;
    }
    public void reverse(char a[], int c){
        int i = 0, j = c-1;
        while(i<j){
            char temp = a[i];
            a[i]=a[j];
            a[j] = temp;
            i++;
            j--;
        }

    }
    public void change(char[] a, int c){
           int l = c - 1 , r = c -1;
           while(l >= 0){
            if(a[l] == '.'){
                l--;
            }
            else if(a[l] == '#'){
               if(a[r] == '.'){
                //  char temp = a[r];
                a[r]=a[l];
                a[l] = '.';
               }
               r--;
               l--;
            }
            else if(a[l] == '*'){
                   l--;
                   r = l;
            }
           }
    }
}