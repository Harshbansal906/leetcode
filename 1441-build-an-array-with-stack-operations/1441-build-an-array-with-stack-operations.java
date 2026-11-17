
class Solution {
    public List<String> buildArray(int[] target, int n) {

        List<String> arr = new ArrayList<>();

        int i = 0;

        for (int num = 1; num <= n; num++) {

            arr.add("Push");

            if (num == target[i]) {
                i++;
            }
            else {
                arr.add("Pop");
            }

            if (i == target.length) {
                break;
            }
        }

        return arr;
    }
}
