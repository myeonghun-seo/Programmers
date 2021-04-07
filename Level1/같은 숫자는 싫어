import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        int[] temp2 = new int[arr.length];
        
        int temp = arr[0];
        int m = 0;
        
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] != temp)
            {
                temp2[m] = temp;
                m++;
                temp = arr[i];
            }
        }
        
        answer = new int[m+1];
        for(int i = 0; i < answer.length; i++)
            answer[i] = temp2[i];
        answer[m] = arr[arr.length-1];
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        // System.out.println("Hello Java");

        return answer;
    }
}
