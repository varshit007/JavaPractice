class sum1DArray {
    public int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        int sum = 0; 
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i]; 
            runningSum[i] = sum;
        }
        
        // for (int i = 0; i < nums.length; i++) {
        //     int sum = 0; 
        //     for (int j = 0; j <= i; j++) {
        //         sum += nums[j]; 
        //     }
        //     runningSum[i] = sum; 
        // }
        return runningSum; 
    }
}