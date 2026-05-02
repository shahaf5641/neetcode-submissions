class Solution {
    public boolean isPalindrome(String s) {
        /*1. Clear the string
        2. 1 pointer from start and 2 pointer from end, while l<r*/


        StringBuilder filteredString = new StringBuilder();
        for (char c: s.toCharArray()) {
            if (Character.isLetter(c) || Character.isDigit(c))
                filteredString.append(Character.toLowerCase(c));   
        }

        int l = 0;
        int r = filteredString.length() -1;

        while (l<r) {
            if (filteredString.charAt(l) != filteredString.charAt(r)) return false;
            l+=1;
            r-=1;
        }
        return true;
    }
}
