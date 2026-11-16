
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        int[] arr = new int[nums.length];

        for (int left = 0; left < nums.length; left++) {

            int count = 0;

            for (int i = 0; i < nums.length; i++) {

                if (nums[left] > nums[i]) {
                    count++;
                }
            }

            arr[left] = count;
        }

        return arr;
    }
}
