class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.size(); i++) {

            int sum = 0;

            for (int j = i; j < nums.size() && j < i + r; j++) {

                sum += nums.get(j);

                int length = j - i + 1;

                if (length >= l && sum > 0) {
                    min = Math.min(min, sum);
                }
            }
        }

        if (min == Integer.MAX_VALUE) {
            return -1;
        }

        return min;
    }
}