class Solution {
    public int maxArea(int[] height) {
        // Left wall
        int left = 0;
        // Right wall
        int right = height.length - 1;
        // Maximum volume of water contained by the walls
        int maxVolume = 0;

        while(left < right){
            int width = right - left;
            int minimum_Height = Math.min(height[left], height[right]);
            int volume = minimum_Height * width;
            if(volume > maxVolume){
                maxVolume = volume;
            }
            if(height[left] > height[right]){
                right--;
            }
            else{
                left++;
            }
        }
        return maxVolume;
    }
}
/* left < right 
when left == right -> using same line twice container needs to walls,
when left > right negative width and pointer has crossed each other, meaning all possible pairs have already been considered
*/