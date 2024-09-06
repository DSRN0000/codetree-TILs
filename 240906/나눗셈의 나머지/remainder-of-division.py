# a에 a//b 계속 저장, a -> 1이하될때까지
# 나머지 ** 횟수 -> 출력

arr = [0] * 10
a, b = map(int, input().split())
result = 0

while(a > 1):
    arr[a % b] += 1
    a = a // b

for i in range(10):
    result += arr[i] ** 2
print(result)