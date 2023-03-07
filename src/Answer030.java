import java.math.BigInteger;
import java.util.Arrays;

public class Answer030 {
    // LV.1 최대공약수와 최소공배수

    public static void main(String[] args) {
        int n = 3;
        int m = 12;

        Answer030 as = new Answer030();
        System.out.println(Arrays.toString(as.solution(n, m)));
    }

    public int[] solution(int n, int m) {
        BigInteger b1 = BigInteger.valueOf(n);
        BigInteger b2 = BigInteger.valueOf(m);
        BigInteger gcd = b1.gcd(b2); // 최대공약수
        int lcm = (n * m) / gcd.intValue(); // 두 수의 곱 / 최대공약수 = 최소공배수

        int[] answer = {gcd.intValue(), lcm};
        return answer;
    }
}
