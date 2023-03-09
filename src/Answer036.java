import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Answer036 {
    // LV.1 삼총사

    public static void main(String[] args) {
        int[] number = {-2, 3, 0, 2, -5};
        int[] number1 = {-3, -2, -1, 0, 1, 2, 3};
        int[] number2 = {-1, 1, -1, 1};

        Answer036 as = new Answer036();
        System.out.println(as.solution(number));
        System.out.println(as.solution(number1));
        System.out.println(as.solution(number2));
    }

    public int solution(int[] number) {
        int answer = 0;
        int cnt = 0;
        // List<Integer> list = new ArrayList<>(Arrays.stream(number).boxed().toList());
        List<Integer> list = new ArrayList<>();
        for (int i : number) {
            list.add(i);
        }

        while (true) {
            int i = 0;

            for (int j = 0; j < list.size(); j++) {
                if (i == j) continue;
                for (int k = 0; k < list.size(); k++) {
                    if (j == k || i == k) continue;
                    if (list.get(i) + list.get(j) + list.get(k) == 0) {
                        cnt++;
                    }
                }
            }
            if (list.size() == 3) break;
            list.remove(i);
        }

        answer = cnt / 2;
        return answer;
    }
}
