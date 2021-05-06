class Solution 
{
    public int[] solution(long n) 
    {
        int[] answer = {};
        int m = 0;
        long back = n;
        
        // 입력받은 숫자의 값의 크기를 잰다.
        while(n > 0)
        {
            n /= 10;
            m++;
        }
        
        // 백업함과 동시에, 값의 크기를 정한다.
        n = back;
        answer = new int[m];
        
        // 값을 넣는다. 물론 거꾸로 넣어지고 있다.
        for(int i = 0; i < m; i++)
        {
            answer[i] = (int)(n % 10);
            n /= 10;
        }
        
        return answer;
    }
}
