public class answer019 {
    // LV.1 제일 작은 수 제거하기

    public int[] solution(int[] arr) {
        // 배열의 길이가 1인 경우 -1 채우기. 그 외에는 배열 선언
        int[] answer = (arr.length != 1) ? new int[arr.length-1] : new int[]{-1};
        // 제일 작은 수
        int small = arr[0];
        // 제일 작은 수를 스킵하면 카운트 되지 않는 index
        int idx = 0;

        // Math.min()의 대체. 배열 최소값 구하기
        for (int i = 0; i < arr.length; i++) {
            if (small > arr[i]) small = arr[i];
        }

        // 최소값빼고 넣기
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != small) {
                answer[idx] = arr[i];
                idx++;
            } else {
                continue;
            }
        }

        return answer;
    }
}
