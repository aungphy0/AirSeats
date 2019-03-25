class Solution {
    public String[] findWords(String[] words) {
        
        String top = "qwertyuiop";
        String middle = "asdfghjkl";
        String bottom = "zxcvbnm";
        String [] w;
        String check; 
        int countM = 0; 
        int countT = 0; 
        int countB = 0; 
        
        List<String> theWords = new ArrayList<String>(); 
        
        for(int i=0; i<words.length; i++){

            check = words[i];
            for(int j=0; j<check.length(); j++){
                //check for the top row of keyboard
                if(top.contains(Character.toString(check.charAt(j))
                   .toLowerCase())){
                    
                    countT++;
                }
                //check for the middle row of keyboard
                if(middle.contains(Character.toString(check.charAt(j))
                   .toLowerCase())){
                            
                    countM++; 
                }
                //check for the bottom row of keyboard 
                if(bottom.contains(Character.toString(check.charAt(j))
                   .toLowerCase())){
                    
                    countB++; 
                }
                
            }
            //add to the list if true count and word length is equal
            if(countT == check.length()){
                theWords.add(check); 
            }
            countT = 0; 
            if(countM == check.length()){
                theWords.add(check);
            }
            countM = 0; 
            if(countB == check.length()){
                theWords.add(check); 
            }
            countB = 0; 
        }
        
        //convert ArrayList<String> to String [] 
        w = theWords.toArray(new String[theWords.size()]); 
        
        return w; 
        
    }
}
