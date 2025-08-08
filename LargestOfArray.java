Largest no.of array
--------------------------------------------------------
import java.util.Arrays.*;
class Solution {
    public static int largest(int[] arr) {
        // code here
        Arrays.sort(arr);
        int n=arr.length;
        return arr[n-1];
    }
}
