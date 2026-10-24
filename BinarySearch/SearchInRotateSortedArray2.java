class Solution {
    public boolean search(int[] nums, int target) {
        int first = 0;
        int last = nums.length - 1;
        while (first <= last) {
            int mid = first + (last - first) / 2;
            if (nums[mid] == target) {
                return true;
            }
            if (nums[first] == nums[mid] && nums[mid] == nums[last]) {
                first++;
                last--;
                continue;
            }
            if (nums[first] <= nums[mid]) {
                if (target >= nums[first] && target < nums[mid]) {
                    last = mid - 1;
                } else {
                    first = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[last]) {
                    first = mid + 1;
                } else {
                    last = mid - 1;
                }
            }
        }
        return false;
    }

}