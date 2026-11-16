
import java.util.Arrays;

class Solution {
    public int[] findErrorNums(int[] nums) {

        Arrays.sort(nums);

        int[] arr = new int[2];
        int n = nums.length;

        // Find duplicate
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                arr[0] = nums[i];
                break;
            }
        }

        // Find missing number
        int expected = 1;

        for (int i = 0; i < n; i++) {
            if (nums[i] == expected) {
                expected++;
            }
        }

        arr[1] = expected;

        return arr;
    }
}
