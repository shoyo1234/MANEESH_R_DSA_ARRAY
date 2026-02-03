class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        // Sum of Cards Taken from the left side
        int left_sum = 0;
        // Sum of Cards Taken from the right side
        int right_sum = 0;
        // Maximum sum from the cards 
        int maxSum;
        for(int i = 0; i < k; i++)
        {
            left_sum += cardPoints[i];
        }
        maxSum = left_sum;
        int right_index = n-1;
        for(int i = k-1; i >=0; i--){
            //Remove one card from left side
            left_sum = left_sum - cardPoints[i];
            // Add one card from the right 
            right_sum += cardPoints[right_index];
            right_index--;

            maxSum = Math.max(maxSum, left_sum+right_sum);
        }
        return maxSum;
        

    }
}