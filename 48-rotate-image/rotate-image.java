class Solution {
    public void rotate(int[][] matrix) {

        int row = matrix.length;
        int col = matrix[0].length;

        //Tranpose of matrix in-place
        for(int row_index = 0; row_index < row; row_index++){
            // (row_index+1) does not take the diagonal
            for(int col_index = row_index + 1; col_index < col; col_index++){
                int temp = matrix[row_index][col_index];
                matrix[row_index][col_index] = matrix[col_index][row_index];
                matrix[col_index][row_index] = temp;
            }
        }
        //Reverse the rows
        for(int row_index = 0; row_index < row; row_index++){
            int left = 0;
            int right = row - 1;
            while(left < right){
                int temp = matrix[row_index][left];
                matrix[row_index][left] = matrix[row_index][right];
                matrix[row_index][right] = temp;
                left++;
                right--;

            }
        }
        
    }
}