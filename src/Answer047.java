import java.util.ArrayList;
import java.util.List;

public class Answer047 {
    // LV.1 폰켓몬

    public static void main(String[] args) {
        int[] nums = {3,1,2,3};
        int[] nums1 = {3,3,3,2,2,4};
        int[] nums2 = {3,3,3,2,2,2};

        Answer047 as = new Answer047();
        System.out.println(as.solution(nums));
        System.out.println(as.solution(nums1));
        System.out.println(as.solution(nums2));
    }

    public int solution(int[] nums) {
        int answer = 0;
        int cnt = 0;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (!list.contains(nums[i])) {
                list.add(nums[i]);
                cnt++;

                if (list.size() == (nums.length / 2)) break;
            }
        }

        answer = cnt;
        return answer;
    }
}
