public class DescendingOrder {

    public static int DescOrderBinary(int[] nums, int target){
        int low = 0;
        int high = nums.length-1;

        while(low <= high){
            int mid = (low+high)/2;

            if(nums[mid] > target){
                low = mid + 1;
            } else if (nums[mid] < target) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] nums = {99, 88, 77, 45, 40, 39, 30, 20, 12};
        int target = 39;
//        DescendingOrder sol = new DescendingOrder();
        System.out.println(DescOrderBinary(nums, target));
    }
}
