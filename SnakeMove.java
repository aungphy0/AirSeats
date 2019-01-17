//snake move with the number

public class SnakeMove{

    public static void main(String[]args){

      int row = 9;
      int col = 9;
      int [][] arr = move(row,col);

      for(int i=0; i<row; i++){
        for(int j=0; j<col; j++){
          System.out.print(arr[i][j] + " ");
        }
        System.out.println();
      }

    }//main method

    static int [][] move(int row, int col){

        boolean flag = true;
        int count = 1;

        int [][] array = new int[row][col];

        for(int i=0; i<col; i++){

          if(flag == true){
              //row increment going down
              for(int j=0; j<row; j++){
                array[j][i] = count++;
              }
              flag = false;
          }else{
              //row decrement going up
              for(int k=row-1; k>=0; k--){
                array[k][i] = count++;
              }
              flag = true;
          }
        }//column increment
          return array;
    }//move method

}//end SnakeMove class
