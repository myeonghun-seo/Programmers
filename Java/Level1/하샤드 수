class Solution 
{
    public boolean solution(int x) 
    {
        boolean answer = true;
        int y = x;
        int sum = (y % 10);
        
        while(y>9)
        {
            y /= 10;
            sum += (y % 10);
        }
        
        answer = (x % sum == 0) ? true : false;
        
        return answer;
    }
    
}
