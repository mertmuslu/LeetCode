class Solution {
    public String convert(String s, int numRows) {
        char[] c = s.toCharArray();
        int num = 2*numRows -2;
        String result = "";
        System.out.println(num);
        if(num <= 0) {
            return s;
        }
        int howmany = s.length()/num;
        // System.out.println(num);
        int remainder = s.length()%num;
        for(int row = 0; row < numRows; row++) {
            for(int i = 0;i<=howmany;i++) {
                if(row == 0 || row == numRows-1) {
                    if (i<howmany) {
                        result = result + c[i*num+row];
                    }   
                    else if(remainder > 0) {
                        result = result + c[i*num+row];
                        remainder--;
                    }
                }
                else {
                    if(i<howmany) {
                        result = result + c[i*num+row] + c[(i+1)*(num)-row];
                    } 
                    else if(remainder > 0) {
                        result = result + c[i*(num)+row];
                        remainder--;
                        if((numRows-row)*2-2 == remainder) {
                            result = result + c[(i+1)*(num)-row];
                            remainder--;
                        }
                    }
                }
               
            }
        }
        return result;
    }
}