class Solution {
    public String largestOddNumber(String num) {
        int i = num.length()-1;
        int j = num.length()-1;
        boolean is = true;
        while(i>=0){
            if((num.charAt(i)-'0')%2 != 0){
                j = i;
                is = false;
                break;
            }
            i--;
        }
        if(j==num.length()-1 && is){
            return "";
        }
        return num.substring(0,j+1);
    }
}
