import java.util.*;

class Solution 
{
    public int solution(int[] nums) 
    {
        // 변수 생성
        int answer = 0;
        boolean trigger = true;
        List<Integer> list = new ArrayList<>();
        
        // 모든 경우의 수를 리스트에 저장을 한다. 단, 겹치는 값 없이 저장.
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = i + 1; j < nums.length; j++)
            {
                for(int k = j + 1; k < nums.length; k++)
                {
                    list.add(nums[i] + nums[j] + nums[k]);
                }
                
            }
            
        }
        
        // 소수인지 카운트 해주는 for문
        for(int i = 0; i < list.size(); i++)
        {
            trigger = true;
            
            // 여기에서 Math.sqrt +1을 꼭 쓰도록 하자. 시간 초과 나기 싫다면 말이다.
            for(int j = 2; j < Math.sqrt(list.get(i)) + 1; j++)
            {
                if(list.get(i) % j == 0)
                {
                    trigger = false;
                    break;
                }
                
            }
            
            // 소수라면 카운트해주자.
            if(trigger)
            {
                answer++;
            }
            
        }
        
        // 값 리턴
        return answer;
    }
}
