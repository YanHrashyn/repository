// https://leetcode.com/problems/valid-anagram/description/

class Solution {
    public boolean isAnagram(String s, String t) {
        char sChar[]= s.toCharArray();
        char tChar[]= t.toCharArray();
        Arrays.sort(sChar);
        Arrays.sort(tChar);
        boolean areEqual = Arrays.equals(sChar, tChar);
        return areEqual;
    }
}
