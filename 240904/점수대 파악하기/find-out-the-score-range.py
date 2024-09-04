# 0 -> 10점 단위 구분

arr = [0] * 11
num_arr = list(map(int, input().split()))

for i in num_arr:
    if i == 0:
        break
    num = i // 10
    arr[num] += 1

for j in range(10, 0, -1):
    print(j*10, "-", arr[j])