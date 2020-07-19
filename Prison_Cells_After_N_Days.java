class Solution {
    public int[] prisonAfterNDays(int[] cells, int N) {

        int [] result = new int[8];

        List<String> ls = new ArrayList();

        int [] pattern = new int[8];

        for(int i=0; i<N; i++){

            int [] p = occupyVacantCells(cells);
            if(!ls.contains(Arrays.toString(p))){
                ls.add(Arrays.toString(p));
            }else{
                break;
            }

            cells = Arrays.copyOf(p, p.length);
        }

        if(N % ls.size() == 0){
            String s = ls.get(ls.size()-1);
            String [] str = s.substring(1,s.length()-1).split(",");
            for(int i=0; i<str.length; i++){
                result[i] = Integer.parseInt(str[i].replaceAll("\\s",""));
            }
        }
        else{
            int index = N % ls.size();
            String s = ls.get(index - 1);
            String [] str = s.substring(1,s.length()-1).split(",");
            for(int i=0; i<str.length; i++){
                result[i] = Integer.parseInt(str[i].replaceAll("\\s",""));
            }
        }

        return result;
    }

    private int [] occupyVacantCells(int[]cells){
        int [] newCells = new int[cells.length];
        for(int i=1; i<7; i++){
            newCells[i] = cells[i-1] == cells[i+1] ? 1 : 0;
        }

        return newCells;
    }

}

/***
Input: cells = [0,1,0,1,1,0,0,1], N = 7
Output: [0,0,1,1,0,0,0,0]
Explanation:
The following table summarizes the state of the prison on each day:
Day 0: [0, 1, 0, 1, 1, 0, 0, 1]
Day 1: [0, 1, 1, 0, 0, 0, 0, 0]
Day 2: [0, 0, 0, 0, 1, 1, 1, 0]
Day 3: [0, 1, 1, 0, 0, 1, 0, 0]
Day 4: [0, 0, 0, 0, 0, 1, 0, 0]
Day 5: [0, 1, 1, 1, 0, 1, 0, 0]
Day 6: [0, 0, 1, 0, 1, 1, 0, 0]
Day 7: [0, 0, 1, 1, 0, 0, 0, 0]

Input: cells = [1,0,0,1,0,0,1,0], N = 1000000000
Output: [0,0,1,1,1,1,1,0]
***/
