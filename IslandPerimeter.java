class Solution {
    public int islandPerimeter(int[][] grid) {

        int count = 0;

        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){

                if(grid[i][j] == 1){
                    count += 4;

                      if(grid.length > 1){
                            if(i == 0){
                                if(grid[i+1][j] == 1) count -= 1;
                            }else if(i == grid.length-1){
                                if(grid[i-1][j] == 1) count -= 1;
                            }else{
                                if(grid[i-1][j] == 1) count -= 1;
                                if(grid[i+1][j] == 1) count -= 1;
                            }
                      }

                      if(grid[i].length > 1){
                            if(j == 0){
                                if(grid[i][j+1] == 1) count -= 1;
                            }else if(j == grid[i].length-1){
                                if(grid[i][j-1] == 1) count -= 1;
                            }else{
                                if(grid[i][j-1] == 1) count -= 1;
                                if(grid[i][j+1] == 1) count -= 1;
                            }
                      }

                }

            }
        }

        return count;
    }
}
