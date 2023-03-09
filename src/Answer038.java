import java.util.Arrays;

public class Answer038 {
    // LV.1 [1차] 비밀지도

    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};

        int m = 6;
        int[] arr3 = {46, 33, 33 ,22, 31, 50};
        int[] arr4 = {27 ,56, 19, 14, 14, 10};

        Answer038 as = new Answer038();
        System.out.println(Arrays.toString(as.solution(n, arr1, arr2)));
        System.out.println(Arrays.toString(as.solution(m, arr3, arr4)));
    }

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            // 2진수로 변환하여 앞쪽에 지워진 0을 채운다
            String s1 = toBinary(n, arr1[i]);
            String s2 = toBinary(n, arr2[i]);
            answer[i] = "";

            for (int j = 0; j < n; j++) {
                // 해당 자리가 1이면 #, 0이면 공백
                if (String.valueOf(s1.charAt(j)).equals("1") || String.valueOf(s2.charAt(j)).equals("1")) {
                    answer[i] += "#";
                } else {
                    answer[i] += " ";
                }
            }
        }

        return answer;
    }

    // 2진수로 변환하여 앞쪽에 지워진 0을 채우는 함수
    public String toBinary (int n, int a) {
        StringBuilder binary = new StringBuilder(Integer.toBinaryString(a));
        while (binary.length() < n) {
            binary.insert(0, "0");
        }
        return binary.toString();
    }
}
