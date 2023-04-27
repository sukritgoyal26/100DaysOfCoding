class Solution {
    public int maxScore(int[] cardPoints, int k) {    
        if(cardPoints.length ==1){
            return cardPoints[0];
        }

        int[] arr = new int[cardPoints.length];
        arr[0]=cardPoints[0];

        for(int i =1; i < cardPoints.length ; i++ ){
            arr[i] = cardPoints[i]+arr[i-1];
        }

        if(k ==cardPoints.length ){
            return arr[cardPoints.length-1];
        }
        
        int l = cardPoints.length - 1 - k; 
        int max  = arr[cardPoints.length - 1]-arr[l];

        for(int i = 1 ; i<=k;i++ ){
            int sum = arr[cardPoints.length - 1] - arr[i+l] + arr[i-1];
            if(max<sum){
                max = sum;
            }
        }

        return max;

    }
}