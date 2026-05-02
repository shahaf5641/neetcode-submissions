class Solution {
    public int[] twoSum(int[] nums, int target) {
        /*
        Brute force: 2 loops

        cur + x = target. -> x = target - cur

        Optimal:
        HashMap -> key: index, value = target - cur
        4 0
        3 1
        2 2
        1 3
        */

        //Build the map
        HashMap<Integer, Integer> targetMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            targetMap.put(target - nums[i], i);
        }
        int[] res = new int[2];

        for (int i = 0; i < nums.length; i++) {
            if (targetMap.containsKey(nums[i]) && i!=targetMap.get(nums[i]))
            {
                res[0] = i;
                res[1] = targetMap.get(nums[i]);
                return res;
            }
        }
        return res;
    }
}
