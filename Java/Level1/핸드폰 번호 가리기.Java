class Solution 
{
    public String solution(String phone_number) 
    {
        String answer = "";
        
        for(int i = 0; i < phone_number.length(); i++)
        {
            // 뒤에 4자리 출력
            if(i >= phone_number.length() - 4)
            {
                //System.out.print(phone_number.charAt(i));
                answer += phone_number.charAt(i);
            }
            
            // 나머지 자리수는 모두 *을 출력
            else
            {
                //System.out.print("*");
                answer += "*";
            }
            
        }
        
        return answer;
    }
}
