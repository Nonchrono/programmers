public class Answer046 {
    // LV.1 2016년

    public static void main(String[] args) {
        int a = 5;
        int b = 24;

        Answer046 as = new Answer046();
        System.out.println(as.solution(a, b));
    }

    public String solution(int a, int b) {
        String answer = "";
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        // 1일이 화요일이기 때문에 index 1 = FRI
        String[] day = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int sum = 0; // 일수 합계

        // 전달까지의 일수 합계
        for (int i = 0; i < a-1; i++) {
            sum += month[i];
        }

        // 일 더하기
        sum += b;

        answer = day[sum % 7];
        return answer;
    }
}
