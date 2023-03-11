import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Answer042 {
    // 두 개 뽑아서 더하기

    public static void main(String[] args) {
        int[] numbers = {2,1,3,4,1};
        int[] numbers1 = {5,0,2,7};

        Answer042 as = new Answer042();
        System.out.println(Arrays.toString(as.solution(numbers)));
        System.out.println(Arrays.toString(as.solution(numbers1)));
    }

    public int[] solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                int k = numbers[i] + numbers[j];

                if (!list.contains(k)) {
                    list.add(k);
                }
            }
        }

        int[] answer = new int[list.size()];
        int idx = 0;

        for (int i : list) {
            answer[idx++] = i;
        }

        Arrays.sort(answer);

        return answer;
    }
}
