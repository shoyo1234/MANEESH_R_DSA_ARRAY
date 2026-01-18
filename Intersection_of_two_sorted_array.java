import java.util.*;
public class Intersection_of_two_sorted_array {
    public static void main(String[] args) {
        int arr1[] = {1,2,4,5,6};
        int arr2[] = {2,3,5,7};
        List<Integer> result = new ArrayList<>();
        // i -> Pointer for scanning arr1
        int i = 0;
        // j -> Pointer for scanning arr2
        int j = 0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                i++;  // Move i if arr[i] < arr[j]
            }else if(arr2[j] < arr1[i]){
                j++;  // Move i if arr[j] < arr[i]
            }else{
                result.add(arr1[i]);
                i++;
                j++;
            }
        }
        //Print the result 
        System.out.println(result);
    }
    
}
