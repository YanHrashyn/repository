package homework.h05;

// base
// https://leetcode.com/problems/longest-common-prefix/
public class T1 {
  public String longestCommonPrefix(String[] strs) {
    String first = strs[0];
    String last = strs[strs.length - 1];
    int i = 0;
    while (i < first.length() && i < last.length()) {
      if (first.charAt(i) != last.charAt(i)) {
        break;
      }
      i++;
    }
    return first.substring(0, i);
  }
}
