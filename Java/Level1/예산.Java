import java.util.*;

class Solution 
{
    public int solution(int[] d, int budget) 
    {
        int answer = 0;
        int temp;
        
        // 정렬하기 꼭 적어야 함!
        Arrays.sort(d);
        
        for(int i = 0; i < d.length; i++)
        {
            // 잔돈이 부족하다면 나가기
            if(budget < d[i])break;
            if(budget < 0)break;
            
            budget -= d[i];
            
            // 횟수 추가
            answer++;
        }
        
        return answer;
    }
}
