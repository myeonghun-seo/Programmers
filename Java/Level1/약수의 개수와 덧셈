class Solution 
{
    public int solution(int left, int right) 
    {
        // 변수 선언
        int answer = 0;
        int count = 0;
        int ecnt = 0;
        
        // 약수 카운트
        for(int i = left; i <= right; i++)
        {
            ecnt = 0;
            
            for(int j = 1; j <= i; j++)
            {   
                if(i % j == 0) ecnt++;
            }
            
            if(ecnt % 2 == 0) count += i;
            else count -= i;
            
        }
        
        answer = count;
        
        // 답 리턴
        return answer;
    }
}
