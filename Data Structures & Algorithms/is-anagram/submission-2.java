class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        //Create hash
        HashMap<Character, Integer> countChars = new HashMap<>();
        //Add all chars of s to countChars
        for (char c : s.toCharArray())
        {
            countChars.put(c, countChars.getOrDefault(c, 0) + 1);
        }

        //Decrease from countChars chars from t
        for (char c : t.toCharArray())
        {
            if (countChars.containsKey(c))
            {
                countChars.put(c, countChars.get(c) - 1);
                if (countChars.get(c) < 0) return false;
            }
            else return false;
        }
        return true;

    }
}
