import java.util.Arrays;

public class repeatandmising {
    

public int[] repeatedNumber(final int[] nums) {
    Arrays.sort(nums); // Sort the array in ascending order
    int[] ans = new int[2]; // Create an array to store the result [repeated number, missing number]
    int count = 1; // This variable will help us track the expected number from 1 to n
    
    for(int i = 0; i < nums.length; i++) {
        // Check if the current number is the same as the next number
        if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
            ans[0] = nums[i]; // Store the repeated number
        }
        
        // Check for the missing number
        if (nums[i] == count) {
            // If the current number is what we expect (count), move to the next expected number
            count++;
        } else if (nums[i] > count) {
            // If the current number is greater than what we expect, the expected number (count) is missing
            ans[1] = count;
            // Move to the next expected number
            count++;
        }
    }
    
    // If we finished the loop and didn't find the missing number, it must be the last number
    if (ans[1] == 0) {
        ans[1] = count;
    }
    
    return ans; // Return the result array containing [repeated number, missing number]
}

    public static void main(String args[]){
        int nums[]={1,2,2,4};
        System.out.println(Arrays.toString(repeatedNumber(nums)));
    }
    
}
