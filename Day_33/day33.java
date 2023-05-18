class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j][i] == 1) {
                    return j;
                }
            }
        }
        return -1;
    }
}