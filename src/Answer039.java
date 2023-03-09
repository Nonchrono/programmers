import java.util.Arrays;

public class Answer039 {
    // LV.1 문자열 내 맘대로 정렬하기

    public static void main(String[] args) {
        String[] strings = {"sun", "bed", "car"};
        int n = 1;

        String[] strings1 = {"abce", "abcd", "cdx"};
        int n1 = 2;

        String[] strings2 = {"aqqqbbc", "aqqqbbd", "aqqqbbbb"};
        int n2 = 5;

        Answer039 as = new Answer039();
        System.out.println(Arrays.toString(as.solution(strings, n)));
        System.out.println(Arrays.toString(as.solution(strings1, n1)));
        System.out.println(Arrays.toString(as.solution(strings2, n2)));
    }

    public String[] solution(String[] strings, int n) {
        String[] answer = strings.clone(); // 배열 복사
        char[] order = new char[answer.length]; // n번째 글자를 담기 위한 배열 선언

        // n번째 글자 담기
        for (int i = 0; i < answer.length; i++) {
            order[i] = answer[i].charAt(n);
        }

        // 정렬
        for (int i = 0; i < order.length; i++) {
            for (int j = i+1; j < order.length; j++) {
                if (order[i] > order[j]) {
                    char tmpChar = order[i];
                    order[i] = order[j];
                    order[j] = tmpChar;

                    String tmpStr = answer[i];
                    answer[i] = answer[j];
                    answer[j] = tmpStr;
                } else if (order[i] == order[j]) {
                    if (answer[i].compareTo(answer[j]) > 0) {
                        char tmp = order[i];
                        order[i] = order[j];
                        order[j] = tmp;

                        String tmp2 = answer[i];
                        answer[i] = answer[j];
                        answer[j] = tmp2;
                    }
                }
            }
        }
        return answer;
    }

    /*public String[] solution(String[] strings, int n) {
        String[] answer = strings.clone();
        Arrays.sort(answer, (a, b) -> {
            char c1 = a.charAt(n);
            char c2 = b.charAt(n);
            if (c1 == c2) {
                return a.compareTo(b);
            } else {
                return c1 - c2;
            }
        });
        return answer;
    }*/
}
