class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int max = a > b? a : b;
        int mim = a < b? a : b;
        long sum = 0;
        
        for(int i = mim; i <= max; i++)
        {
            sum += i;
        }
        answer = sum;
        
        return answer;
    }
}
