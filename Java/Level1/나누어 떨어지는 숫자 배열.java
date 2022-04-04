import java.util.*;

class Solution 
{
    public int[] solution(int[] arr, int divisor) 
    {
        int[] answer = {};
        int m = 0;
        
        // 배열의 길이 지정
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] % divisor == 0) m++;
        }
        
         System.out.println(m);
        
        if(m == 0)
        {
            answer = new int[]{-1};
            return answer;
        }
        
        answer = new int[m];
        m = 0;
        
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] % divisor == 0) 
            {
                answer[m] = arr[i];
                m++;
            }
        }
        Arrays.sort(answer);
        
        return answer;
    }
}
