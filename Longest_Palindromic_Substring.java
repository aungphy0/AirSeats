class Solution {
    public String longestPalindrome(String s) {
        if(s == null || s.length() < 1) return "";
        int start = 0, end = 0;

        for(int i=0; i<s.length(); i++){
            int len1 = expendAroundCenter(s,i,i);
            int len2 = expendAroundCenter(s,i,i+1);
            int len = Math.max(len1, len2);
            if(len > end - start){
                start = i - (len - 1)/2;
                end = i + len/2;
            }
        }

        return s.substring(start,end + 1);
    }

    private int expendAroundCenter(String s, int left, int right){

        int l = left;
        int r = right;

        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }

        return r - l -1;
    }
}

/***
Given a string s, find the longest palindromic substring in s.
You may assume that the maximum length of s is 1000.

Example 1:

Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.

Example 2:

Input: "cbbd"
Output: "bb"
***/
