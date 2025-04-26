class Solution {
    public boolean squareIsWhite(String c) {
       int x = c.charAt(0) - 'a' + 1;
       int y = c.charAt(1) - '0';
       return (x + y) % 2 == 1;
    }
}