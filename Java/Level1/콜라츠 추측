class Solution 
{
    public long solution(long num) 
    {
        long answer = -1;
        
        for(int i = 0; i < 500; i++)
        {
            if(num == 1)
            {    
                answer = i;
                break;
            }
            
            if(num % 2 == 0)
            {
                num /= 2;
            }
            else
            {
                num = (num * 3) + 1;
            }

        }
        
        return answer;
    }
}
