class Solution 
{
    public String solution(String s) 
    {
        // 변수 생성하기
        String answer = "";
        String ss = "";
        int count = 1;
        
        // 모든 문자를 소문자로 만들기
        ss= s.toLowerCase();
        
        // 문자 검사 
        for(int i = 0; i < ss.length(); i++)
        {
            // 공백이면 넘기기
            if(ss.charAt(i) == ' ')
            {
                answer += (char)(ss.charAt(i));
                // 초기화
                count = 0;      
            } 
            // 짝수번째이면 소문자 출력
            else if(count % 2 == 0)
            {
                answer += (char)(ss.charAt(i));
            }
            // 홀수번쨰이면 대문자 출력
            else
            {
                answer += (char)(ss.charAt(i)-32);
            }
            
            // 카운트 해주기
            count++;
        }
        
        // 리턴해주기
        return answer;
    }
}
