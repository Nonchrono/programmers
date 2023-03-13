public class Answer045 {
    // LV.1 푸드 파이트 대회

    public static void main(String[] args) {
        int[] food = {1, 3, 4, 6};
        int[] food1 = {1, 7, 1, 2};

        Answer045 as = new Answer045();
        System.out.println(as.solution(food));
        System.out.println(as.solution(food1));
    }

    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();
        StringBuilder tmp;

        for (int i = 1; i < food.length; i++) {
            // 두선수가 먹을 양 분배. 소수점 버림
            int half = food[i] / 2;

            for (int j = 0; j < half; j++) {
                answer.append(i);
            }
        }

        // 문자열 뒤집어서 담기 (원형도 뒤집힌다)
        tmp = new StringBuilder(answer.reverse());
        // 원형을 다시 뒤집고 0을 붙인 뒤 아까 담은 걸 붙이기
        answer = new StringBuilder(answer.reverse() + "0" + tmp);

        return answer.toString();
    }
}
