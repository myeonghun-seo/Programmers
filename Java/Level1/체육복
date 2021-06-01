class Solution 
{
    public int solution(int n, int[] lost, int[] reserve) 
    {
        // 변수 생성
        int answer = 0;
        int[] all = new int[n];
        
        // 여분의 체육복 학생은 ++시켜서 1로 만들어 준다.
        for(int i : reserve)
            all[i - 1]++;
        
        // 잃어버린 학생은 --시켜서 -1로 만들어 준다.
        for(int i : lost)
            all[i - 1]--;
        
        // 잃어버린 학생이 여분의 체육복을 노린다!
        for(int i = 0; i < all.length; i++)
        {
            // 잃어버린 학생의 턴!
            if(all[i] < 0)
            {
                // 잃어버린 학생이 끝번호가 아니고, 뒷 번호 학생이 0이 아니라면 훔쳐라.
                if(i != all.length - 1 && all[i + 1] > 0)
                {
                    all[i]++;
                    all[i + 1]--;
                }
                
                // 잃어버린 학생이 첫번호가 아니고, 앞 번호 학생이 0이 아니라면 훔쳐라.
                else if(i != 0 && all[i - 1] > 0)
                {
                    all[i]++;
                    all[i - 1]--;
                }
                
            }
            
        }
        
        // answer에 답을 음수가 아닌 학생만 넣어주도록 하자.
        for(int i = 0; i < all.length; i++)
            if(!(all[i] < 0)) answer++;
        
        // 리턴값 먹이기.
        return answer;
    }
    
}
