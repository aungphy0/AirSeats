class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {

        String [] s = {};
        int range = 0;

        List<String> ls = new ArrayList<String>();
        List<Integer> index_list = new ArrayList<Integer>();
        List<String> list = new ArrayList<String>();
        List<String> the_rest = new ArrayList<String>();

        if(list1.length <= list2.length){
            range = list2.length;
            s = list2;
            for(String restaurant : list1){
                ls.add(restaurant);
            }
        }else{
            range = list1.length;
            s = list1;
            for(String restaurant : list2){
                ls.add(restaurant);
            }
        }

        for(int i=0; i<range; i++){
            if(ls.contains(s[i])){

                the_rest.add(s[i]);
                index_list.add(ls.indexOf(s[i]) + i);
            }
        }

        int index = Collections.min(index_list);

        if(index_list.size() == 1){
            list.add(the_rest.get(0));
        }else{
            for(int i=0; i<index_list.size(); i++){
                if(index_list.get(i) == index){
                   list.add(the_rest.get(i));
                }
            }
        }

        return list.toArray(new String[list.size()]);
    }
}

/**

Input:
["Shogun", "Tapioca Express", "Burger King", "KFC"]
["Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"]
Output: ["Shogun"]
Explanation: The only restaurant they both like is "Shogun".

Input:
["Shogun", "Tapioca Express", "Burger King", "KFC"]
["KFC", "Shogun", "Burger King"]
Output: ["Shogun"]
Explanation: The restaurant they both like and have the least index sum is "Shogun" with index sum 1 (0+1).

**/
