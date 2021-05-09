import java.util.*;

class Solution 
{
    public long solution(long n) 
    {
        long answer = 0;
        long tmp = n;
        long[] num;
        int cnt = 0;
        
        // 숫자의 길이를 구하자.
        while(n > 0)
        {
            n /= 10;
            cnt++;
        }
        
        n = tmp;
        num = new long[cnt];
        
        for(int i = 0; i < cnt; i++)
        {
            num[i] = n % 10;
            n /= 10;
        }
        
        // 배열을 정렬을 한다.
        Arrays.sort(num);
        
        // 값을 엔서에 반대로 넣어준다.
        for(int i = num.length - 1; i >= 0; i--)
        {
            if(i != num.length - 1) answer *= 10;
            answer += num[i];
        }
        
        return answer;
    }
}
