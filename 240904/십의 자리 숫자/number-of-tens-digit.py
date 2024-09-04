# 0 -> 10의 자리수 몇개인지 출력
arr = [0] * 10
num_arr = list(map(int, input().split()))

for i in num_arr:
    if i == 0:
        break
    num = i // 10
    arr[num] += 1

for j in range(1, 10):
    print(j, "-", arr[j])