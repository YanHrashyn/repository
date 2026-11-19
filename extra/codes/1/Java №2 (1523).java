// https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/submissions/2198954385/

class Solution {
    public int countOdds(int low, int high) {
        return (high + 1) / 2 - low / 2;
    }
}
