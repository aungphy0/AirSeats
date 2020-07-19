class Solution {
    public int findLucky(int[] arr) {

        Map<Integer,Integer> map = new HashMap();

        for(int a : arr){
            if(!map.containsKey(a)){
                map.put(a,1);
            }else{
                map.put(a, map.get(a) + 1);
            }
        }

        List<Integer> list = new ArrayList();

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getKey() == entry.getValue()){
                list.add(entry.getKey());
            }
        }

        if(list.size() != 0){
            return (int) Collections.max(list);
        }

        return -1;
    }
}

/***
Input: arr = [2,2,3,4]
Output: 2
Explanation: The only lucky number in the array is 2 because frequency[2] == 2.

Input: arr = [1,2,2,3,3,3]
Output: 3
Explanation: 1, 2 and 3 are all lucky numbers, return the largest of them.

Input: arr = [2,2,2,3,3]
Output: -1
Explanation: There are no lucky numbers in the array.

Input: arr = [5]
Output: -1

Input: arr = [7,7,7,7,7,7,7]
Output: 7
***/
