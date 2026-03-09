import java.util.*;
class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        if(s1.length() == 0 || s2.length() == 0){
            return "";
        }
        int max = Math.min(s1.length(),s2.length());
        int i = 0;
        for(int j = 0; j<max; j++){
            if(s1.charAt(j) == s2.charAt(j)){
                i++;
            }
            else{
                break;
            }
        }
        return s1.substring(0,i);
    }
}

// leetcode : 14