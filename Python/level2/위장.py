def solution(clothes):
    
    answer = 0
    ctype = []
    temp = ()
    
    # 옷의 종류를 다 복사한다.
    for i in clothes :
        
        ctype.append(i[1])
        
    # 리스트 -> 튜플 -> 리스트로 바꾸어서 중복을 제거한다.
    # 튜플은 중복을 허락하지 않는다.
    ctype = (list(set(ctype)))
    
    # 기존 리스트를 개조한다.
    for i in range(0, len(ctype)) :
        
        temp = [ctype[i], 0]
        ctype[i] = list(temp)
    
    # 옷의 종류의 각 수를 확인한다.
    for i in range(len(ctype)) : 
        
        for j in clothes : 
            
            if j[1] == ctype[i][0] : 
                
                ctype[i][1] += 1
                
    # 옷의 종류가 아무것도 없다면 0을 넣어준다.
    if len(ctype) != 0 :
        
        answer = 1
    
    # 옷을 입지 않은 것까지 고려해서 +1 한다.
    for i in range(len(ctype)) : 
        
        answer *= ctype[i][1] + 1

    # 아무것도 입지 않으면 옷을 입지 않았기에 -1 한다.
    answer -= 1
    
    return answer
