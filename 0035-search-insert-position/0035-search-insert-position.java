class Solution {
     public int searchInsert(int[] nums, int target) {
        int[] newarr = new int[nums.length + 1];
        int i,j;
        if (Arrays.stream(nums).anyMatch(t -> t == target)) {
            for ( j = 0; j < nums.length; j++) {
                if(nums[j]==target){
                    return j;
                }

            }
        }

        else {
            for (i = 0; i < nums.length; i++) {
                newarr[i] = nums[i];
            }
            newarr[nums.length] = target;
            Arrays.sort(newarr);

        for ( j = 0; j < newarr.length; j++) {
            if(newarr[j]==target){
                return j;
            }

        }

    }
        return 0;
    }
}