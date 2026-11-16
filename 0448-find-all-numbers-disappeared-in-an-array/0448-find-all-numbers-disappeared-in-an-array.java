
import java.util.*;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        Arrays.sort(nums);

        List<Integer> arr = new ArrayList<>();

        int j = 1;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == j) {
                j++;
            }
            else if (nums[i] > j) {
                arr.add(j);
                j++;
                i--;
            }
        }

        while (j <= nums.length) {
            arr.add(j);
            j++;
        }

        return arr;
    }
}
