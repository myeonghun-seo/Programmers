import java.util.*;

class Solution 
{
    public String[] solution(String[] strings, int n) 
    {
        // 변수 선언
        String[] answer = {};
        String temp;
        
        // 선택 정렬
        for(int i = 0; i < strings.length; i++)
        {
            for(int j = i + 1; j < strings.length; j++)
            {
                // 나보다 더 작은 놈을 만난다면 왼쪽으로 놓아주마.
                if(strings[i].charAt(n) > strings[j].charAt(n)
                  || (strings[i].charAt(n) == strings[j].charAt(n) && strings[i].compareTo(strings[j]) > 0))
                {
                    // 바꾸기
                    temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                }
                
            }
            
        }
        
        // 답안 넣어주기
        answer = strings;
        
        // 리턴값 주기
        return answer;
    }
}
