class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] values = new int[2];
        for( int i = 0; i < nums.length; i++){
            int neededVal = target - nums[i];

            if( map.containsKey(neededVal)){
                values[0] = map.get(neededVal);
                values[1] = i;
                return values;
            } else {
                map.put(nums[i], i);
            }
        }
        return values;
    }
}
