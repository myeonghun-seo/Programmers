class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int max = n > m ? n : m;
        int min = n < m ? n : m;
        
        for(int i = max; i > 0; i--)
        {
            if(n % i == 0 && m % i == 0)
            {
                // 최대공약수와 최소공배수 넣기
                // 최대공약수는 그냥 넣으면 됨
                answer[0] = i;
                // 최소공배수는 최대공약수로 나눈 몫과 곱해서 넣어야 함.
                answer[1] = i * (max / i) * (min / i);
                break;
            }
            
        }
        
        return answer;
    }
}
