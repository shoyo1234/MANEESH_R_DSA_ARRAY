class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        Deque<Integer> store_index = new ArrayDeque<>();
        int[] result = new int[nums.length - k + 1];

        int index = 0;

        for(int i = 0; i < nums.length; i++){

            while(!store_index.isEmpty() && store_index.peekFirst() <= i - k){
                store_index.pollFirst();
            }

            while(!store_index.isEmpty() && nums[store_index.peekLast()] < nums[i])
            {
                store_index.pollLast();
            }
            store_index.offerLast(i);

            if(i >= k - 1) {
                result[index++] = nums[store_index.peekFirst()];
            }
        }
        return result;
    }
}