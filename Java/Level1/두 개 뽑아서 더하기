import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        // 변수 선언
        int[] answer = {};
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> alist = new ArrayList<Integer>();
        
        // 모든 경우의 수의 합을 만듬.
        for(int i = 0; i < numbers.length; i++)
        {
            for(int j = 0; j < numbers.length; j++)
            {
                if( i == j ) continue;
                list.add(numbers[i] + numbers[j]);
            }
            
        }
        
        // 리스트 정렬
        Collections.sort(list);
        
        // 출력 테스트
        /*
        Iterator<Integer> it = list.iterator();
        while(it.hasNext())
        {
            Integer name = (Integer) it.next();
            System.out.print(name + " ");
        }
        */
        
        // 중복되는 숫자 제거
        for(int i = 0; i < list.size(); i++)
        {
            if(!alist.contains(list.get(i)))
                alist.add(list.get(i));
        }
        
        // answer에 alist 대입하기.
        answer = new int[alist.size()];
        
        for(int i = 0; i < alist.size(); i++)
        {
            answer[i] = alist.get(i);
        }
        
        return answer;
    }
    
}
