class Solution 
{
    public String solution(int a, int b) 
    {
        // 변수 선언
        // 각 달의 날짜를 선언해주고 1월 1일이 금요일이기 때문에 0값인 목요일부터 시작한다.
        String answer = "";
        int[] month = {31, 29, 31, 30 ,31, 30, 31, 31, 30, 31 ,30 ,31};
        String[] yoEil = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int day = 0;
        
        // 현재 달의 -1만큼 모든 일수를 다 더해버리기
        for(int i = 0; i < a - 1; i++)
        {
            day += month[i];
        }
        
        // 현재 날짜까지 더하기
        day += b;
        
        // 날짜를 7로 나누면 현재 요일이 나온다.
        answer = yoEil[day % 7];
        
        return answer;
    }
}
