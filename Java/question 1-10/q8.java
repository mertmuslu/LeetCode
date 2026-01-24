class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        char[] c = s.toCharArray();
        int len = s.length();
        long result = 0;
        char[] resArr = new char[s.length()];
        int start = 0;
        int negativity = 1;
        int alreadySignEntered = 0;
        int j = 0;
        int addNeg = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if((c[i] == '-' || c[i] == '+') && alreadySignEntered == 0){
                alreadySignEntered = 1;
                start = 1;
                if(c[i] == '-') {
                    negativity=-1;
                    addNeg = -1;
                }
                
            }
            else if((int)c[i] >= 48 && (int)c[i] <= 57) {
                alreadySignEntered = 1;
                start = 1;
                resArr[j] = c[i];
                j++;
            }
            else {
                break;
            }
        }
        for(int mert = 0 ; j>0 ; j--,mert++) {
            result += ((int)resArr[mert]-48) * Math.pow(10,j-1);
            if(result > Integer.MAX_VALUE) {
                
                return (int)Math.pow(2,31)*negativity+addNeg;
            }
        }
        return (int)result * negativity;
    }
}