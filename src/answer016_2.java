import java.util.Arrays;

public class answer016_2 {
    // LV.1 나누어 떨어지는 숫자 배열
    public int[] solution(int[] arr, int divisor) {
        int[] answer;
        int[] ox = new int[arr.length];
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                ox[cnt] = arr[i];
                cnt++;
            }
        }

        if (cnt > 0) {
            answer = new int[cnt];

            for (int i = 0; i < answer.length; i++) {
                answer[i] = ox[i];
            }
        } else {
            answer = new int[1];
            answer[0] = -1;
        }

        Arrays.sort(answer);

        return answer;
    }
}
