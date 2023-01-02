public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {

        if (nums.length == 0) {
            return 0;
        }

        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i] || target < nums[i]) {
                return i;
            }
            if (i == nums.length - 1) {
                return nums.length;
            }

        }
        return 0;
    }
}
