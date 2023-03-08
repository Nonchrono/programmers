import java.util.Arrays;

public class Answer034 {
    // LV.1 예산

    public static void main(String[] args) {
        int[] d = {1,3,2,5,4};
        int budget = 9;

        int[] d2 = {2,2,3,3};
        int budget2 = 10;

        Answer034 as = new Answer034();
        System.out.println(as.solution(d, budget));
        System.out.println(as.solution(d2, budget2));
    }

    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        int i = 0;

        while (i < d.length && budget >= d[i]) {
            budget -= d[i];
            i++;
        }

        answer = i;
        return answer;
    }
}
