class Solution {
    public int removeDuplicates(int[] nums) {
       // int[] expectedNums = new int[nums.length];
        int j = 1;
        //expectedNums[0] = nums[0];
        if(nums.length == 1 ){
            return 1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < nums[i + 1]) {
               // expectedNums[j] = nums[i + 1];
                nums[j] = nums[i + 1];
                j++;
            }
            if (i + 1 == nums.length - 1) {
                break;
            }
        }
        // System.out.println("nums");
        // for (int i = 0; i < expectedNums.length; i++) {
        //     System.out.println(expectedNums[i]);
        //     nums[i]=expectedNums[i];
        // }

        for (int i = 0; i < nums.length; i++) {
             System.out.println(nums[i]);
         }
        return j;

    }
}