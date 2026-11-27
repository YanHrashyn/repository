package homework.h04;

// advanced
// https://leetcode.com/problems/integer-to-roman/
public class T2 {
  public int romanToInt(String s) {

    int ans = 0;

    for (int i = 0; i < s.length(); i++) {

      int num = 0;

      if ((i) == 'I') {
        num = 1;
      } else if (s.charAt(i) == 'V') {
        num = 5;
      } else if (s.charAt(i) == 'X') {
        num = 10;
      } else if (s.charAt(i) == 'L') {
        num = 50;
      } else if (s.charAt(i) == 'C') {
        num = 100;
      } else if (s.charAt(i) == 'D') {
        num = 500;
      } else if (s.charAt(i) == 'M') {
        num = 1000;
      }

      if (i + 1 < s.length()) {
        int next = 0;

        if (s.charAt(i + 1) == 'I') {
          next = 1;
        } else if (s.charAt(i + 1) == 'V') {
          next = 5;
        } else if (s.charAt(i + 1) == 'X') {
          next = 10;
        } else if (s.charAt(i + 1) == 'L') {
          next = 50;
        } else if (s.charAt(i + 1) == 'C') {
          next = 100;
        } else if (s.charAt(i + 1) == 'D') {
          next = 500;
        } else if (s.charAt(i + 1) == 'M') {
          next = 1000;
        }

        if (num < next) {
          ans = ans - num;
        } else {
          ans = ans + num;
        }
      } else {
        ans = ans + num;
      }
    }

    return ans;
  }
}
