public class answer013 {
    // LV.1 두 정수 사이의 합

    public long solution(int a, int b) {
        long answer = 0;
        long sum = 0;

        if (a < b) {
            for (int i = a; i <= b; i++) {
                sum += i;
            }
        } else if (a > b) {
            for (int i = b; i <= a; i++) {
                sum += i;
            }
        } else {
            sum = a;
        }

        answer = sum;
        return answer;
    }
}
