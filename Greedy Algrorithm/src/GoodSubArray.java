import java.util.HashMap;
public class GoodSubArray {

    public static int maxSumSubArray(int[] nums, int k){
        int left = 0;
        int sum = 0;
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int right = 0; right < nums.length; right++){
            sum += nums[right];
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
            while(map.size() > k){
                sum -= nums[left];
                map.put(nums[left], map.get(nums[left]) - 1);
                if(map.get(nums[left]) == 0){
                    map.remove(nums[left]);
                }
                left++;
            }
            max = Math.max(max, sum);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,2,3,5,1,2,1,1};
        int k = 2;
        System.out.println(maxSumSubArray(nums, k));   
    }
}
