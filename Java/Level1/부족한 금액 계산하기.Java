class Solution 
{
    public long solution(int price, int money, int count) 
    {
        // 변수 선언
        long answer = -1;
        long sum = 0;
        
        // 전체 돈의 합계의 for문
        for(int i = 1; i <= count; i++)
        {
            // price x i(횟수)
            sum += price * i;
        }
        
        // 어자피 전체보다 크기 떄문에 sum에서 money를 뺴는 것
        answer = sum - money > 0 ? sum - money : 0;
        
        // 리턴해줌
        return answer;
    }
}
