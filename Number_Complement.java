class Solution {

    public int findComplement(int num) {

        String n = Integer.toBinaryString(num);
        char [] bit = n.toCharArray();

        for(int i=0; i<bit.length; i++){
            if(bit[i] == '0'){
                bit[i] = '1';
            }else{
                bit[i] = '0';
            }

        }

        String n_bit = String.valueOf(bit);

        return Integer.parseInt(n_bit,2);
    }
}

/***
Input: num = 5
Output: 2
Explanation: The binary representation of 5 is 101 (no leading zero bits),
and its complement is 010. So you need to output 2.

Input: num = 1
Output: 0
Explanation: The binary representation of 1 is 1 (no leading zero bits),
and its complement is 0. So you need to output 0.
***/
