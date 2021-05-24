import java.util.*;

class Solution 
{
    public int solution(int[] nums) 
    {
        // 변수 선언
        int answer = 0;
        List<Integer> plist = new ArrayList<>();
        
        // 최대 n/2만큼의 값을 answer에 디폴트값으로 정해준다.
        answer = nums.length / 2;
        
        // 정렬
        Arrays.sort(nums);
        
        // 중복되는 값은 다 빼버리는 리스트 작성.
        for(int i = 0; i < nums.length; i++)
        {
             if(!plist.contains(nums[i]))
                 plist.add(nums[i]);
        }
        
        // 만약, 고유값이 n/2값보다 작다면 갱신해주기.
        if(answer > plist.size())
            answer = plist.size();
        
        return answer;
    }
}
