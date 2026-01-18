class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int max_altitude = 0; // store the maximum altitude
        for(int i = 0; i < n; i++){
            // calculate current altitude by adding previous gain
            if(i > 0){
                gain[i] = gain[i-1] + gain[i];
            }
            if(gain[i] > max_altitude){
                max_altitude = gain[i];
            }
        }
        // return the highest altitude reached
        return max_altitude;
        
    }
}