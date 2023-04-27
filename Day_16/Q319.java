class Solution {
    public int bulbSwitch(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }

        if(n>1000){
            return (int)Math.sqrt(n);
        }
        boolean[] arr = new boolean[n + 1];
        Arrays.fill(arr, true);
        arr[0] = false;
        int count = 1;
        for (int i = 2; i < arr.length; i++) {
            for (int j = i; j < arr.length; j = j + i) {
                if (arr[j] == true) {
                    arr[j] = false;
                } else {
                    arr[j] = true;
                }
            }
            if (arr[i] == true) {
                count++;
            }
        }
        return count;
    }
}