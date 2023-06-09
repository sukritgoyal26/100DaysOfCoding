//For printing the subarray indexes  

int nums[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
int sum = 0;
int max = Integer.MIN_VALUE;
int start = 0;
int end = 0;
for (int i = 0; i < nums.length; i++) {
    sum += nums[i];
    if (sum > max) {
        max = sum;
        end = i;
    }
    if (sum < 0) {
        sum = 0;
        start = i + 1;
    }
}
System.out.println("Starts at : " + start + " and ends at : " + end + " value : " + max);