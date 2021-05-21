class Solution 
{

    public int solution(int n) 
    {
        // 변수 선언
        int answer = 0;
        int cnt = 0;
        boolean temp = false;
        
        // 소수 찾아보기
        for(int i = 2; i < n+1; i++)
        {
            // 불랜드 초기화
            temp = true;
            
            // for문의 조건이 맞는지를 sysout해보기.
            // System.out.println(Math.sqrt(i));
            
            // 자기자신을 제외한 수를 모두 비교해서 나누어지는지 확인
            /* 요점 : 소수검사 시에는 자신의 수보다 root한 만큼만 검사하면 된다고 한다. */
            for(int j = 2; j <= Math.sqrt(i); j++)
            {
                
                if(i % j == 0)
                {
                    temp = false;
                    break;
                }
                
            }
            
            // 만약 소수라면
            if(temp)
            {
                // 출력 테스트 
                // System.out.println(i);
                cnt++;
            }   
            
        }
        
        // 답엔에 넣어주기
        answer = cnt;
        
        return answer;
    }
}
