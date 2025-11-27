class Solution {
  public int solution(String number) {
    return number.codePoints().map(c -> (c -'0') % 9).sum() % 9;
  }
}

