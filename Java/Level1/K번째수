import java.util.*;

class Solution 
{
    public int[] solution(int[] array, int[][] commands) 
    {
        // 커맨드의 크기만큼 초기화
        int[] answer = new int[commands.length];
        int[] tmp = {};
        
        // tmp에 commands가 array를 필터링 할 것을 담아낸다.
        for(int i = 0; i < commands.length; i++)
        {
            // tmp 초기화
            tmp = new int[commands[i][1] - commands[i][0] + 1];
            
            // tmp에 담아내기
            for(int j = 0; j < commands[i][1] - commands[i][0] + 1; j++)
            {
                tmp[j] = array[j + commands[i][0] -1 ];
            }
            
            // tmp 정렬.
            Arrays.sort(tmp);
            
            // tmp 출력 테스트
            /*
            for(int j = 0; j < tmp.length; j++)
            {
                System.out.print(tmp[j]);
            }
            System.out.println();
            */
            
            answer[i] = tmp[commands[i][2] - 1];
            
        }
        
        
        
        //answer = as;
        
        return answer;
    }
}
