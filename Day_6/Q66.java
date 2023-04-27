class Solution {
    public int[] plusOne(int[] digits) {

        if(digits[digits.length-1]!=9){
            digits[digits.length-1]+=1;
            return digits;

        }
        
        else{
            int last = digits.length-1;
            while(last>=0){
                if(last!=0 && digits[last]==9){
                    digits[last]=0;
                    last-=1;
                }else if(last==0 && digits[last]==9){
                    int[] arr = new int[digits.length + 1];
                    arr[0]=1;
                    for(int i =1 ; i<arr.length ;i++ ){
                        arr[i]=0;
                    }
                    return arr;

                }else{
                    digits[last]+=1;
                    return digits;
                }
            }
        }
        return digits;
    }
}