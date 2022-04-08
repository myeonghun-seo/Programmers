def solution(numbers):
    
#     answer = ''
#     snumber = []
#     sn = []
    
#     # 모든 숫자를 1의 자릿수로 만든다.
#     for i in range(len(numbers)) : 
    
#         snumber.append([numbers[i], i])
        
#         # 1의 자릿수가 될 때까지 10으로 나눈다.
#         while snumber[i][0] >= 10:
            
#             if snumber[i][0] >= 10 : 
                
#                 snumber[i][0] /= 10
    
#     # # 출력 Test
#     # print(snumber)
    
#     # 역순으로 정렬해준다.
#     snumber.sort(reverse = True)
    
#     for i in range(len(snumber) - 1) : 
        
#         if int(snumber[i][0]) == int(snumber[i + 1][0]) :
            
#             if snumber[i][0] - int(snumber[i][0]) < int(snumber[i][0]) / 10 :
                
#                 temp = snumber[i]
#                 snumber[i] = snumber[i + 1]
#                 snumber[i + 1] = temp
    
#     # # 역순 출력 Test
#     # print(snumber)
    
#     for i in snumber : 
        
#         sn.append(i[1])
    
#     # 역순 정렬한 숫자를 문자열로 치환해서 문자열로 만든다.
#     for i in sn :
        
#         answer += str(numbers[i])
    
#     return answer

    # 초기 데이터 타입 알아보자
    print(type(numbers)) # List 구조
    print(type(numbers[0])) # List<int> 구조
    
    # List안의 값을 String 타입으로 변경하기
    # List<int> => List<String>
    # str => 문자열(String 타입)로 변경해주는 함수
    # list => list 구조 만들어주는 함수
    numbers = list(map(str, numbers))
    
    # 변경된 데이터 타입 조회하기
    print(type(numbers)) # List 구조
    print(type(numbers[0])) # List<String> 구조
    
    #  람다를 이용하여 정렬, numbers 변수에 들어가느 수자는 최대 1000까지이므로, 정렬을 위한 반복횟수는 최대 3자리수로 맞춤
    # 정렬을 위한 반복횟수는 최대 3자리수로 맞춤
    # 내림차순을 위해 reverse=True
    numbers.sort(key=lambda x: x * 3, reverse = True)
    
    return str(int(''.join(numbers)))
