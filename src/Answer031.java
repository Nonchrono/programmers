import java.util.*;
import java.util.stream.Collectors;

public class Answer031 {
    // LV.1 같은 숫자는 싫어

    public static void main(String[] args) {
        int[] arr1 = {1,1,3,3,0,1,1};
        int[] arr2 = {4,4,4,3,3};

        Answer031 as = new Answer031();
        System.out.println(Arrays.toString(as.solution(arr1)));
        System.out.println(Arrays.toString(as.solution(arr2)));
    }

    // 모든 중복 제거
    /*
    public int[] solution(int[] arr) {
        List<Integer> list = Arrays.stream(arr).boxed().toList(); // List화
        list = list.stream().distinct().collect(Collectors.toList()); // 중복 제거

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
    */

    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            // 마지막 반복에서는 i+1이 배열의 크기를 벗어나기 때문에 조건에서 제외해준다.
            if (i != arr.length-1 && arr[i] == arr[i+1]) {
                continue;
            }
            list.add(arr[i]);
        }

        int[] answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}
