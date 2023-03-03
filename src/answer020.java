public class answer020 {
    // LV.1 없는 숫자 더하기

    public int solution(int[] numbers) {
        int answer = 0;
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // 45는 0~9까지 다 더한 수
        answer = 45 - sum;

        return answer;
    }
}
