public class answer012 {
    // LV.1 하샤드 수

    public boolean solution(int x) {
        boolean answer = true;

        int xCopy = x; // 배열에 담을 때 쓸 매개변수의 복사본
        String xString = String.valueOf(x); // 자릿수를 알아내기 위한 문자열화
        int size = xString.length(); // 매개변수의 자릿수
        int[] xArray = new int[size]; // 각 자리의 숫자를 저장할 배열
        int sum = 0; // 합계

        for (int i = 0; i < size; i++) {
            // 각 자리의 숫자를 배열에 담기
            xArray[i] = xCopy % 10;
            xCopy /= 10;

            // 모든 배열의 합계를 구해서 x에 나눠서 나머지가 0인지 체크
            if (i == size-1) {
                for (int j = 0; j < size; j++) {
                    sum += xArray[j];
                }

                if (x % sum != 0) {
                    answer = false;
                }
            }
        }

        return answer;
    }
}
