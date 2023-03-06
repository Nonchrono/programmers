import java.util.Arrays;
import java.util.Collections;

public class answer024 {
    // LV.1 문자열 내림차순으로 배치하기

    public String s = "Zbcdefg";

    public String solution(String s) {
        String answer = "";
        String[] str = new String[s.length()];

        // 한글자씩 배열화. substring 대용
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            str[i] = String.valueOf(c);
        }

        // 역순으로 정렬
        Arrays.sort(str, Collections.reverseOrder());

        for (int i = 0; i < str.length; i++) {
            answer += str[i].charAt(0);
        }

        return answer;
    }
}
