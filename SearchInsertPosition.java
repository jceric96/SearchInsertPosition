public class SearchInsertPosition {
    // O(logn)
    public int searchInsert(int[] nums, int target) {
        int begin = 0;
        int end = nums.length - 1;
        while (begin <= end) {
            int mid = (begin + end) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                begin = mid + 1;
            }
        }
        return begin;
    }

    public static void main(String[] args) throws Exception {
        SearchInsertPosition search = new SearchInsertPosition();
        int[] nums = new int[] { 1, 3, 5, 6 };
        int num = 5;
        System.out.println(search.searchInsert(nums, num));
    }
}
