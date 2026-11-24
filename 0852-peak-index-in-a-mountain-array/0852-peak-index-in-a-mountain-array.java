class Solution {
    public int peakIndexInMountainArray(int[] nums) {
        int low = 1;                 // eta ekta mountain array tai peak kokhn o first ar last elemennt hobe na tai low 1 theke ar high last ghor chere suru hocche
        int high = nums.length - 2;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]) {
                return mid;
            }
            else if (nums[mid] < nums[mid+1] && nums[mid] > nums[mid-1]) {
                low = mid + 1;
            }
             else{
                high= mid - 1;
            }
        }
        return -1;
    }
}