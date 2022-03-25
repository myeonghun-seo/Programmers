def solution(participant, completion):
    answer = ''
    temp = ''
    
    participant.sort()
    completion.sort()
    
    for i in range(0, len(completion)) :
        if participant[i] != completion[i] :
            temp = participant[i]
            #print(temp)
            #print(participant[len(participant) - 1])
            break;
    
    if temp == '' : 
        answer = participant[len(participant) - 1]
    else :
        answer = temp
    
    return answer
