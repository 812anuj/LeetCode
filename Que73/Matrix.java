package LeetCode.Que73;
//73. Set Matrix Zeroes
public class Matrix {
    public static void main(String args []){
        int[][] grid ={
            {1,1,1},
            {1,0,1},
            {1,1,1}};
        Matrix obj = new Matrix();
        obj.setZeros(grid);
        
            for(int[] row : grid ){
                for(int i : row){
                    System.out.print( i +" ");
            
                }
                System.out.println();
            }

    }

    public void setZeros(int[][] matrix){
        int m = matrix.length; //length of row
        int n = matrix[0].length; //length of col
 
        Boolean isfristRowZero = false ;
        Boolean isfristColZero = false ;

        //frist row and column
        for(int j = 0 ; j < n ; j++){
            if(matrix[0][j] == 0){
                isfristRowZero = true;
                break;
            }
        }
        for(int i = 0 ; i < m ; i++){
            if(matrix[i][0] == 0){
                isfristColZero = true;
                break;
            }
        }

       //set marker
       for(int i = 1; i< m; i++){
        for(int j = 1; j< n; j++){
           if( matrix[i][j] == 0){ 
            matrix[0][j] = 0;//////markers
            matrix[i][0] = 0;//////
            }
        }
        }
       
       //Zero rows and columns based on markers
        for(int i = 1; i< m; i++){
        for(int j = 1; j< n; j++){
            if( matrix[0][j] == 0 || matrix[i][0] == 0){
                matrix[i][j] = 0 ;
            }
        }
       } 


       //Zero the first row if needed
       if(isfristRowZero){
        for(int j = 0; j< n; j++){
            matrix[0][j] = 0 ;
        }
       }
       //Zero the first column if needed
       if(isfristColZero){
        for(int i = 0; i < m ; i++){
            matrix[i][0] = 0 ;
        }
       }

    }
    
}
