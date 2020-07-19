class Solution {
    public void reverseString(char[] s) {

        for(int i=0; i<s.length/2; i++){
            char temp = s[i];
            s[i] = s[(s.length-1) - i];
            s[(s.length-1) - i] = temp;
        }
    }
}

/***

Example 1:

Input: ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

Example 2:

Input: ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]

***/
