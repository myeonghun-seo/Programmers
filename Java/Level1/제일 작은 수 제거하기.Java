class Solution 
{
    public int[] solution(int[] arr) 
    {
        int[] answer = new int[ ( arr.length - 1 ) < 1 ? 1 : arr.length - 1];
        int min = 999;
        int m = 0;
        
        if(arr.length == 1) answer[0] = -1;
        else{
            
            for(int i = 0; i < arr.length; i++)
            {
                if(arr[i] < min)
                    min = arr[i];
            }


            for(int i = 0; i < arr.length; i++)
            {

                if(arr[i] == min)
                    continue;
                answer[m] = arr[i];
                m++;
            }
            
        }
        
        return answer;
    
    }
}
