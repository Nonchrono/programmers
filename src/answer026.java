public class answer026 {
    // LV.1 문자열 다루기 기본

    public boolean solution(String s) {
        boolean answer = true;

        if (s.length() == 4 || s.length() == 6) {
            for (int i = 0; i < s.length(); i++) {
                if (s.substring(i, i+1).matches("^[0-9]*$")) {
                    answer = true;
                } else {
                    return false;
                }
            }
        } else {
            return false;
        }

        return answer;
    }
}
