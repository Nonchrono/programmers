public class Answer035 {
    // LV.1 시저 암호

    public static void main(String[] args) {
        String s = "AB";
        String s1 = "z";
        String s2 = "a B z";

        int n = 1;
        int n1 = 1;
        int n2 = 4;

        Answer035 as = new Answer035();
        System.out.println(as.solution(s, n));
        System.out.println(as.solution(s1, n1));
        System.out.println(as.solution(s2, n2));
    }

    public String solution(String s, int n) {
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 65 && c <= 90) { // 대문자일 때
                c += n;

                if (c > 90) {
                    c -= 26;
                }
            } else if (c >= 97 && c <= 122) { // 소문자일 때
                c += n;

                if (c > 122) {
                    c-= 26;
                }
            }

            answer += String.valueOf(c);
        }

        return answer;
    }
}
