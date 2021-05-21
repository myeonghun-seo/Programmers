class Solution 
{
    public String solution(String s, int n) 
    {
        // 변수 선언
        String answer = "";
        char ch;
        
        // 시저 문자열 판단
        for(int i = 0; i < s.length(); i++)
        {
            // 문자 저장
            ch = s.charAt(i);
            
            // 문자가 공백이면 그냥 넘어감.
            if(ch == ' ')
                
                answer += ch;
            
            // 문자가 소문자이면 다음으로 들어감.
            else if(ch >= 'a' && ch <=  'z')
                
                // 수를 합했을 때, z값을 넘어가게 된다면, 26을 빼라. 아님말구.
                if(ch + n > 'z') answer += (char)(ch + n - 26);
                else answer += (char)((ch + n));
            
            // 문자가 대문자이면 다음으로 들어감.
            else if(ch >= 'A' && ch <= 'Z') 
                
                // 수를 합했을 떄, Z값을 넘어가게 된다면, 26을 빼라. 아님말구.
                if(ch + n > 'Z') answer += (char)(ch + n - 26);
                else answer += (char)((ch + n));
            
        }
        
        // 출력 테스트
        // System.out.println(answer);
        
        return answer;
    }
}
