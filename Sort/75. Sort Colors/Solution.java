class Solution {
    public void sortColors(int[] nums) {
        for (int i = 0, j = 0, k = nums.length - 1; i <= k;) {
            if (nums[i] == 0) {
                swap(nums, i, j);
                i++;
                j++;
            } else if (nums[i] == 2) {
                swap(nums, i, k);
                k--;
            } else {
                i++;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}