def solution(answers):
    

    # 변수들 선언 
    # 찍는 학생들도 여기에 변수로 선언을 해주어야 한다.
    answer = []
    p1 = [1, 2, 3, 4, 5]
    p2 = [2, 1, 2, 3, 2, 4, 2, 5]
    p3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    pm = [0, 0, 0]
    max = 1
    dap = []
    
    # 맞는 답안만 카운트 해주기!
    for i in range(len(answers)) :

        if answers[i] == p1[i % len(p1)] :
            
            pm[0] += 1;
        
        if answers[i] == p2[i % len(p2)] :
        
            pm[1] += 1;
                    
        if answers[i] == p3[i % len(p3)] :
        
            pm[2] += 1;
        
        
    # 카운트 출력 해보기
    # System.out.println(pm[0] + " " + pm[1] + " "+ pm[2]);

    # 가장 큰 값을 넣어주기
    for i in range(len(pm)) :
    
        if pm[max - 1] < pm[i] :
            max = i + 1;

    # 가장 큰 값 출력
    print(max);

    # 점수가 같은 사람도 리스트에 추가
    for i in range(len(pm)) :
    
        if pm[max - 1] == pm[i] :
            
            dap.append(i + 1)
            

    # 답안을 리스트와 같은 크기로 선언
    answer = [None] * len(dap)

    # 답안에 리스트의 내용을 옮겨적기
    for i in range(len(dap)) :
    
        answer[i] = dap[i]
    

    # 출력 테스트
    # print(dap[0])

    return answer
