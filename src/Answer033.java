public class Answer033 {
    public static void main(String[] args) {
        // 이상한 문자 만들기

        String s = "try hello world";

        Answer033 as = new Answer033();
        System.out.println(as.solution(s));
    }

    public String solution(String s) {
        String answer = "";
        int idx = 0;

        for (int i = 0; i < s.length(); i++) {
            if (!s.substring(i, i+1).equals(" ")) {
                answer = (idx % 2 == 0) ? answer + s.substring(i, i+1).toUpperCase() : answer + s.substring(i, i+1).toLowerCase();
                idx++;
            } else {
                answer += " ";
                idx = 0;
            }
        }
        return answer;

        /*String[] list = s.split(" ");

        for (int i = 0; i < list.length; i++) {

            for (int j = 0; j < list[i].length(); j++) {
                if (j % 2 == 0) {
                    answer += list[i].substring(j, j+1).toUpperCase();
                } else {
                    answer += list[i].substring(j, j+1).toLowerCase();
                }
                System.out.println("answer : " + answer);
            }
            if (i < list.length-1) answer += " ";
        }*/
    }
}
