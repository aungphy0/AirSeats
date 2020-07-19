class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        int [] ran_str = new int[26];
        for(char c : ransomNote.toCharArray()){
            int index = (int) c - 97;
            ran_str[index]++;
        }

        int [] mag_str = new int[26];
        for(char c : magazine.toCharArray()){
            int index = (int) c - 97;
            mag_str[index]++;
        }

        for(int i=0; i<26; i++){
            if(mag_str[i] < ran_str[i])
                return false;
        }

        return true;
    }
}

/***
Input: ransomNote = "a", magazine = "b"
Output: false

Input: ransomNote = "aa", magazine = "ab"
Output: false

Input: ransomNote = "aa", magazine = "aab"
Output: true
***/
