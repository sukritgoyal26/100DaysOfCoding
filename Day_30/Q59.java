class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int num = 1;
        int top = 0;
        int bottom = n - 1;
        int right = n - 1;
        int left = 0;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                arr[top][i] = num;
                num++;
            }

            top++;

            for (int i = top; i <= bottom; i++) {
                arr[i][right] = num;
                num++;
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    arr[bottom][i] = num;
                    num++;
                }
                bottom--;

            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    arr[i][left] = num;
                    num++;
                }
                left++;
            }

        }
        return arr;
    }
}