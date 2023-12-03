class Solution {
    public int findKthLargest(int[] nums, int k) {
        return quickSort(nums, 0, nums.length - 1, k - 1);    
    }

    private int quickSort(int[] nums, int l, int r, int k) {
        if (l >= r) {
            return nums[k];
        }
        int i = l - 1, j = r + 1, x = nums[l];
        while (i < j) {
            do {
                i++;
            } while (nums[i] > x);
            do {
                j--;
            } while (nums[j] < x);
            if (i < j) {
                swap(nums, i, j);
            }
        }
        if (k <= j) {
            return quickSort(nums, l, j, k);
        } else {
            return quickSort(nums, j + 1, r, k);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}