package offer;

public class offer_4_findNumberIn2DArray {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix != null && matrix.length > 0 && matrix[0].length > 0) {
            int row = 0;
            int col = matrix[0].length - 1;
            while (row < matrix.length && col >= 0) {
                if (matrix[row][col] == target)
                    return true;
                if (matrix[row][col] > target)
                    col--;
                else row++;
            }
            return false;
        }
        return false;
    }
}
