package homework.h03;

// advanced
// https://leetcode.com/problems/reverse-integer/
public class T2 {
    public int reverse(int x) {
        int rev = 0;

        while (x != 0) {
            int digit = x % 10;
            int newRev = rev * 10 + digit;

            if ((newRev - digit) / 10 != rev) {
                return 0;
            }

            rev = newRev;
            x /= 10;
        }

        return rev;
    }
}
