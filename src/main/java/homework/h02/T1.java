package homework.h02;

import java.math.BigInteger;

// base
// https://leetcode.com/problems/add-binary/

public class T1 {
  public String addBinary(String a, String b) {
    return new BigInteger(a, 2).add(new BigInteger(b, 2)).toString(2);
  }
}
