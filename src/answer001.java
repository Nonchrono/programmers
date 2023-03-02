public class answer001 {
    // LV.1 자릿수 더하기

    public int solution(int n) {
        int answer = 0;
        int i = 1;
        int size = (int) (Math.log10(n) + 1);
        /* (int) Math.log10(~) + 1 자리수를 구하는 함수
            log10은 10의 몇 승인지 구하는 함수이다.
            1은 10의 0승, 10은 10의 1승, 50은 10의 1.69승, 100은 10의 2승
            거기에 소수점을 없애고 1을 더해주면 자리수가 된다.
         */

        // 주어진 수의 자릿수 - 1까지 반복
        while ((int) (Math.log10(i) + 1) != size) {
            answer += (n % (i * 10)) / i;
            i *= 10;
        }

        // 주어진 수의 첫자리 수 더하기
        answer += n / i;

        return answer;
    }
}
