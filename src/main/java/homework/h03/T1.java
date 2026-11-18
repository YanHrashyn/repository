package homework.h03;

// base
// https://leetcode.com/problems/roman-to-integer/
public class T1 {
    public int romanToInt(String s) {
        int n = s.length();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == 'I') nums[i] = 1;
            else if (c == 'V') nums[i] = 5;
            else if (c == 'X') nums[i] = 10;
            else if (c == 'L') nums[i] = 50;
            else if (c == 'C') nums[i] = 100;
            else if (c == 'D') nums[i] = 500;
            else if (c == 'M') nums[i] = 1000;
        }

        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                sum -= nums[i];
            } else {
                sum += nums[i];
            }
        }

        return sum + nums[n - 1];
    }
}
