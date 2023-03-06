public class answer027 {
    //LV.1 부족한 금액 계산하기

    public static void main(String[] args) {
        int price = 3;
        int money = 20;
        int count = 4;

        answer027 as = new answer027();
        System.out.println(as.solution(price, money, count));
    }

    public long solution(int price, int money, int count) {
        long answer = 0;
        long sum = 0;

        for (int i = 1; i <= count; i++) {
            sum += ((long) price * i);
        }

        answer = (sum > money) ? sum - money : 0;

        return answer;
    }
}
