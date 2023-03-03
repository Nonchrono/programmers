import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class answer016 {
    // LV.1 나누어 떨어지는 숫자 배열

    public int[] solution(int[] arr, int divisor) {
        Arrays.sort(arr); // 배열의 정렬
        List<String> ox = new ArrayList<>(); // 정답을 기록하기 위한 List 선언

        // 나누어 떨어지는 경우 List에 기록
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                ox.add(i, "yes");
            } else {
                ox.add(i, "");
            }
        }

        // "yes" 값을 가진 수 기록
        int cnt = Collections.frequency(ox, "yes");

        // "yes" 값을 가진 수만큼의 자릿수를 가진 answer 배열 선언
        // "yes"가 있는 경우 없는 경우 모두를 상정해서 answer를 나워서 선언한다
        int[] answer;

        if (cnt != 0) {
             answer = new int[cnt];

            for (int i = 0; i < answer.length; i++) {
                int idx = ox.indexOf("yes"); // "yes" 값을 가진 가장 빠른 인덱스

                answer[i] = arr[idx];
                ox.set(idx, ""); // "yes" 초기화
            }
        } else {
            answer = new int[1];

            answer[cnt] = -1;
        }
        return answer;
    }
}
