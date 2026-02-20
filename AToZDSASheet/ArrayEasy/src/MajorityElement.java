import java.util.*;

public class MajorityElement {

    public static int majority(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int cnt = 0;

            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    cnt++;
                }
            }
            if (cnt > (nums.length / 2)) {
                return nums[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        MajorityElement sol = new MajorityElement();
        int ans = majority(nums);
        System.out.println(ans);
    }
}



