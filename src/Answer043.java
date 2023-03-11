public class Answer043 {
    // LV.1 크기가 작은 부분 문자열

    public static void main(String[] args) {
        String t = "3141592";
        String p = "271";

        String t1 = "500220839878";
        String p1 = "7";

        String t2 = "10203";
        String p2 = "15";

        Answer043 as = new Answer043();
        System.out.println(as.solution(t, p));
        System.out.println(as.solution(t1, p1));
        System.out.println(as.solution(t2, p2));
    }

    public int solution(String t, String p) {
        int answer = 0;
        int cnt = 0;

        for (int i = 0; i < t.length() - p.length() + 1; i++) {
            long tmp = Long.parseLong(t.substring(i, i + p.length()));

            if (tmp <= Long.parseLong(p)) answer++;
        }

        return answer;
    }
}
