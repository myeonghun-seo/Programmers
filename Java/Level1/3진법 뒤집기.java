class Solution 
{
    public int solution(int n) 
    {
        int answer = 0;
        String sam = "";
        int pow = 0;
        int a = 0;
        
        // 3진법으로 변환
        while(n>0)
        {
            sam += n % 3;
            n /= 3;
            
        }
        
        // 어자피 거꾸로 저장됨
        // System.out.println(sam);
        
        // 3진법으로 다시 변환
        for(int i = 0; i < sam.length(); i++)
        {
            pow = (int)Math.pow(3, sam.length() - i - 1);
            a = pow * Character.getNumericValue(sam.charAt(i));
            // System.out.println(a);
            // System.out.println("P"+Character.getNumericValue(sam.charAt(sam.length() - i - 1)));
            answer += a;
        }
        
        return answer;
    }
}
