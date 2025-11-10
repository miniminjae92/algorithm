class Solution {
    public String solution(String code) {
        int mode = 0;
        String ret = "";
        StringBuilder sb = new StringBuilder();
        for (int idx = 0; idx < code.length(); idx++) {
            if (mode == 0) {
                if (code.charAt(idx) == '1') {
                    mode = 1;
                } else {
                    if (idx % 2 == 0) {
                        sb.append(code.charAt(idx));
                    }
                }
            } else {
                if (code.charAt(idx) == '1') {
                    mode = 0;
                } else {
                    if (idx % 2 != 0) {
                        sb.append(code.charAt(idx));
                    }
                } 
            }
        }
        if (sb.toString().isBlank()) {
            return "EMPTY";
        }
        return sb.toString();
    }
}
