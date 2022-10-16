class Solution {
    public int firstMissingPositive(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, 1);

        }
        int i;
        for (i = 1; i <= nums.length; i++) {
            if (map.get(i) == null) {
                break;
            }
        }
        return i;
        
    }
    }
