
// 1ms              Beats %99.67
// 43.98 MB         Beats %99.66
class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] c = s.toCharArray();
        int length,max,i,j,k,lastsub,m,alldif; length = max = i = k = lastsub = m = alldif = 0;
        int start,end; start = 0; end = j = 1;
        if(s.length() > 1) {
            for (;i<s.length() && j<s.length();j++,end++) {
                k=0;
                for(;i<j;i++) {
                    if(c[i] == c[j]) {
                        lastsub = 1;  
                        k=1;
                        length = end-start;    
                        start = i+1;
                        if(max<length)max=length;
                        break;
                    }
                    else {
                        length = end-start;
                        if(max<length)max=length;
                    }
                }
                i = start;
            }
            if(lastsub == 0)return s.length();
            if(k == 0) {
                length = end-start;
                if(max<length)max=length;
                return max;
            }    
            return max;      
        }
        else return s.length();
    }
}