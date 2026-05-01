class Solution {
    public boolean hasDuplicate(int[] nums) {
        /*Naive solution:
        לולאה מקוננת, מעבר על כל איבר, על כל הרשימה

        פיתרון טוב:
        HASHMAP
        */
        
        HashSet<Integer> seen = new HashSet<>();
        for (int num: nums)
        {
            if (seen.contains(num)) return true;
            seen.add(num);
        }
        return false;
    }
}