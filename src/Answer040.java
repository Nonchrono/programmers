public class Answer040 {
    // LV.1 숫자 문자열과 영단어

    public static void main(String[] args) {
        String s = "one4seveneight";
        String s1 = "23four5six7";
        String s2 = "2three45sixseven";
        String s3 = "123";

        Answer040 as = new Answer040();
        System.out.println(as.solution(s));
        System.out.println(as.solution(s1));
        System.out.println(as.solution(s2));
        System.out.println(as.solution(s3));
    }

    public int solution(String s) {
        int answer = 0;
        String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < num.length; i++) {
            if (s.contains(num[i])) {
                s = s.replace(num[i], String.valueOf(i));
            }
        }

        answer = Integer.parseInt(s);
        return answer;
    }
}
