class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    arr.add(i);
                    arr.add(j);
                }
            }
        }
        for (int i = 0; i < arr.size(); i = i + 2) {
            edit(matrix, arr.get(i + 1), arr.get(i));
        }

    }

    public static void edit(int matrix[][], int cn, int rn) {
        for (int i = 0; i < matrix[0].length; i++) {
            matrix[rn][i] = 0;
        }
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][cn] = 0;
        }
    }
}