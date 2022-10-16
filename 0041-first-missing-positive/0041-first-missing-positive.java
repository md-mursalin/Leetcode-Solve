class Solution {
   public int firstMissingPositive(int[] nums) {
        int len = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        int i;
        for (i = 0; i < len; i++) {
            map.put(nums[i], 1);
        }


        for (i = 1; i <=len; i++) {
            if (map.get(i) == null) {
                break;
            }
        }
        return i;


    }
    }
