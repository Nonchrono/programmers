public class answer014 {
    // LV.1 콜라츠 추측

    public int solution(int num) {
        int answer = 0;
        int count = 0;

        while (num != 1) {
            if (num % 2 == 0) {
                num /= 2;
            } else if (num % 2 == 1) {
                num = num * 3 + 1;
            }
            count++;

            if (count > 500) {
                answer = -1;
                break;
            } else {
                answer = count;
            }
        }

        return answer;
    }
}
