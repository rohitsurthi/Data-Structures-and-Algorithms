class Solution {
    public void reverseString(char[] s) {
        
        int fp = 0, ep = s.length-1;
        
        while(fp < ep){
            char tc = s[fp];
            s[fp] = s[ep];
            s[ep] = tc;
            fp++;
            ep--;
        }
    }
}
