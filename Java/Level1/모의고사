import java.util.*;

class Solution 
{
    public int[] solution(int[] answers) 
    {
        // 변수들 선언 
        // 찍는 학생들도 여기에 변수로 선언을 해주어야 한다.
        int[] answer = {};
        int[] p1 = {1, 2, 3, 4, 5};
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; 
        int[] pm = new int[]{0, 0, 0};
        int max = 1;
        List<Integer> dap = new ArrayList<Integer>(); 
        
        // 맞는 답안만 카운트 해주기!
        for(int i = 0; i < answers.length; i++)
        {

            if(answers[i] == p1[i % p1.length])
            {
                pm[0]++;
            }            
            if(answers[i] == p2[i % p2.length])
            {
                pm[1]++;
            }            
            if(answers[i] == p3[i % p3.length])
            {
                pm[2]++;
            }
        
        }
        
        // 카운트 출력 해보기
        // System.out.println(pm[0] + " " + pm[1] + " "+ pm[2]);
        
        // 가장 큰 값을 넣어주기
        for(int i = 0; i < pm.length; i++)
        {
            if(pm[max - 1] < pm[i])
                max = i + 1;
        }
        
        // 가장 큰 값 출력
        System.out.println(max);
        
        // 점수가 같은 사람도 리스트에 추가
        for(int i = 0; i < pm.length; i++)
        {
            if(pm[max - 1] == pm[i])
                dap.add(i + 1);
        }
        
        // 답안을 리스트와 같은 크기로 선언
        answer = new int[dap.size()];
        
        // 답안에 리스트의 내용을 옮겨적기
        for(int i = 0; i < dap.size(); i++)
        {
            answer[i] = dap.get(i);
        }
        
        // 출력 테스트
        // System.out.println(dap.get(0));
        
        return answer;
    }
}
