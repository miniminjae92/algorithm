import java.math.BigInteger;

class Solution {
  public int solution(String number) {
      BigInteger num = new BigInteger(number);
      return num.mod(BigInteger.valueOf(9)).intValue();
  }
}
