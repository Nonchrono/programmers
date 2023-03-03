public class answer017 {
    // LV.1 휴대폰 번호 가리기
    
    public String solution(String phone_number) {
        String answer = "";
        int size = phone_number.length(); // 번호의 길이

        phone_number = phone_number.substring(size-4, size);

        for (int i = 0; i < size-4; i++) {
            phone_number = "*" + phone_number;
        }

        answer = phone_number;
        return answer;
    }
}
