class Solution {
    public String longestPalindrome(String s) {
        char[] c = s.toCharArray();
        int i,j;
        i = 0;
        j = 1;
        int start_try = 0;
        int end_try = 0;
        int i_try = 0;
        int j_try = 0;
        int max_end = 0;
        int max_start = 0;
        int start = 0;
        int end = 1;
        int not = 0;
        int howmany =0;
        
        for (;i<s.length();i++) {
            for(j=s.length()-1;j>i;j--) {
                if(c[i] == c[j]) {
                    //start try
                    i_try = i;
                    j_try = j;
                    howmany = (int) Math.ceil((j-i+1)/2.0)+i;
                    //System.out.println("i: " +i + "  j: " +j + "howmany " + howmany);
                    not = 0;
                    while(i_try<=howmany && j_try>=0 && i_try<s.length()) {
                        if(c[i_try] == c[j_try]) {
                            // System.out.println("sol= "+ c[i_try] + " sağ: "+ c[j_try]);
                            i_try++;
                            j_try--;
                        }
                        else {
                            // System.out.println("Olmadı abi i,j:" +i+ " " +j);
                            not = 1;
                            //gelecek
                            break;
                        }
                    }
                    if (not == 0) {
                        
                        if((max_end-max_start)<(j-i)) {
                            max_end = j;
                            max_start = i;
                        }
                    }
                }
            }
        }

        return s.substring(max_start,max_end+1);
    }
}
