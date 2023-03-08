public class Answer032 {
    // LV.1 3진법 뒤집기

    public static void main(String[] args) {
        int n = 45;
        int m = 125;

        Answer032 as = new Answer032();
        System.out.println(as.solution(n));
        System.out.println(as.solution(m));
    }

    public int solution(int n) {
        int answer = 0;
        StringBuilder ternary = new StringBuilder();

        while (true) {
            if (n < 3) {
                ternary.append(n);
                break;
            }

            ternary.append(n % 3);
            n /= 3;
        }

        // 3진법 -> 10진법
        answer = Integer.parseInt(String.valueOf(ternary), 3);
        return answer;
    }
}
