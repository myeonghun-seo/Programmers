def solution(array, commands):
    
    answer = []
    tmp = []
    
    # 커맨드의 크기만큼 초기화
    # tmp에 commands가 array를 필터링 할 것을 담아낸다.
    for i in range(len(commands)) :
        
        # tmp 초기화
        tmp = []
        
        # tmp에 담아내기
        for j in range(commands[i][1] - commands[i][0] + 1) :
            
            tmp.append(array[j + commands[i][0] -1 ])
    
        # tmp 정렬
        tmp.sort();
        
        # tmp 출력 테스트
        '''
        for j in range(len(tmp)) :

            print(tmp[j])

        print("\n")
        '''
        
        # 결과값 넣기
        answer.append(tmp[commands[i][2] - 1]);
    
    return answer
