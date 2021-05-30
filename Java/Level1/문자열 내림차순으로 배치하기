import java.util.*;

class Solution 
{
    public String solution(String s) 
    {
        // 변수 생성
        String answer = "";
        char[] arr = new char[s.length()];
        
        // char로 문자 저장.
        for(int i = 0; i < s.length(); i++)
        {
            arr[i] = s.charAt(i);
        }
        
        // 배열 정렬.
        Arrays.sort(arr);
        
        // 역순으로 더해서 넣기.
        for(int i = arr.length - 1; i >= 0; i--)
        {
            answer += arr[i];
        }
        
        // 리턴값 주기.
        return answer;
    }
}
