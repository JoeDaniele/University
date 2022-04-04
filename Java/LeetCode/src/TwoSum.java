public class TwoSum {
    public static void main(String[] args) {

        int[] nums ={2,7,11,15};

        twoSum(nums, 9);

    }

    public static int[] twoSum(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                int complement = target - nums[i];

                if (nums[j] == complement){
                    return new int[]{ i, j};
                }
            }
        }

        throw new IllegalStateException("No pair found.");
    }

}