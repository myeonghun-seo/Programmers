class Solution 
{
    public int[] solution(int[] lottos, int[] win_nums) 
    {
        // 변수 선언
        int[] answer = {};
        int count = 0;
        int zcount = 0;
        
        // 맞는 번호가 있는지 확인
        for(int i = 0; i < lottos.length; i++)
        {
            // 1대1로 맞는 번호가 있는지 확인
            for(int j = 0; j < win_nums.length; j++)
            {
                if(lottos[i] == win_nums[j])
                    count++;
            }
            // 알아보지 못하는 번호만 확인
            if(lottos[i] == 0)
                zcount++;
        }
        
        // 출력 테스트
        // System.out.println( ( 7 - count - zcount ) > 6 ? 6 : (7 - count - zcount) );
        // System.out.println( ( 7 - count ) > 6 ? 6 : (7 - count) );
        // System.out.println(count);
        // System.out.println(zcount);
        
        // 대입
        answer = new int[]{ ( 7 - count - zcount ) > 6 ? 6 : (7 - count - zcount), ( 7 - count ) > 6 ? 6 : (7 - count) };
        
        // 리턴값 주기
        return answer;
    }
    
}
