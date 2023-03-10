import java.util.Arrays;

public class Answer041 {
    // LV.1 k번째 수

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        Answer041 as = new Answer041();
        System.out.println(Arrays.toString(as.solution(array, commands)));
    }

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            // commands[i][0]번째부터 commands[i][1]번째까지 저장할 배열 생성
            int[] tmp = new int[commands[i][1] - commands[i][0] + 1];
            int idx = 0;

            for (int j = commands[i][0] - 1; j <= commands[i][1] - 1; j++) {
                tmp[idx++] = array[j];
            }

            Arrays.sort(tmp);
            answer[i] = tmp[commands[i][2] - 1];
        }

        return answer;
    }
}
