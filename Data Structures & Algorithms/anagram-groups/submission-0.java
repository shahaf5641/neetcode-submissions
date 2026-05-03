class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        /*
        Solution:
        Create HashMap<String, ArrayList<String>
        Iterate through string arrays, for each string, if sorted string in hashmap, add the value
        sort it and create hashmap with
        key:sorted string, value: original string
        */

        List<List<String>> res = new ArrayList<>();
        HashMap<String, ArrayList<String>> anagramsStrings = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String org = strs[i];
            char[] chars = org.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if (!anagramsStrings.containsKey(sorted)) {
                anagramsStrings.put(sorted, new ArrayList<>());
            }
            anagramsStrings.get(sorted).add(org);
        }

        for (ArrayList<String> list: anagramsStrings.values()) {
            res.add(list);
        }
        return res;
    }
}
