class Solution {
    public String frequencySort(String s) {

        String str = "";
        Map<Character,String> map = new TreeMap<>(Collections.reverseOrder());

        for(int i=0; i<s.length(); i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),Character.toString(s.charAt(i)));
            }else{
                map.put(s.charAt(i),map.get(s.charAt(i)) + Character.toString(s.charAt(i)));
            }
        }

        List<String> list = new ArrayList<>();

        for(Map.Entry<Character,String> entry : map.entrySet())
            list.add(entry.getValue());

        //Collections.sort(list, Collections.reverseOrder());
        Collections.sort(list, Comparator.comparing(String::length).reversed());

        for(int i=0; i<list.size(); i++){
            str += list.get(i);
        }
        //System.out.println(list);
        return str;
    }
}

/*
Input:
"tree"

Output:
"eert"

Explanation:
'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
*/
