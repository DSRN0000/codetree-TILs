# 0 -> 0 제외 차례로 출력
# 홀 -> +3
# 짝 -> /2

arr = list(map(int, input().split()))
new_arr = []

for i in arr:
    if i == 0:
        break
    new_arr.append(i)

for j in new_arr:
    if j % 2 == 0:
        print(j // 2, end = " ")
    if j % 2 != 0:
        print(j + 3, end = " ")