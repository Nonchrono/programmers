public class Answer037 {
    // LV.1 최소 직사각형

    public static void main(String[] args) {
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int[][] sizes1 = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
        int[][] sizes2 = {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};

        Answer037 as = new Answer037();
        System.out.println(as.solution(sizes));
        System.out.println(as.solution(sizes1));
        System.out.println(as.solution(sizes2));
    }

    public int solution(int[][] sizes) {
        int answer = 0;
        int w_max = 0;
        int h_max = 0;

        for (int i = 0; i < sizes.length; i++) {
            // 작은 쪽이 가로가 되도록 설정
            if (sizes[i][0] > sizes[i][1]) {
                int tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }

            // 가로와 세로의 최대값을 저장
            if (sizes[i][0] > w_max) w_max = sizes[i][0];
            if (sizes[i][1] > h_max) h_max = sizes[i][1];
        }

        answer = w_max * h_max;
        return answer;
    }
}
