import java.util.*;

public class AirSeats {
    
    public static void main(String[]args){
        
        System.out.println(threeCount(2,"1A 2F 1C"));
        System.out.println(threeCount(3,"1A 2F 1C 2B 3E"));
    }
    
    static int threeCount(int N, String S){
        
        int count = 0; 
        int [] col = {'A','B','C','D','E','F','G','H','J','K'};
        String s = "";
        StringBuilder sb = new StringBuilder();
        String seats = "";
        //put all the possible seats into StringBuilder object 
        for(int i=1; i<=N; i++){
            for(int j=0; j<col.length; j++){
                //System.out.printf("%d%c ",i,(char)col[j]);   
                s = i+Character.toString((char)col[j])+" ";
                sb.append(s);
            }
        }
        //convert back stringbuilder to string 
        seats = sb.toString();
        
        //create arraylist for taken seats 
        ArrayList<String> myList = new 
ArrayList<String>(Arrays.asList(S.split(" ")));
        //create arraylist for all the possible seats 
        ArrayList<String> myList2 = new 
ArrayList<String>(Arrays.asList(seats.split(" ")));
        
        //remove taken seats from the possible seats 
        for(int i=0; i<myList.size(); i++){
            for(int j=0; j<myList2.size(); j++){
                if(myList.get(i).equals(myList2.get(j))){
                    myList2.remove(j);
                }
            }
        }

        //System.out.print(myList2);
        
        for(int i=1; i<=N; i++){
           
               if(myList2.contains(i+Character.toString((char)'A')) &&
                  myList2.contains(i+Character.toString((char)'B')) &&
                  myList2.contains(i+Character.toString((char)'C'))){
                   
                  count++;
               
               }else{
                  count = 0; 
               }   
        }//calculation for seat A, B, C
        
        for(int i=1; i<=N; i++){
           
               if(myList2.contains(i+Character.toString((char)'H')) &&
                  myList2.contains(i+Character.toString((char)'J')) &&
                  myList2.contains(i+Character.toString((char)'K'))){
                   
                  count++;
               
               }else{
                  count = 0; 
               }   
        }//calculation for seat H, J, K
        
        for(int i=1; i<=N; i++){
           
               if((myList2.contains(i+Character.toString((char)'D')) &&
                  myList2.contains(i+Character.toString((char)'E')) &&
                  myList2.contains(i+Character.toString((char)'F'))) ||
                 (myList2.contains(i+Character.toString((char)'E')) &&
                  myList2.contains(i+Character.toString((char)'F')) &&
                  myList2.contains(i+Character.toString((char)'G')))){
                  
                   count++;
               
                }else{
                  count = count; 
               }     
        }//calculation for seat D, E, F, G
        
        return count;
    }//end seatCount method 
    
}//end class 
