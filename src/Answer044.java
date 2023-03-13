public class Answer044 {
    // LV.1 콜라 문제

    public static void main(String[] args) {
        int a = 2;
        int b = 1;
        int n = 20;

        int a1 = 3;
        int b1 = 1;
        int n1 = 20;

        int a2 = 3;
        int b2 = 2;
        int n2 = 20;

        Answer044 as = new Answer044();
        System.out.println(as.solution(a,b,n));
        System.out.println(as.solution(a1,b1,n1));
        System.out.println(as.solution(a2,b2,n2));
    }

    public int solution(int a, int b, int n) {
        int answer = 0;
        int sum = 0; // 합계
        int ext = 0; // 나머지

        while (n >= a) {
            // 빈병을 콜라로 바꾸기
            sum += (n / a) * b;

            // 나머지가 있다면 쟁여두기
            if (n % a != 0) {
                ext += (n % a);
            }

            // 바꾼 빈병만큼 줄이기
            n = (n / a) * b;

            // 쟁여둔 나머지를 합하기
            n += ext;
            ext = 0;
        }

        answer = sum;
        return answer;
    }
}
