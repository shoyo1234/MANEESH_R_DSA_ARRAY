import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        // Map to store next greater element for each number in nums2
        Map<Integer, Integer> map = new HashMap<>();

        // Stack to maintain decreasing order
        Stack<Integer> stack = new Stack<>();

        // Traverse nums2 from right to left
        for (int i = nums2.length - 1; i >= 0; i--) {

            int current = nums2[i];

            // Remove all smaller or equal elements from stack
            while (!stack.isEmpty() && stack.peek() <= current) {
                stack.pop();
            }

            // If stack is empty, no greater element exists
            if (stack.isEmpty()) {
                map.put(current, -1);
            } else {
                // Top of stack is the next greater element
                map.put(current, stack.peek());
            }

            // Push current element into stack
            stack.push(current);
        }

        // Build result array for nums1 using the map
        int[] result = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.get(nums1[i]);
        }

        return result;
    }
}